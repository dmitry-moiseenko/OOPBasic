package LAB27;

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
        String a="";
        if (catalog.length == 0) {
            return "";
        }
        for (int i = 0; i <catalog.length ; i++) {
            if(catalog[i].getCountPages()>barrierCountPages) {
                a+= catalog[i].toPrint();
            }

        }

        return a;
    }
}
