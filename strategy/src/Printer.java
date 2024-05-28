public class Printer {
    private PrintStrategy printStrategy;
    public String print(String document) {
        return printStrategy.print(document);
    }

    public void setPrintStrategy(int strategyId) {
        if (strategyId == 0) {
            printStrategy = new PrintColor();
        }
        else if (strategyId == 1) {
            printStrategy = new PrintWithoutColor();
        }
    }

    public Printer() {
    }
}
