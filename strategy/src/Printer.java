public class Printer {
    private PrintStrategy printStrategy;
    public String print(String document) {
        return printStrategy.print(document);
    }

    public void setPrintStrategy(PrintStrategy printStrategy) {
        this.printStrategy = printStrategy;
    }

    public Printer() {
    }
}
