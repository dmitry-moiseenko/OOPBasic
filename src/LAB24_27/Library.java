package LAB24_27;
/*
Для автоматизации работы библиотеки необходимо реализовать метод,
который печатает информацию про каждое издание, которое находится в переданном каталоге.
На выходе ожидается конкатенация печатного вида всех изданий.
Если количество элементов массива  = 0  вернуть пустую строку "".

(Примечание: В консоль писать нельзя ! ).
 */
public class Library {
    public String printCatalog(Issue[] catalog) {
        if (catalog.length == 0){
            return "";
        }
        String result = "";
        for (Issue issue : catalog) {
            result += issue.toPrint();
        }

        return result;
    }
}
