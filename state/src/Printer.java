public class Printer {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public Printer(State state) {
        this.state = state;
    }

    public void print() {
        state.print(this);
    }

    public void refillPaper() {
        state.refillPaper(this);
    }

    public void fixError() {
        state.fixError(this);
    }
}
