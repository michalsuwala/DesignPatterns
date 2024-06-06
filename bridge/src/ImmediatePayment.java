public class ImmediatePayment extends Payment {
    public ImmediatePayment(PaymentProcessor processor) {
        super(processor);
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("Immediate payment of $" + amount);
        processor.processPayment(amount);
    }
}
