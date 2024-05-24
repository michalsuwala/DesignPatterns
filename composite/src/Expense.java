public class Expense implements Expenses{
    private String expense;
    private int value;
    @Override
    public String getExpenses() {
        return expense;
    }

    @Override
    public int getMoneyValue() {
        return value;
    }

    public Expense(String expense, int value) {
        this.expense = expense;
        this.value = value;
    }
}
