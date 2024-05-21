public abstract class CityDecorator implements City{
    protected City smallCity;

    public CityDecorator(City smallCity) {
        this.smallCity = smallCity;
    }

    @Override
    public String getInfrastructure() {
        return smallCity.getInfrastructure();
    }
}
