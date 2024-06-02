public interface State {
    void print(Printer printer);
    void refillPaper(Printer printer);
    void fixError(Printer printer);
}
