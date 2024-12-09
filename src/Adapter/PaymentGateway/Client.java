package Adapter.PaymentGateway;

public class Client {

    //client want to make payment through one of the processor
    public static void main(String[] args){
        // using the paypal
        PaypalApi paypalApi = new PaypalApi();
        PaymentProcessor paypalProcessor = new PaypalAdapter(paypalApi);
        PaymentGateway payPalGateway = new PaymentGateway(paypalProcessor);
        payPalGateway.processPayment(299.00);


        // Using Stripe Adapter
        StripeApi stripe = new StripeApi();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripe);
        PaymentGateway stripeGateway = new PaymentGateway(stripeProcessor);
        stripeGateway.processPayment(200.0);

    }
}
