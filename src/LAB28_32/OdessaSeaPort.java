package LAB28_32;

import java.util.ArrayList;

class OdessaSeaPort implements SeaPortQueue {
    private static final int NO_SHIP_IN_ARRAY = -1;
    private int indexShipInPort = NO_SHIP_IN_ARRAY;
    private AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];

    @Override
    public int addShipToEndQueue(AbstractShip ship) {
        if (indexShipInPort == 2) {
            return -1;
        }
        indexShipInPort++;
        for (int indexInArrayShip = indexShipInPort; indexInArrayShip < LENGTH_QUEUE_SHIP; indexInArrayShip++) {
            arrayShip[indexInArrayShip] = ship;
            return indexInArrayShip;
        }
        return -1;
    }

    @Override
    public int removeShipFromBeginQueue() {
        if (arrayShip[0] == null) {
            return -1;
        }
        AbstractShip[] arrayShip = new AbstractShip[LENGTH_QUEUE_SHIP];
        for (int i = 0; i < LENGTH_QUEUE_SHIP - 1; i++) {
            arrayShip[i] = this.arrayShip[i + 1];
        }
        this.arrayShip = arrayShip;
        return 1;
    }

    @Override
    public String printQueueShip() {
        if (arrayShip[0] == null) {
            return "QueueEmpty";
        }
        String result = "";
        for (int i = 0; i < LENGTH_QUEUE_SHIP; i++) {
            if (arrayShip[i] == null) {
                break;
            }
            result += "{" + arrayShip[i].toPrint() + "};";
        }
        return result;
    }

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
            System.out.println(result);
        }

        return result;

    }


}
