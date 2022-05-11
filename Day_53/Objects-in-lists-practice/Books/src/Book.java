public class Book {
    private String title;
    private int numOfPages;
    private int publicationYear;

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

    @Override
    public String toString() {
        return getTitle() + ", " + getNumOfPages() + " pages, " + getPublicationYear();
    }

}
