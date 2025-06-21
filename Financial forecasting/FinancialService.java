import java.util.*;

public class FinancialService {

    public double calculateAverageGrowth(List<FinancialData> dataList) {
        if (dataList.size() < 2) return 0;

        double totalGrowth = 0;
        for (int i = 1; i < dataList.size(); i++) {
            double growth = dataList.get(i).getRevenue() - dataList.get(i - 1).getRevenue();
            totalGrowth += growth;
        }

        return totalGrowth / (dataList.size() - 1);
    }

    public List<FinancialData> forecastRevenue(List<FinancialData> history, int monthsToForecast) {
        List<FinancialData> forecast = new ArrayList<>();
        double avgGrowth = calculateAverageGrowth(history);
        double lastRevenue = history.get(history.size() - 1).getRevenue();
        int lastMonth = history.get(history.size() - 1).getMonthNumber();

        for (int i = 1; i <= monthsToForecast; i++) {
            lastRevenue += avgGrowth;
            forecast.add(new FinancialData(lastMonth + i, lastRevenue));
        }

        return forecast;
    }
}
