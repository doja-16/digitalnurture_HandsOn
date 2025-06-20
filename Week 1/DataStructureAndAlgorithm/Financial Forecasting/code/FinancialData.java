public class FinancialData {
    double[] revenues;
    double[] expenses;

    public FinancialData(double[] revenues, double[] expenses) {
        this.revenues = revenues;
        this.expenses = expenses;
    }

    public double calculateTotalNetProfit() {
        double total = 0;
        for (int i = 0; i < revenues.length; i++) {
            total += (revenues[i] - expenses[i]);
        }
        return total;
    }
}
