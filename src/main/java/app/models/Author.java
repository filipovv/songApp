package app.models;

/**
 * The Author class contains information and properties needed to
 * create a Author object. Via its public methods one can access
 * information about the author, such as name and age, as well as information about a song he/she wrote.
 */
public class Author {
    private String name;
    private int age;
    private Song song;

    /**
     * Constructor for Author class.
     *
     * @param name This is the name of the author.
     * @param age  This is the age of the author.
     * @param song This is a song from the author.
     */
    public Author(String name, int age, Song song) {
        this.setName(name);
        this.setAge(age);
        this.setSong(song);
    }

    /**
     * Method used to print information about the author, such as name and age.
     *
     * @return String value, containing information about the author.
     */
    public String printAuthorInfo() {
        return String.format("Author name: %s%nAuthor age: %d%n",
                this.getName(), this.getAge());
    }

    /**
     * Method used to print information about the author and a song he/she wrote.
     *
     * @return String value, containing information about the author and the song.
     */
    public String printAuthorSong() {
        return String.format("Author name: %s%nSong name: %s%n",
                this.getName(), this.getSong().getTitle());
    }

    /**
     * Getter method for name.
     *
     * @return String value, representing the name of the author.
     */
    private String getName() {
        return this.name;
    }

    /**
     * Setter method for the author's name.
     *
     * @param name String value to be set as the author's name.
     */
    private void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for the author's age.
     *
     * @return Integer value, representing the author's age.
     */
    private int getAge() {
        return this.age;
    }

    /**
     * Setter method for the author's age.
     *
     * @param age Integer value to be set a the author's age.
     */
    private void setAge(int age) {
        this.age = age;
    }

    /**
     * Getter method for a song the author wrote.
     *
     * @return Value of type Song, representing the author's song.
     */
    private Song getSong() {
        return this.song;
    }

    /**
     * Setter method for the song.
     *
     * @param song Value of type Song to be set as the song of the author.
     */
    private void setSong(Song song) {
        this.song = song;
    }
}
