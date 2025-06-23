// Target Interface
interface PaymentProcessor {
    void processPayment(double amount);
}

// Adaptee 1
class StripeGateway {
    public void makeStripePayment(double amount) {
        System.out.println("Paid " + amount + " using Stripe.");
    }
}

// Adaptee 2
class PayPalGateway {
    public void makePayPalPayment(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}

// Adapter for Stripe
class StripeAdapter implements PaymentProcessor {
    StripeGateway stripe = new StripeGateway();

    public void processPayment(double amount) {
        stripe.makeStripePayment(amount);
    }
}

// Adapter for PayPal
class PayPalAdapter implements PaymentProcessor {
    PayPalGateway paypal = new PayPalGateway();

    public void processPayment(double amount) {
        paypal.makePayPalPayment(amount);
    }
}

class AdapterPatternTest {
    public static void main(String[] args) {
        PaymentProcessor processor1 = new StripeAdapter();
        processor1.processPayment(500);

        PaymentProcessor processor2 = new PayPalAdapter();
        processor2.processPayment(800);
    }
}