package LAB28_32;

/**
 * Created by Dmitriy on 5/8/2018.
 */
public class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volme) {
        super(name, length, width, displacement);
        this.volume = volme;
    }

    @Override
    public float calculatePayment() {
        return volume*DEFAULT_RENTAL;
    }

    public float calculatePayment(float RentTaxNegative) {
        float result = volume*RentTaxNegative;
        if (RentTaxNegative <= 0){
            return volume*DEFAULT_RENTAL;
        }
        return result;
    }
}
