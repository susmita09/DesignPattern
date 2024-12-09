package Adapter.PaymentGateway;


// The client uses the standard interface (PaymentProcessor) to process payments.
public class PaymentGateway {
   private  PaymentProcessor paymentProcessor;  // it can be paypal , stripe or any other processor

    public PaymentGateway(PaymentProcessor paymentProcessor){
        this.paymentProcessor = paymentProcessor;
    }

    public void processPayment(double amount){

        // this validation logic we had to give multiple times in client
        // //if there is no payment gateway class

        // Validate the payment amount
        if (amount <= 0) {
            System.out.println("Invalid payment amount: " + amount);
            return;
        }

        // Log the payment initiation
        System.out.println("Initiating payment of $" + amount);

        paymentProcessor.process(amount);
    }

}
