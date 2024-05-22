public class StewDish implements MainDish{
    @Override
    public Meat createMeat() {
        return new Stew();
    }

    @Override
    public Additions createAdditions() {
        return new Groats();
    }
}
