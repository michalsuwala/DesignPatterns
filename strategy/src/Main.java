public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setPrintStrategy(new PrintColor());
        System.out.println(printer.print("Document"));
    }
}