public class TvShow {
    private String name;
    private int numOfEpisodes;
    private String genre;

    public TvShow(String showName, int numOfEpisodes, String genre) {
        name = showName;
        this.numOfEpisodes = numOfEpisodes;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public int getNumOfEpisodes() {
        return numOfEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return (
            "The name of the show is " + getName() + " with " + getNumOfEpisodes() + " episodes. " +
            "The genre is " + getGenre()
        );
    }

}
