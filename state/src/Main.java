public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(new Available());

        printer.print();
        printer.fixError();

        printer.setState(new Error());
        printer.print();
        printer.fixError();
        printer.print();
    }
}