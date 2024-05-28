public class PrintColor implements PrintStrategy{
    @Override
    public String print(String document) {
        return "Color: " + document;
    }
}
