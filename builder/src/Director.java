public class Director {
    private Builder builder;

    public Garden createCountryGarden() {
        this.builder = new CountryGardenBuilder();
        builder.prepareGround(3000);
        builder.sowGrass(1000);
        builder.plantTrees("many");
        builder.digPond();
        return builder.getResult();
    }
}
