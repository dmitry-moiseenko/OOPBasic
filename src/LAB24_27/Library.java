package LAB24_27;
/*
Для автоматизации работы библиотеки необходимо реализовать метод,
который печатает информацию про каждое издание, которое находится в переданном каталоге.
На выходе ожидается конкатенация печатного вида всех изданий.
Если количество элементов массива  = 0  вернуть пустую строку "".

(Примечание: В консоль писать нельзя ! ).
 */

/*
Для автоматизации работы библиотеки необходимо реализовать метод,
который находит в каталоге все издания с количеством страниц больше N.
На выходе ожидается конкатенация печатного вида всех изданий.
Если количество элементов входного массива  = 0 - вернуть пустую строку "".
 */
public class Library {
    public String printCatalog(Issue[] catalog) {
        if (catalog.length == 0) {
            return "";
        }
        String result = "";
        for (Issue issue : catalog) {
            result += issue.toPrint();
        }
        return result;
    }

    public String getIssueWithCountPagesMoreN(Issue[] catalog, int barrierCountPages) {
        if (catalog.length == 0) {
            return "";
        }
        String eq = "=";
        String result = "";
        for (Issue issue : catalog) {
            int lastEq = issue.toPrint().lastIndexOf(eq);
            String count = issue.toPrint().substring(lastEq + 1);
            int countInt = Integer.parseInt(count);
            if (countInt > barrierCountPages) {
                result += issue.toPrint();
            }
        }
        return result;
    }
}

