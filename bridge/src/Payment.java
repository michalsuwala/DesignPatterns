public abstract class Payment {
    protected PaymentProcessor processor;

    protected Payment(PaymentProcessor processor) {
        this.processor = processor;
    }

    public abstract void makePayment(double amount);
}