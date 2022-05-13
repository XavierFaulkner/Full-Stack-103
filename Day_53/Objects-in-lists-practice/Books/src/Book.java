public class Book {
    private String title;
    private int numOfPages;
    private int publicationYear;

    public Book() {}

    public Book(String bookTitle) {
        title = bookTitle;
    }

    public Book(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Book(String bookTitle, int numOfPages, int publicationYear) {
        title = bookTitle;
        this.numOfPages = numOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String bookTitle) {
        title = bookTitle;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return getTitle() + ", " + getNumOfPages() + " pages, " + getPublicationYear();
    }

}
