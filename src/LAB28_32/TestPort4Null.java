package LAB28_32;


public class TestPort4Null {
    public static void main(String[] args) {

        // check null
        String actualSortedShipStringIfNull = OdessaSeaPort.sortSumPaymentAsc(null);
        if (!((actualSortedShipStringIfNull!=null) && (actualSortedShipStringIfNull.isEmpty())))
            throw new AssertionError("Result cannot be null, expected to be empty string");

        System.out.print("OK");
    }
}