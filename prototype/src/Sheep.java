public class Sheep implements SheepPrototype {
    private String colour;

    public String getColour() {
        return colour;
    }

    public Sheep(String colour) {
        this.colour = colour;
    }

    @Override
    public SheepPrototype clone() {
        return new Sheep(this.colour);
    }
}
