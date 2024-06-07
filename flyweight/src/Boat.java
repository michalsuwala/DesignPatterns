public class Boat {
    private String name;
    private Engine engine;
    public Boat(String name, String engineModel) {
        this.name = name;
        this.engine = EngineFactory.getEngine(engineModel);
    }

    public String getDescription() {
        return "Boat name: " + name + "\nEngine model: " + engine.getModel();
    }
}
