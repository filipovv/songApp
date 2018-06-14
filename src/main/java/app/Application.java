package app;

import app.models.Author;
import app.models.Song;

/**
 * The Application program implements an application that
 * creates a Song object from Song.class and an Author object from Author.class and displays in the console
 * the provided functionality of their public methods.
 */
public class Application {
    public static void main(String[] args) {

        Song song = new Song("Sweet Child O'Mine",
                "Rock",
                "5:12",
                "She's got a smile it seems to me\n" +
                "Reminds me of childhood memories\n" +
                "Where everything\n" +
                "Was as fresh as the bright blue sky\n" +
                "Now and then when I see her face\n" +
                "She takes me away to that special place\n" +
                "And if I'd stare too long\n" +
                "I'd probably break down and cry\n" +
                "Oh, oh, oh\n" +
                "Sweet child o' mine\n" +
                "Oh, oh, oh, oh\n" +
                "Sweet love of mine\n" +
                "She's got eyes of the bluest skies\n" +
                "As if they thought of rain\n" +
                "I hate to look into those eyes\n" +
                "And see an ounce of pain\n" +
                "Her hair reminds me of a warm safe place\n" +
                "Where as a child I'd hide\n" +
                "And pray for the thunder\n" +
                "And the rain\n" +
                "To quietly pass me by\n" +
                "Oh, oh, oh\n" +
                "Sweet child o' mine\n" +
                "Oh, oh, oh, oh\n" +
                "Sweet love of mine\n" +
                "Oh, oh, oh, oh\n" +
                "Sweet child o' mine\n" +
                "Oh, oh, oh, oh\n" +
                "Sweet love of mine\n" +
                "Oh, oh, oh, oh\n" +
                "Sweet child o' mine\n" +
                "Oh,\n" +
                "Sweet love of mine\n" +
                "Where do we go?\n" +
                "Where do we go now?\n" +
                "Where do we go?\n" +
                "Oh, oh\n" +
                "Where do we go?\n" +
                "Oh,\n" +
                "Where do we go now?\n" +
                "Where do we go?\n" +
                "Oh, (sweet child)\n" +
                "Where do we go now?\n" +
                "Oh,\n" +
                "Where do we go now?\n" +
                "Oh,\n" +
                "Where do we go?\n" +
                "Oh,\n" +
                "Where do we go now?\n" +
                "Oh,\n" +
                "Where do we go?\n" +
                "Where do we go now?\n" +
                "Where do we go?\n" +
                "Oh,\n" +
                "Where do we go now?\n" +
                "No, no, no, no, no, no\n" +
                "Sweet child,\n" +
                "Sweet child of mine");

        Author author = new Author("Guns'n'Roses", 99, song);

        System.out.println(song.toString());

        String testGenre = "Pop";
        System.out.printf("Is genre %s? - %s%n", testGenre, song.isSameGenre(testGenre));

        System.out.println(song.getTiming());
        System.out.println(song.getLyrics());

        System.out.println(author.printAuthorInfo());
        System.out.println(author.printAuthorSong());

    }
}
