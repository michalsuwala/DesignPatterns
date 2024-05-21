public class Hospital extends CityDecorator{
    String name;
    public Hospital(City smallCity, String name) {
        super(smallCity);
        this.name = name;
    }

    @Override
    public String getInfrastructure() {
        return super.getInfrastructure() + ", " + name;
    }
}

