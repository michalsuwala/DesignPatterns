public class Main {
    public static void main(String[] args) {
        City city = new School(new SmallCity("Groszek"), "Szkoła Podstawowa im. Henryka Sienkiewicza");
        System.out.println(city.getInfrastructure());
    }
}
