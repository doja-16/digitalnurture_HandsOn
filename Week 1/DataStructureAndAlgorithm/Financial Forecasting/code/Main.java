public class Main {
    public static void main(String[] args) {
        // Sample revenue and expense for 12 months
        double[] revenues = {50, 60, 55, 70, 65, 80, 90, 85, 75, 95, 100, 110};
        double[] expenses = {30, 40, 35, 50, 45, 60, 70, 65, 55, 70, 80, 85};

        FinancialData data = new FinancialData(revenues, expenses);
        double predictedProfit = data.calculateTotalNetProfit();

        System.out.printf("Predicted Financial Value (Annual Net Profit): ₹%.2f\n", predictedProfit);
    }
}
