import java.util.ArrayList;
import java.util.Scanner;

public class TVShows {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ArrayList<TvShow> shows = new ArrayList<TvShow>();

        //Using three tvshow constructors
        TvShow a = new TvShow();
        TvShow b = new TvShow("Continuum");
        TvShow c = new TvShow(42);

        System.out.println("TV Shows");
        System.out.println("Entering nothing will stop the loop");
        while(true) {
            System.out.println("Name of the show: ");
            String name = in.nextLine();
            if(name.equals("")) {
                break;
            }
            System.out.println("How many episodes?");
            int numOfEpisodes = Integer.parseInt(in.nextLine());
            System.out.println("What is the genre?");
            String genre = in.nextLine();
            TvShow s = new TvShow(name, numOfEpisodes, genre);
            shows.add(s);
        }
        for(int i = 0; i < shows.size(); i++) {
            System.out.println(shows.get(i).toString());
        }
        in.close();
    }
}
