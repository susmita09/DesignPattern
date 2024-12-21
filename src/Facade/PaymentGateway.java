package Facade;

public class PaymentGateway {
    public String initiatePaymentGateway(String cardNo){
        System.out.println("Connecting to payment gateway...");
        return "SESSION_123";
    }

    public void closePaymentGateway(String sessionId) {
        System.out.println("Closing gateway session: " + sessionId);
    }

}
