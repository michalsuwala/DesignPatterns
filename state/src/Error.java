public class Error implements State {
    @Override
    public void print(Printer printer) {
        System.out.println("Can't print, printer error.");
    }

    @Override
    public void refillPaper(Printer printer) {
        System.out.println("Can't refill paper, printer error.");
    }

    @Override
    public void fixError(Printer printer) {
        System.out.println("Fixing error.");
        printer.setState(new Available());
    }
}
