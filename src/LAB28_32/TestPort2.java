package LAB28_32;

/**
 * Created by Dmitriy on 5/8/2018.
 */
public class TestPort2 {
        public static void main(String[] args) {
//check add into full queue
            String testLinerName = "TestLinerName";
            float testLinerLength = 1000;
            float testLinerWidth = 1000;
            float testLinerDisplacement = 1000;
            int testLinerPassengers = 100;
            String testCargoName = "TestCargoName";
            float testCargoLength = 1000;
            float testCargoWidth = 1000;
            float testCargoDisplacement = 1000;
            float testCargoTonnage = 100;
            String testTankerName = "TestTankerName";
            float testTankerLength = 1000;
            float testTankerWidth = 1000;
            float testTankerDisplacement = 1000;
            float testTankerVolume = 100;

            int expectedStatusAddShipIntoQueueFull = -1;

            AbstractShip testLiner = new Liner(testLinerName, testLinerLength, testLinerWidth, testLinerDisplacement, testLinerPassengers);
            AbstractShip testCargo = new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage);
            AbstractShip testTanker = new Tanker(testTankerName, testTankerLength, testTankerWidth, testTankerDisplacement, testTankerVolume);

            OdessaSeaPort odessaSeaPort = new OdessaSeaPort();



            odessaSeaPort.addShipToEndQueue(testLiner);
            odessaSeaPort.addShipToEndQueue(testCargo);
            odessaSeaPort.addShipToEndQueue(testTanker);

            int actualStatusAddShipIntoQueueFull = odessaSeaPort.addShipToEndQueue(testTanker);
            if (actualStatusAddShipIntoQueueFull != expectedStatusAddShipIntoQueueFull)
                throw new AssertionError("Queue is full expected return -1 but found " + actualStatusAddShipIntoQueueFull);

            System.out.print("OK");
        }

}
