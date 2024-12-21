package Facade;

public class PaymentProcessor {
    public boolean processPayment(String cardNumber, double amount) {
        System.out.println("Processing payment of $" + amount);
        // Complex payment processing logic
        return true;
    }
}
