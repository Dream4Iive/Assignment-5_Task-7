public class Main {
    public static void main(String[] args) {
        Collection myCollection = new Collection("My Music Collection", "John Doe");

        MusicalMedia album1 = new MusicalMedia("Artist 1", "Rock", 2020);
        MusicalMedia album2 = new MusicalMedia("Artist 2", "Pop", 2018);

        MusicalWork work1 = new MusicalWork("Song 1", 180, album1);
        MusicalWork work2 = new MusicalWork("Song 2", 200, album1);
        MusicalWork work3 = new MusicalWork("Song 3", 150, album2);

        myCollection.addMedia(album1);
        myCollection.addMedia(album2);

        album1.addWork(work1);
        album1.addWork(work2);
        album2.addWork(work3);

        System.out.println("Musical Works of Album 1:");
        for (MusicalWork work : album1.getWorks()) {
            System.out.println(" - " + work.getName() + ", Duration: " + work.getDuration() + " seconds");
        }

        System.out.println("Total Duration of Album 1: " + album1.calculateTotalDuration() + " seconds");

        String titleToSearch = "Song 2";
        MusicalWork foundWork = myCollection.searchMusicByTitle(titleToSearch);

        if (foundWork != null) {
            System.out.println("Found work: " + foundWork.getName());
            System.out.println("Contained in Media: " + foundWork.getMedia().getAuthor() + " - " + foundWork.getMedia().getGenre());
        } else {
            System.out.println("Work with title '" + titleToSearch + "' not found.");
        }
    }
}
