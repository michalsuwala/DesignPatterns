public class NoPaper implements State {
    @Override
    public void print(Printer printer) {
        System.out.println("Out of paper.");
    }

    @Override
    public void refillPaper(Printer printer) {
        System.out.println("Refilling paper.");
        printer.setState(new Available());
    }

    @Override
    public void fixError(Printer printer) {
        System.out.println("No errors to fix.");
    }
}
