package main;

public class Book {
    private String bname;
    private String baname;
    private String isbn;

    public String getBname() {
        return bname;
    }

    public String getBaname() {
        return baname;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBaname(String baname) {
        this.baname = baname;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "------------------------------\n" +
                "Book Name:\t" + getBname() + "\n" +
                "Author Name:\t" + getBaname() + "\n" +
                "ISBN:\t" + getIsbn() + "\n" +
                "------------------------------\n";
    }
}
