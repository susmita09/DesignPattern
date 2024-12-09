package Adapter.PaymentGateway;

// adaptee 2 . Stripe API
public class StripeApi {
    public  void chargeCard(double amount){
        System.out.println("Payment of $" + amount + " processed via Stripe.");
    }
}
