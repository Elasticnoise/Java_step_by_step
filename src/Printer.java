public class Printer {
    String  queue = "";
    int     waitToPrintCount = 0;
    int     printedFilesCount = 0;

    public void append(String text) {
        append(text, "", 0);
    }

    public void append(String text, String name) {
        append(text, name, 0);
    }
    public void append(String text, String name, int pagesCount) {
        boolean error  = false;
        if (name == null) {
            error = true;
        }
        waitToPrintCount++;
        queue = queue + ", " + name + " [" + pagesCount + ", " + text + "]";
    }
    public void clear() {
        queue = "";
        waitToPrintCount = 0;
        printedFilesCount = 0;
    }

    public void print() {
        System.out.println(queue);
        queue = "";
        waitToPrintCount = 0;
        printedFilesCount++;
    }

    public int getPendingPagesCount() {
        return waitToPrintCount;
    }

    public int getTotalPagesCount() {
        return printedFilesCount;
    }
}

