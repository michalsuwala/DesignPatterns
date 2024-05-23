public class Main {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("blue");
        Sheep sheep2 = (Sheep) sheep.clone();
        System.out.println(sheep2.getColour());
    }
}
