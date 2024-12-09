package Adapter.PaymentGateway;

public class StripeAdapter implements PaymentProcessor{

    private StripeApi stripeApi;

    public StripeAdapter(StripeApi stripeApi){
        this.stripeApi = stripeApi;
    }
    @Override
    public void process(double amount) {
       stripeApi.chargeCard(amount);
    }
}
