import java.util.Map;

public class Constant implements Expression {
    private int num;

    public Constant(int num) {
        this.num = num;
    }

    @Override
    public int calculate(Map<String, Integer> context) {
        return num;
    }
}
