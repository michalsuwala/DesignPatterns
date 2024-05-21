public class SmallCity implements City {
    public SmallCity(String shop) {
        this.shop = shop;
    }

    String shop;
    @Override
    public String getInfrastructure() {
        return "Sklep: " + shop;
    }
}
