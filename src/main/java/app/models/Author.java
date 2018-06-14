package app.models;

public class Author {
    private String name;
    private int age;
    private Song song;

    public Author(String name, int age, Song song) {
        this.setName(name);
        this.setAge(age);
        this.setSong(song);
    }

    public String printAuthorInfo() {
        return String.format("Author name: %s%nAuthor age: %d%n",
                this.getName(), this.getAge());
    }

    public String printAuthorSong() {
        return String.format("Author name: %s%nSong name: %s%n", this.getName(), this.getSong().getTitle());
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private Song getSong() {
        return song;
    }

    private void setSong(Song song) {
        this.song = song;
    }
}
