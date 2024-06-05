import java.util.Objects;

public class Meat extends BaseHandler {
    @Override
    protected boolean canHandle(Animal request) {
        return Objects.equals(request.diet, "Carnivorous");
    }

    @Override
    protected void processRequest(Animal request) {
        System.out.println(request.species + " got meat.");
    }
}
