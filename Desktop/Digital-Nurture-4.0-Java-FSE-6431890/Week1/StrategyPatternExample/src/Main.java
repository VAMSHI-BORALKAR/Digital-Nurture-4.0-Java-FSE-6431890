public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        context.makePayment(250.00);

        context.setPaymentStrategy(new PayPalPayment("vamshi@example.com"));
        context.makePayment(500.00);
    }
}
