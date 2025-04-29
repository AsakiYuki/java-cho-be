public class RegularProduct extends Product {
    public RegularProduct(String id, String name , double price){
        super(id,name,price);
    }
    @Override
    public double calculateTotalPrice( int quantity) {
        return price * quantity;
    }
}
