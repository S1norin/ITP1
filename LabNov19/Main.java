package ItP1.LabNov19;

import org.w3c.dom.stylesheets.MediaList;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;
import static java.lang.Math.min;

class Media {

    int year;
    String author, title;

    public Media(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
}

class Video extends Media {
    int runtime;
    public Video(String title, String author, int year, int runtime) {
        super(title, author, year);
        this.runtime = runtime;
    }

}

class Book extends Media {
    int pageCount;
    public Book(String title, String author, int year, int pageCount) {
        super(title, author, year);
        this.pageCount = pageCount;
    }
}

class Newspaper extends Media {
    int issue;
    public Newspaper(String title, String author, int year, int issue) {
        super(title, author, year);
        this.issue = issue;
    }
}

class Library<T extends Media> {
    List<T> mediaList = new ArrayList<>();

    public void addMedia(T media) {
        mediaList.add(media);
    }

    public int getOldest() {
        int result = 5000;
        for (T entry : mediaList) {
            result = min(result, entry.year);
        }
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Video duneFilm = new Video("Dune", "Denis", 2021, 300);
        Book duneBook = new Book("Dune", "Herbert", 1960, 1000);
        Newspaper scifiShit = new Newspaper("SciFiShit", "John Cena", 2024, 3);

        Library<Media> fuckingHell = new Library<>();
        fuckingHell.addMedia(duneFilm);
        fuckingHell.addMedia(duneBook);
        fuckingHell.addMedia(scifiShit);



        System.out.print(fuckingHell.getOldest());
    }
}
