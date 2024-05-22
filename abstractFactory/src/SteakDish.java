public class SteakDish implements MainDish{
    @Override
    public Meat createMeat() {
        return new Steak();
    }

    @Override
    public Additions createAdditions() {
        return new BakedPotatoes();
    }
}
