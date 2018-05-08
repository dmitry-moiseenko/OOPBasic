package LAB27;

public class Test2 {
    public static void main(String[] args) {
        //Test2
        int countPages1 = 100;
        int countPages2 = 50;
        int countPages3 = 0;
        int countPages4 = 3;
        int countPages5 = 51;

        String testNameIssue1 = "TestNameIssue1";
        String testNameIssue2 = "TestNameIssue2";
        String testNameIssue3 = "TestNameIssue3";
        String testNameIssue4 = "TestNameIssue4";
        String testNameIssue5 = "TestNameBook5";

        String expectedPrint = "Issue{name=TestNameIssue1,countPages=100}Book{name=TestNameBook5,countPages=51,author=Viktor Kuchyn}";
        Library library = new Library();
        Issue[] arrayIssue = new Issue[5];

        arrayIssue[0] = new Issue(testNameIssue1, countPages1);
        arrayIssue[1] = new Issue(testNameIssue2, countPages2);
        arrayIssue[2] = new Issue(testNameIssue3, countPages3);
        arrayIssue[3] = new Issue(testNameIssue4, countPages4);
        arrayIssue[4] = new Book(testNameIssue5, countPages5, "Viktor Kuchyn");

        String actualPrint = library.getIssueWithCountPagesMoreN(arrayIssue, 50);

        //check
        if (actualPrint == null)
            throw new AssertionError("Result cannot be null");

        if (actualPrint.equals(expectedPrint))
            System.out.print("OK");
        else
            throw new AssertionError("Expected to be printed " + expectedPrint + " but found " + actualPrint);
    }

}