public class DiscountedProduct extends Product{
    private double discountRate;

        public DiscountedProduct(String id, String name , double price , double discountRate){
        super(id , name , price);
        this.discountRate = discountRate;
    }
    @Override
    public double calculateTotalPrice(int quantity){
        return price * quantity * (1 - discountRate);
    }
}
