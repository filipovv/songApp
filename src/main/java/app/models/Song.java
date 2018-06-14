package app.models;


/**
 * The Song class contains information and properties needed to create an object of type Song.
 * Via it's public methods one can access information about the song, such as title, genre, timing and lyrics.
 */
public class Song {
    private String title;
    private String genre;
    private String timing;
    private String lyrics;

    /**
     * Constructor for class Song
     *
     * @param title  The title of the song.
     * @param genre  The genre of the song.
     * @param timing The timing of the song.
     * @param lyrics The lyrics of the song.
     */
    public Song(String title, String genre, String timing, String lyrics) {
        this.setTitle(title);
        this.setGenre(genre);
        this.setTiming(timing);
        this.setLyrics(lyrics);
    }

    /**
     * Method used to determine if a given genre is the same as the song's genre.
     *
     * @param checkGenre The genre to compare.
     * @return Boolean value meaning if the genres match or not.
     */
    public boolean isSameGenre(String checkGenre) {
        return checkGenre.equalsIgnoreCase(this.getGenre());
    }

    /**
     * Method used to print detailed information about the object of type Song.
     *
     * @return String value, containing information about the song.
     */
    @Override
    public String toString() {
        return String.format("Song title: %s%n" +
                        "Genre: %s%n" +
                        "Timing: %s%n" +
                        "Lyrics: %s%n",
                this.getTitle(), this.getGenre(), this.getTiming(), this.getLyrics());
    }

    /**
     * Getter method for the song's title.
     *
     * @return String value, representing the title of the song.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter method for the song's title.
     *
     * @param title String value to be set as the song's title.
     */
    private void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter method for the song's genre.
     *
     * @return String value, representing the genre of the song.
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Setter method for the song's genre.
     *
     * @param genre String value to be set as the song's genre.
     */
    private void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Getter method for the song's timing.
     *
     * @return String value, representing the timing of the song.
     */
    public String getTiming() {
        return this.timing;
    }

    /**
     * Setter method for the song's timing.
     *
     * @param timing String value to be set as the timing of the song.
     */
    private void setTiming(String timing) {
        this.timing = timing;
    }

    /**
     * Getter method for the song's lyrics.
     *
     * @return String value, representing the lyrics of the song.
     */
    public String getLyrics() {
        return this.lyrics;
    }

    /**
     * Setter method for the song's lyrics.
     *
     * @param lyrics String value to be set as the lyrics of the song.
     */
    private void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
