public class CakeBaker implements Baker {
    public CakeBaker() {
    }

    @Override
    public Product bake() {
        return new Cake();
    }
}
