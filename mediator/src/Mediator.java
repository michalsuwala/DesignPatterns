public interface Mediator {
    void addSeller(Seller seller);
    void addBuyer(Buyer buyer);
    void send(String message, Participant participant);
}
