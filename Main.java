public class Main {
    public static void main(String[] args) {
        RegularProduct product = new RegularProduct("A001", "cookies", 10.5);
        int quantity = 5;
        double totalPrice = product.calculateTotalPrice(quantity);
        System.out.println("Tổng giá tiền khi mua " + quantity + " sản phẩm: " + totalPrice);//cau1

        Product discountedProduct = new DiscountedProduct("A002", "Milk", 20.0, 0.15);
        double discountedTotalPride = discountedProduct.calculateTotalPrice(3);
        System.out.println("Tổng giá tiền sau giảm khi mua 3 sản phẩm: " + discountedTotalPride); //cau2

        Customer customer = new Customer("Cain" , "C002");
        Product p1 = new RegularProduct("C101", "Bút bi", 5.0);
        Product p2 = new DiscountedProduct("C102", "Vở học sinh", 20.0, 0.25);

        customer.addProduct(p1);
        customer.addProduct(p2);

        double totalOrder = customer.calculateTotalOrder();
        System.out.println("Tổng giá trị đơn hàng: " + totalOrder);
    }
}