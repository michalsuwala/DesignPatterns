import java.util.Map;

public class Addition implements Expression {
    private Expression left;
    private Expression right;

    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int calculate(Map<String, Integer> context) {

        return left.calculate(context) + right.calculate(context);
    }
}
