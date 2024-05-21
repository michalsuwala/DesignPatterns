public class School extends CityDecorator{
    String name;
    public School(City smallCity, String name) {
        super(smallCity);
        this.name = name;
    }

    @Override
    public String getInfrastructure() {
        return super.getInfrastructure() + ", " + name;
    }
}
