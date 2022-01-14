package src.ru.skillbox;

public class Book {
    private final String    name;
    private final String    author;
    private final int       pagesQuantity;
    private final int       ISBN;

    public Book(String name, String author, int pagesQuantity, int ISBN) {
        this.name = name;
        this.author = author;
        this.pagesQuantity = pagesQuantity;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPagesQuantity() {
        return pagesQuantity;
    }

    public int getISBN() {
        return ISBN;
    }
}
