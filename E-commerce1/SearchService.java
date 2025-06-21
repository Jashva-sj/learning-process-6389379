import java.util.*;

public class SearchService {
    public List<Product> search(String keyword) {
        List<Product> allProducts = ProductDatabase.getAllProducts();
        List<Product> result = new ArrayList<>();

        for (Product p : allProducts) {
            if (p.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                p.getCategory().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(p);
            }
        }
        return result;
    }
}
