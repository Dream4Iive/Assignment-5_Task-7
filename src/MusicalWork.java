public class MusicalWork {
    private String name;
    private int duration;
    private MusicalMedia media;

    public MusicalWork(String name, int duration, MusicalMedia media) {
        this.name = name;
        this.duration = duration;
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public MusicalMedia getMedia() {
        return media;
    }

    public void setMedia(MusicalMedia media) {
        this.media = media;
    }
}
