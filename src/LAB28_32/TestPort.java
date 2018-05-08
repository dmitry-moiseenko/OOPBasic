package LAB28_32;

/**
 * Created by Dmitriy on 5/8/2018.
 */
public class TestPort {

    public static void main(String[] args) {

        //check print empty queue
        String expectedResultPrintShipQueueEmpty = "QueueEmpty";

        OdessaSeaPort odessaSeaPort = new OdessaSeaPort();
        odessaSeaPort.removeShipFromBeginQueue();

        String actualResultPrintShipQueueEmpty = odessaSeaPort.printQueueShip();
        if (!(actualResultPrintShipQueueEmpty.equals(expectedResultPrintShipQueueEmpty)))
            throw new AssertionError("Print empty queue expected to be printed " + expectedResultPrintShipQueueEmpty + " but found " + actualResultPrintShipQueueEmpty);


        System.out.print("OK");
    }
}
