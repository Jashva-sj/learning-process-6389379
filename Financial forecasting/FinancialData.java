public class FinancialData {
    private int monthNumber;
    private double revenue;

    public FinancialData(int monthNumber, double revenue) {
        this.monthNumber = monthNumber;
        this.revenue = revenue;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public double getRevenue() {
        return revenue;
    }
}
