public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Garden garden = director.createCountryGarden();
        System.out.println(garden.description);
    }
}