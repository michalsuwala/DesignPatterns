public class Main {
    public static void main(String[] args) {
        RealEstateAgent mediator = new RealEstateAgent();

        Seller seller1 = new Seller("Seller1", mediator);
        Seller seller2 = new Seller( "Seller2", mediator);

        Buyer buyer1 = new Buyer("Buyer1", mediator);
        Buyer buyer2 = new Buyer( "Buyer2", mediator);

        mediator.addBuyer(buyer1);
        mediator.addBuyer(buyer2);
        mediator.addSeller(seller1);
        mediator.addSeller(seller2);

        seller1.send("I have a house for sale with a price of $300,000.");
        buyer1.send("I am interested in buying a house with a budget of $250,000.");
    }
}