public class BreadBaker implements Baker{
    public BreadBaker() {
    }

    @Override
    public Product bake() {
        return new Bread();
    }
}
