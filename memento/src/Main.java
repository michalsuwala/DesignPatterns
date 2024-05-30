public class Main {
    public static void main(String[] args) {
        RGBColor color = new RGBColor(255, 0, 0);
        Caretaker caretaker = new Caretaker();

        System.out.println(color);
        caretaker.saveState(color);

        color.setGreen(255);
        System.out.println(color);

        caretaker.restoreState(color);
        System.out.println(color);
    }
}
