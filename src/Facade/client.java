package Facade;


//Example usage in an e-commerce application
public class client {
    public static void main(String[] args) {
        //simple way using facade
        PaymentFacade paymentFacade = new PaymentFacade();
        paymentFacade.processPayment("4532756279624589",
                "123",
                99.99,
                "customer@email.com");



        // Complex way without Facade
        System.out.println("\nWithout Facade (complex way):");
        PaymentValidator validator = new PaymentValidator();
        FraudCheck fraudChecker = new FraudCheck();
        PaymentProcessor processor = new PaymentProcessor();
        PaymentGateway gateway = new PaymentGateway();
        NotificationService notificationService = new NotificationService();

        String sessionId = gateway.initiatePaymentGateway("4532756279624589");
        if (validator.validatePaymentDetails("4532756279624589", "123")) {
            if (fraudChecker.checkForFraud("4532756279624589", 99.99)) {
                if (processor.processPayment("4532756279624589", 99.99)) {
                    notificationService.sendNotification(
                            "customer@email.com",
                            "Payment successful for $99.99"
                    );
                }
            }
        }
        gateway.closePaymentGateway(sessionId);
    }
}
