import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SearchService searchService = new SearchService();

        System.out.print("Enter search keyword: ");
        String keyword = sc.nextLine();

        List<Product> results = searchService.search(keyword);

        if (results.isEmpty()) {
            System.out.println("No products found matching: " + keyword);
        } else {
            System.out.println("Search results:");
            for (Product p : results) {
                System.out.println(p);
            }
        }
    }
}
