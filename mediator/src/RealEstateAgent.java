import java.util.ArrayList;
import java.util.List;

public class RealEstateAgent implements Mediator {
    private List<Seller> sellers = new ArrayList<>();
    private List<Buyer> buyers = new ArrayList<>();

    @Override
    public void addSeller(Seller seller) {
        sellers.add(seller);
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
    }

    @Override
    public void send(String message, Participant participant) {
        if (participant instanceof Seller) {
            for (Buyer buyer : buyers) {
                buyer.receive(message);
            }
        } else if (participant instanceof Buyer) {
            for (Seller seller : sellers) {
                seller.receive(message);
            }
        }
    }
}
