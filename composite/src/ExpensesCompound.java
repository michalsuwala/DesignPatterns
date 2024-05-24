import java.util.ArrayList;
import java.util.List;

public class ExpensesCompound implements Expenses{
    private List<Expenses> days;
    @Override
    public String getExpenses() {
        StringBuilder expenses = new StringBuilder();
        for (Expenses e : days) {
            expenses.append(e.getExpenses()).append("\n");
        }
        return expenses.toString();
    }

    @Override
    public int getMoneyValue() {
        int val = 0;
        for (Expenses e : days) {
            val += e.getMoneyValue();
        }
        return val;
    }

    public void add(Expenses e) {
        days.add(e);
    }

    public ExpensesCompound() {
        this.days = new ArrayList<>();
    }
}
