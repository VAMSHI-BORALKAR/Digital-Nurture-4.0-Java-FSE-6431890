public class PayPalAdapter implements PaymentProcessor {
    private PayPal paypal;

    public PayPalAdapter(PayPal paypal) {
        this.paypal = paypal;
    }

    public void processPayment(double amount) {
        paypal.sendMoney(amount);
    }
}
