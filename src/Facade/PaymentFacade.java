package Facade;

public class PaymentFacade {
    private PaymentValidator paymentValidator;
    private PaymentProcessor paymentProcessor;
    private FraudCheck fraudCheck;
    private NotificationService notificationService;
    private PaymentGateway paymentGateway;

    public  PaymentFacade(){
        paymentValidator = new PaymentValidator();
        paymentProcessor = new PaymentProcessor();
        paymentGateway = new PaymentGateway();
        notificationService = new NotificationService();
        fraudCheck = new FraudCheck();
    }

    public boolean processPayment(String cardNo, String cvv, double amount, String email){
        System.out.println("starting Processing Payment...");

        //Initialize payment gateway
        String sessionId = paymentGateway.initiatePaymentGateway(cardNo);

        try{
            //step 1 Validate card
            if(! paymentValidator.validatePaymentDetails(cardNo,cvv)){
                notificationService.sendNotification(email,"Invalid Card Number");
            }

            // step 2 check for fraud
            if(!fraudCheck.checkForFraud(cardNo,amount)){
                notificationService.sendNotification(email,"Payment Failed : fraud");
            }

            // step 3 process payment
            if(!paymentProcessor.processPayment(cardNo, amount)){
                notificationService.sendNotification(email,"Payment Failed : processing error");
            }

            // Step 4: Notify success
            notificationService.sendNotification(email, "Payment successful for $" + amount);
            return true;
        }
        finally{
            paymentGateway.closePaymentGateway(sessionId);
        }
    }
}
