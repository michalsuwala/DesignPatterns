public class Main {

    public static void main(String[] args) {
        SteakDish steakDish = new SteakDish();
        Meat meat = steakDish.createMeat();
        Additions additions = steakDish.createAdditions();
        System.out.println(meat.getType());
        System.out.println(additions.getType());
    }
}
