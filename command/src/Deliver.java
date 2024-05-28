public class Deliver implements Command{
    private Postman postman;

    public Deliver(Postman postman) {
        this.postman = postman;
    }

    @Override
    public void execute() {
        postman.deliverLetters();
    }
}
