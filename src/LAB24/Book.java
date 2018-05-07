package LAB24;
//
//Необходимо реализовать метод toPrint() для класса Book,
//который выводит на печать информацию про книгу в следующем формате
//Book{name=<name>,countPages=<countPages>,author=<authorBook>}
//Подсказка: для реализации метода  toPrint() необходимо использовать метод toPrint() класса Issue.
//
class Book extends Issue {
    private String authorBook;

    public Book(String name, int countPages, String authorBook) {
        super(name, countPages);
        this.authorBook = authorBook;
    }

    @Override
    public String toPrint(){
        return authorBook;
    }
}
