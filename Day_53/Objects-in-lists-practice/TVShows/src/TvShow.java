public class TvShow {
    private String name;
    private int numOfEpisodes;
    private String genre;

    public TvShow() {}

    public TvShow(String name) {
        this.name = name;
    }

    public TvShow(int numOfEpisodes) {
        this.numOfEpisodes = numOfEpisodes;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfEpisodes(int numOfEpisodes) {
        this.numOfEpisodes = numOfEpisodes;
    }

    public void genre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return (
            "The name of the show is " + getName() + " with " + getNumOfEpisodes() + " episodes. " +
            "The genre is " + getGenre()
        );
    }

}
