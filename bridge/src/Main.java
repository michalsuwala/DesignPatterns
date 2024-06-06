public class Main {
    public static void main(String[] args) {
        PaymentProcessor creditCard = new CreditCardProcessor();

        Payment immCreditCard = new ImmediatePayment(creditCard);
        immCreditCard.makePayment(100.0);
    }
}