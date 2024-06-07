import java.util.HashMap;
import java.util.Map;

public class EngineFactory {
    private static final Map<String, Engine> engines = new HashMap<>();

    public static Engine getEngine(String model) {
        Engine engine = engines.get(model);
        if (engine == null) {
            engine = new Engine(model);
            engines.put(model, engine);
        }
        return engine;
    }
}
