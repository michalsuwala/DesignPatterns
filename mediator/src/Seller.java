public class Seller implements Participant {
    private String name;
    private Mediator mediator;

    public Seller(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receives message: " + message);
    }
}
