package LAB28_32;

public class Test3 {
    public static void main(String[] args) {
        String testCargoName = "TestCargoName";
        float testCargoLength = 1000;
        float testCargoWidth = 1000;
        float testCargoDisplacement = 1000;
        float testCargoTonnage = 100;

        float expectedCargoPaymentRentTaxDefault = testCargoTonnage * Cargo.DEFAULT_RENTAL;

        Cargo cargo = new Cargo(testCargoName, testCargoLength, testCargoWidth, testCargoDisplacement, testCargoTonnage);

        //check payment if rent tax is default
        float actualCargoPaymentRentTaxDefault = cargo.calculatePayment();
        if (actualCargoPaymentRentTaxDefault != expectedCargoPaymentRentTaxDefault)
            throw new AssertionError("Rent tax is default= " + Cargo.DEFAULT_RENTAL + " and expected payment value= " + expectedCargoPaymentRentTaxDefault + " but found " + actualCargoPaymentRentTaxDefault);

        System.out.print("OK");
    }
}
