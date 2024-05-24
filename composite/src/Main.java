public class Main {
    public static void main(String[] args) {
        Expenses e1 = new Expense("Mleko: 4zł", 4);
        Expenses e2 = new Expense("Chleb: 4zł", 4);
        Day d1 = new Day();
        d1.add(e1);
        d1.add(e2);
        ExpensesCompound compound = new ExpensesCompound();
        compound.add(d1);
        System.out.println(compound.getExpenses());
    }
}
