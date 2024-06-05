public class Main {
    public static void main(String[] args) {
        Animal deer = new Animal("Deer", "Herbivorous");
        Animal bear = new Animal("Bear", "candies");

        Handler grain = new Grain();
        Handler meat = new Meat();

        grain.setNextHandler(meat);

        grain.handle(deer);
        grain.handle(bear);
    }
}