import java.util.ArrayList;
import java.util.List;

public class Collection {
    private String name;
    private String owner;
    private List<MusicalMedia> media;

    public Collection(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.media = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public List<MusicalMedia> getMedia() {
        return media;
    }

    public void addMedia(MusicalMedia media) {
        this.media.add(media);
    }

    public void removeMedia(MusicalMedia media) {
        this.media.remove(media);
    }

    public MusicalWork searchMusicByTitle(String title) {
        for (MusicalMedia media : this.media) {
            for (MusicalWork work : media.getWorks()) {
                if (work.getName().equals(title)) {
                    return work;
                }
            }
        }
        return null;
    }
}
