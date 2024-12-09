package Adapter.PaymentGateway;


// Convert the target interface calls to the Adaptee API.
public class PaypalAdapter implements PaymentProcessor {

    private PaypalApi paypalApi;

    public PaypalAdapter(PaypalApi paypalApi){
        this.paypalApi = paypalApi;
    }

    @Override
    public void process(double amount) {
         paypalApi.sendMoney(amount);
    }
}
