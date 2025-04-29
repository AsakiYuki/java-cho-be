public class Order {
    private String orderId;
    private Customer customer;
    private String orderDate;

    public Order(String orderId, Customer customer, String orderDate) {
        this.orderId = orderId;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    public void displayOrderDetails() {
        System.out.println("Mã đơn hàng: " + orderId);
        System.out.println("Ngày đặt hàng: " + orderDate);
        System.out.println("Khách hàng: " + customer.getName() + " (ID: " + customer.getId() + ")");
        System.out.println("Danh sách sản phẩm đã mua:");
        for (Product p : customer.getPurchasedProducts()) {
            System.out.println("- " + p.getName());
        }
    }
}
