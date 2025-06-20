import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Laptop", "Electronics", 750.00),
            new Product("Shirt", "Clothing", 29.99),
            new Product("Phone", "Electronics", 499.99),
            new Product("Shoes", "Footwear", 59.99),
            new Product("Book", "Stationery", 15.00)
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Search by Name (Linear)");
        System.out.println("2. Search by Category (Linear)");
        System.out.println("3. Search by Price (Binary)");
        System.out.print("Choose option: ");
        int option = sc.nextInt();
        sc.nextLine(); // clear input buffer

        switch (option) {
            case 1:
                System.out.print("Enter name to search: ");
                String name = sc.nextLine();
                ProductSearch.searchByName(products, name);
                break;
            case 2:
                System.out.print("Enter category to search: ");
                String category = sc.nextLine();
                ProductSearch.searchByCategory(products, category);
                break;
            case 3:
                System.out.print("Enter price to search: ");
                double price = sc.nextDouble();
                ProductSearch.searchByPrice(products, price);
                break;
            default:
                System.out.println("Invalid option.");
        }

        sc.close();
    }
}
