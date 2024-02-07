import java.util.ArrayList;
import java.util.List;

public class MusicalMedia {
    private String author;
    private String genre;
    private int year;
    private List<MusicalWork> works;

    public MusicalMedia(String author, String genre, int year) {
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.works = new ArrayList<>();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public List<MusicalWork> getWorks() {
        return works;
    }

    public void addWork(MusicalWork work) {
        this.works.add(work);
    }

    public void removeWork(MusicalWork work) {
        this.works.remove(work);
    }

    public int calculateTotalDuration() {
        int totalDuration = 0;
        for (MusicalWork work : works) {
            totalDuration += work.getDuration();
        }
        return totalDuration;
    }
}
