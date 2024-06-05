import java.util.Objects;

public class Grain extends BaseHandler {
    @Override
    protected boolean canHandle(Animal request) {
        return Objects.equals(request.diet, "Herbivorous");
    }

    @Override
    protected void processRequest(Animal request) {
        System.out.println(request.species + " got grain.");
    }
}
