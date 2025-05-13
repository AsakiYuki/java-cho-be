import java.text.DecimalFormat;

public class Main {
    static DecimalFormat df = new DecimalFormat("#.##");
    
    // Tạo một object Electronics, gọi calculatePrice() và displayInfo().
    static void cau1() {
        Electronics electronics = new Electronics("Laptop", 35000000, 1);

        float totalPrice = electronics.calculatePrice();
        System.out.println("Total price: " + df.format(totalPrice) + " VND");

        electronics.displayInfo();
    }

    // Tạo một mảng các Payable gồm nhiều loại (Book, Clothing, Electronics), sau đó tính tổng tiền tất cả sản phẩm.
    static void cau2() {
        Payable[] products = {
            new Book("Anh ba ke chuyen", 125000, 1),
            new Clothing("Polo", 500000, "L"),
            new Electronics("Laptop", 35000000, 2)
        };

        double total = 0;
        for (Payable product : products) {
            total += product.calculatePrice();
        }

        System.out.println("Total: " + df.format(total) + " VND");
    }
    
    // In ra danh sách các sản phẩm có Statistical với số lượng đã bán > 100
    static void cau3() {
        Statistical[] products = {
            new Book("Anh ba ke chuyen", 125000, 12),
            new Electronics("Laptop", 35000000, 2),
            new Electronics("Dien tro", 2500, 125),
            new Electronics("Tu dien", 2500, 101),
            new Book("Kiet saygex", 125000, 2)
        };

        for (Statistical product : products) {
            if (product.getSoldQuantity() > 100)
                System.out.println(getStatisticalProductInfo(product));
        }
    }

    // Viết hàm nhận vào một List<Statistical> và trả về sản phẩm có số lượng bán cao nhất.
    static void cau4() {
        Statistical[] products = {
            new Book("Anh ba ke chuyen", 125000, 12),
            new Electronics("Laptop", 35000000, 2),
            new Electronics("Dien tro", 2500, 125),
            new Electronics("Tu dien", 2500, 101),
            new Book("Kiet saygex", 125000, 2)
        };

        Statistical highestSoldProduct = getHighestSoldQuantityProduct(products);
        System.out.println(getStatisticalProductInfo(highestSoldProduct));
    }

    // Viết một phương thức nhận vào danh sách Displayable, in ra tất cả thông tin sản phẩm, nhưng nếu là Book
    static void cau5() {
        Displayable[] products = {
            new Book("Anh ba ke chuyen", 125000, 12),
            new Electronics("Laptop", 35000000, 2),
            new Electronics("Dien tro", 2500, 125),
            new Electronics("Tu dien", 2500, 101),
            new Book("Kiet saygex", 125000, 2)
        };

        displayBookInfo(products);
    }

    // Print only Book info
    static void displayBookInfo(Displayable[] products) {
        for (Displayable product : products) {
            if (product instanceof Book)
                product.displayInfo();
        }
    }

    // Get highest sold quantity product
    static Statistical getHighestSoldQuantityProduct(Statistical[] products) {
        int currentHighestProductIndex = 0;

        for (int i = 0; i < products.length; i++) {
            if (products[i].getSoldQuantity() > products[currentHighestProductIndex].getSoldQuantity())
                currentHighestProductIndex = i;
        }

        return products[currentHighestProductIndex];
    }

    // Get statistical product info
    static String getStatisticalProductInfo(Statistical product) {
        if (product instanceof Book)
            return String.format("%s x%d", ((Book)product).title, product.getSoldQuantity());
        else if (product instanceof Electronics)
            return String.format("%s x%d", ((Electronics)product).name, product.getSoldQuantity());
        return "";
    }

    // NVM
    public static void main(String[] args) {
        System.out.println("Cau 1:");
        cau1();
        System.out.println("\nCau 2:");
        cau2();
        System.out.println("\nCau 3:");
        cau3();
        System.out.println("\nCau 4:");
        cau4();
        System.out.println("\nCau 5:");
        cau5();
    }
}