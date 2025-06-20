import java.util.Arrays;
import java.util.Comparator;

public class ProductSearch {

    public static void searchByName(Product[] products, String name) {
        boolean found = false;
        for (Product p : products) {
            if (p.name.toLowerCase().contains(name.toLowerCase())) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No product found with name: " + name);
        }
    }

    public static void searchByCategory(Product[] products, String category) {
        boolean found = false;
        for (Product p : products) {
            if (p.category.equalsIgnoreCase(category)) {
                p.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No product found in category: " + category);
        }
    }

    public static void searchByPrice(Product[] products, double price) {
        Arrays.sort(products, Comparator.comparingDouble(p -> p.price));

        int low = 0, high = products.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].price == price) {
                for (Product p : products) {
                    if (p.price == price) {
                        p.display();
                        found = true;
                    }
                }
                break;
            } else if (products[mid].price < price) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("No product found with price: $" + price);
        }
    }
}
