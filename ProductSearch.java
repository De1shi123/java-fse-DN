import java.util.Arrays;
import java.util.Comparator;

class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}

public class ProductSearch    
 {

    // Linear Search: O(n)
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search: O(log n)
    public static Product binarySearch(Product[] products, String targetName) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int compareResult = products[mid].productName.compareToIgnoreCase(targetName);

            if (compareResult == 0)
             {
                return products[mid];
             } 
              else if (compareResult < 0) 
              {
                low = mid + 1;
              }  
              else
              {
                high = mid - 1;
              }
        }
        return null;
    }

    public static void main(String[] args) {
        // Sample products
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shirt", "Clothing"),
            new Product(103, "Book", "Education"),
            new Product(104, "Mobile", "Electronics"),
            new Product(105, "Shoes", "Footwear")
        };

        // Linear Search 
        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, "Mobile");
        System.out.println(result1 != null ? result1 : "Product not found");

        // Binary Search 
        Arrays.sort(products, Comparator.comparing(p -> p.productName.toLowerCase()));

        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(products, "Mobile");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}  
