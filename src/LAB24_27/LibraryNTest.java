package LAB24_27;
/*
Для автоматизации работы библиотеки необходимо реализовать метод,
который находит в каталоге все издания с количеством страниц больше N.
На выходе ожидается конкатенация печатного вида всех изданий.
Если количество элементов входного массива  = 0 - вернуть пустую строку "".
*/
public class LibraryNTest {
    public static void testGetIssueWithCountPagesMoreN(){
        int countPages1 = -3;
        int countPages2 = 50;
        int countPages3 = 0;
        int countPages4 = 3;

        String testNameIssue1 = "TestNameIssue1";
        String testNameIssue2 = "TestNameIssue2";
        String testNameIssue3 = "TestNameIssue3";
        String testNameIssue4 = "TestNameIssue4";

//        String expectedPrint = "Issue{name=TestNameIssue1,countPages=100}";
        Library library = new Library();


        Issue[] arrayIssue = new Issue[4];

        arrayIssue[0] = new Issue(testNameIssue1, countPages1);
        arrayIssue[1] = new Issue(testNameIssue2, countPages2);
        arrayIssue[2] = new Issue(testNameIssue3, countPages3);
        arrayIssue[3] = new Issue(testNameIssue4, countPages4);

        String actualPrint = library.getIssueWithCountPagesMoreN(arrayIssue, 50);
        System.out.println(actualPrint);

        if (actualPrint == null)
            throw new AssertionError("Result cannot be null");

        if (actualPrint.isEmpty())
            System.out.print("OK");
        else
            throw new AssertionError("Expected empty string but found " + actualPrint);


    }
}
