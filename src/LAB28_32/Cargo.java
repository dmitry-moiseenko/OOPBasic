package LAB28_32;

public class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL=550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment() {
        return tonnage*DEFAULT_RENTAL;
    }

    public float calculatePayment(float RentTaxNegative) {
        float result = tonnage*RentTaxNegative;
        if (RentTaxNegative <= 0){
            return tonnage*DEFAULT_RENTAL;
        }
        return result;
    }

}