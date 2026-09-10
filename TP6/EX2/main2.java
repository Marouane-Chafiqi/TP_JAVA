package TP6;

public class main2 {
    public static void main(String[] args) {
        MediaLibrary lib = new MediaLibrary();

        lib.add(new Audio("Podcast Java", 1800));
        lib.add(new Video("Tutoriel UML", 900, "1080p"));
        lib.add(new LiveStream("Concert en direct", "http://biblio.marwan.com"));
        lib.add(new Audio("Musique Classique", 2400));

        lib.playAll();
        System.out.println();
        System.out.println("Duree totale (sec) : " + lib.totalDuration());
    }
}