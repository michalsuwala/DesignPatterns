public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setPrintStrategy(0);
        System.out.println(printer.print("Document"));
    }
}