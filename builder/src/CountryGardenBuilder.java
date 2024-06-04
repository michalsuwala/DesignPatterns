public class CountryGardenBuilder implements Builder {
    private Garden garden;
    @Override
    public void prepareGround(int area) {
        garden = new Garden();
        garden.description += "Garden spreads over " + area + " square meters. ";
    }

    @Override
    public void sowGrass(int area) {
        garden.description += "It has a lawn covering " + area + " square meters. ";
    }

    @Override
    public void plantTrees(String quantity) {
        garden.description += "The garden is home to " + quantity + " trees. ";
    }

    @Override
    public void buildInfrastructure(String infrastructure) {
        garden.description += "It features a " + infrastructure + ". ";
    }

    @Override
    public void digPond() {
        garden.description += "Garden has pond. ";
    }

    @Override
    public Garden getResult() {
        return garden;
    }
}
