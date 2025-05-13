import java.text.DecimalFormat;

public class Electronics implements Payable, Statistical, Displayable {
    DecimalFormat df = new DecimalFormat("#.##");

    String name;
    float unitPrice;
    int quantitySold;

    Electronics(String name, float unitPrice, int quantitySold) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantitySold = quantitySold;
    }

    @Override
    public float calculatePrice() {
        return unitPrice * quantitySold;
    }

    @Override
    public void displayInfo() {
        System.out.printf("%s: %s VND\n", name, df.format(unitPrice));
    }

    @Override
    public int getSoldQuantity() {
        return quantitySold;
    }
}
