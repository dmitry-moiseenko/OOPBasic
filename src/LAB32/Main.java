package LAB32;

import java.util.ArrayList;

/**
 * Created by Dmitriy on 5/9/2018.
 */
public class Main {
}

class Liner extends AbstractShip {

    private int passengers;
    public static final float DEFAULT_RENTAL = 1000;

    public Liner(String name, float length, float width, float displacement, int passengers) {
        super(name, length, width, displacement);
        this.passengers = passengers;
    }

    @Override
    public float calculatePayment() {
        return passengers * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return passengers * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

abstract class AbstractShip {
    private String name;
    private float length;
    private float width;
    private float displacement;

    public AbstractShip(String name, float length, float width, float displacement) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.displacement = displacement;
    }

    public abstract float calculatePayment();

    public String toPrint() {
        return "Name=" + name +
                "Length=" + length +
                "Width=" + width +
                "Displacement=" + displacement;
    }

    public String getName() {
        return name;
    }
}


class Tanker extends AbstractShip {
    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return volume * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

class Cargo extends AbstractShip {
    private float tonnage;
    public static final float DEFAULT_RENTAL=550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment() {
        return tonnage * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return tonnage * rentTax;
        } else {
            return calculatePayment();
        }
    }
}

class OdessaSeaPort {

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {
        if (arrayShips == null) {
            return "";
        }
        ArrayList<AbstractShip> arrayList = new ArrayList<AbstractShip>();
        String result = "";
        for (int i = 0; i < arrayShips.length; i++) {
            arrayList.add(arrayShips[i]);

        }
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = arrayList.size() - 1; j > i; j--) {
                if (arrayList.get(j).calculatePayment() < arrayList.get(j - 1).calculatePayment()) {
                    arrayList.add(arrayList.get(j));
                    arrayList.set(j, arrayList.get(j - 1));
                    arrayList.set(j - 1, arrayList.get(arrayList.size() - 1));
                    arrayList.remove(arrayList.size() - 1);
                }
            }
        }

        for (int i = 0; i < arrayList.size(); i++) {
            result += arrayList.get(i).getName() + "=" + arrayList.get(i).calculatePayment();
        }

        return result;

    }

}
