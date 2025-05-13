import java.text.DecimalFormat;

public class Book implements Payable, Statistical, Displayable {
    DecimalFormat df = new DecimalFormat("#.##");
    
    String title;
    float unitPrice;
    int copiesSold;

    Book(String title, float unitPrice, int copiesSold) {
        this.title = title;
        this.unitPrice = unitPrice;
        this.copiesSold = copiesSold;
    }

    @Override
    public float calculatePrice() {
        return unitPrice * copiesSold;
    }

    @Override
    public int getSoldQuantity() {
        return copiesSold;
    }

    @Override
    public void displayInfo() {
        System.out.printf("%s: %s VND\n", title, df.format(unitPrice));
    }
}
