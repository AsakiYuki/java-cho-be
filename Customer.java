import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String id;
    private List<Product> purchasedProducts;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
        this.purchasedProducts = new ArrayList<>();
    }

    public void addProduct(Product product) {
        purchasedProducts.add(product);
    }
    // private List<Product> getPurchasedProducts = new ArrayList<>();

    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }
    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }

    public double calculateTotalOrder() {
        double totalOrder = 0;
        for (Product product : purchasedProducts) {
            totalOrder += product.calculateTotalPrice(1);
        }
        return totalOrder;
    }
}
