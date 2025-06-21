import java.util.*;

public class ProductDatabase {
    public static List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone 15", "Electronics"));
        products.add(new Product("Samsung Galaxy", "Electronics"));
        products.add(new Product("Bluetooth Headphones", "Electronics"));
        products.add(new Product("Coffee Mug", "Kitchen"));
        products.add(new Product("Running Shoes", "Footwear"));
        products.add(new Product("Phone Case", "Accessories"));
        return products;
    }
}
