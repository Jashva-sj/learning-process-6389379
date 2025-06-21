import java.util.*;

public class ForecastApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<FinancialData> pastData = new ArrayList<>();

        System.out.println("Enter number of months of data:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter revenue for month " + i + ": ");
            double revenue = sc.nextDouble();
            pastData.add(new FinancialData(i, revenue));
        }

        FinancialService service = new FinancialService();

        List<FinancialData> forecast = service.forecastRevenue(pastData, 6);

        System.out.println("\nForecast for next 6 months:");
        for (FinancialData fd : forecast) {
            System.out.printf("Month %d: %.2f\n", fd.getMonthNumber(), fd.getRevenue());
        }
    }
}
