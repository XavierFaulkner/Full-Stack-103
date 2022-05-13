import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();

        //Using all book constructors
        Book x = new Book();
        Book y = new Book("Twilight");
        Book z = new Book(1987);

        Book one = new Book("The Cat in the Hat", 61, 1957);
        Book two = new Book("The Hunger Games", 384, 2008);
        Book three = new Book("The Giver", 208, 1993);
        books.add(one); books.add(two); books.add(three);
        System.out.println("List of books");
        System.out.println("Entering nothing will stop the loop");
        while(true) {
            System.out.println("Title of the book: ");
            String title = in.nextLine();
            if(title.equals("")) {
                break;
            }
            System.out.println("Number of pages: ");
            int numOfPages = Integer.parseInt(in.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.parseInt(in.nextLine());
            Book b = new Book(title, numOfPages, publicationYear);
            books.add(b);
        }
        System.out.print("What information will be printed? ");
        String info;
        while(true) {
            info = in.nextLine();
            if(!info.equals("everything") && !info.equals("name")) {
                System.out.print("Please enter 'everything' or 'name': ");
            } else {
                break;
            }
        }
        for(int i = 0; i < books.size(); i++) {
            if(info.equals("everything")) {
                System.out.println(books.get(i).toString());
            } else {
                System.out.println(books.get(i).getTitle());
            }
        }
        in.close();
    }
}
