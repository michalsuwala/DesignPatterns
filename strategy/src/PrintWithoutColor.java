public class PrintWithoutColor implements PrintStrategy{
    @Override
    public String print(String document) {
        return "No color: " + document;
    }
}
