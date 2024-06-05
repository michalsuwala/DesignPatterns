public abstract class BaseHandler implements Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Animal request) {
        if (canHandle(request)) {
            processRequest(request);
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println(request.species + " got no food.");
        }
    }

    protected abstract boolean canHandle(Animal request);
    protected abstract void processRequest(Animal request);
}
