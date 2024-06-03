import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Expression c3 = new Constant(3);
        Expression x = new Variable("x");
        Expression sum = new Addition(c3, x);
        Expression expression = new Subtraction(sum, x);

        Map<String, Integer> context = new HashMap<>();
        context.put("x", 2);

        System.out.println(expression.calculate(context));
    }
}