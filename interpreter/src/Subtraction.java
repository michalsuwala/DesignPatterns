import java.util.Map;

public class Subtraction implements Expression {
    private Expression left;
    private Expression right;

    public Subtraction(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int calculate(Map<String, Integer> context) {

        return left.calculate(context) - right.calculate(context);
    }
}
