package app.models;

public class Song {
    private String title;
    private String genre;
    private String timing;
    private String lyrics;

    public Song(String title, String genre, String timing, String lyrics) {
        this.setTitle(title);
        this.setGenre(genre);
        this.setTiming(timing);
        this.setLyrics(lyrics);
    }

    public boolean isSameGenre(String checkGenre) {
        return checkGenre.equalsIgnoreCase(this.getGenre());
    }

    @Override
    public String toString() {
        return String.format("Song title: %s%n" +
                        "Genre: %s%n" +
                        "Timing: %s%n" +
                        "Lyrics: %s%n",
                this.getTitle(), this.getGenre(), this.getTiming(), this.getLyrics());
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTiming() {
        return timing;
    }

    private void setTiming(String timing) {
        this.timing = timing;
    }

    public String getLyrics() {
        return lyrics;
    }

    private void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
