package LAB24;

public class Main {
    public static void main(String[] args) {
        String testNameBook = "TestNameBook";
        String testAuthorBook = "TestBookAuthor";
        int countPages = 100;
//      "Book{name=TestNameBook,countPages=100,author=TestBookAuthor}";

        Issue book = new Book(testNameBook, countPages, testAuthorBook);
        System.out.println(book.toPrint());
    }
}
