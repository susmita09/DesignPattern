package Adapter.PaymentGateway;

// existing payment provider API

// Adaptee 1.  Paypal API
public class PaypalApi {
    public void sendMoney(double amount){
        System.out.println("Payment of $" + amount + " processed via PayPal.");
    }
}
