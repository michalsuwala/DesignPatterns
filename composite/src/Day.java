import java.util.ArrayList;
import java.util.List;

public class Day implements Expenses{

    private List<Expenses> expensesList;
    @Override
    public String getExpenses() {
        StringBuilder expenses = new StringBuilder();
        for (Expenses e : expensesList) {
            expenses.append(e.getExpenses()).append("\n");
        }
        return expenses.toString();
    }

    @Override
    public int getMoneyValue() {
        int val = 0;
        for (Expenses e : expensesList) {
            val += e.getMoneyValue();
        }
        return val;
    }

    public void add(Expenses e) {
        expensesList.add(e);
    }

    public Day() {
        this.expensesList = new ArrayList<>();
    }
}
