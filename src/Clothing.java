public class Clothing implements Payable, Displayable {
    String brand;
    float price;
    String size;
    
    Clothing(String brand, float price, String size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }

    @Override
    public float calculatePrice() {
        return price;
    }

    @Override
    public void displayInfo() {
        System.out.printf("%s: %s\n", brand, size);
    }
}
