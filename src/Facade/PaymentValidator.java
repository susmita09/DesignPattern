package Facade;

// Complex subsystems for payment processing
public class PaymentValidator {
    public boolean validatePaymentDetails(String cardNumber, String CVV) {
        System.out.println("Validating card: " + cardNumber.substring(cardNumber.length()-4));
        // Complex validation logic
        return true;
    }
}
