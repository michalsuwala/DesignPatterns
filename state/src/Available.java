class Available implements State {
    @Override
    public void print(Printer printer) {
        System.out.println("Printing.");
    }

    @Override
    public void refillPaper(Printer printer) {
        System.out.println("Can't refill paper while printing.");
    }

    @Override
    public void fixError(Printer printer) {
        System.out.println("No errors to fix.");
    }
}

