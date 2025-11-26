package mediaplayer;

public class Main {
    public static void main(String[] args) {
        Book lordOfTheRings = new Book("The Lord of the Rings", "J.R.R. Tolkien", 500);

        Movie starWars = new Movie("Star Wars", "George Lucas", 120);

        Music quatroEstacoes = new Music("Quatro Estacoes", "Vivaldi", "Classic");

        MediaLibrary library = new MediaLibrary();

        library.addMedia(lordOfTheRings);
        library.addMedia(starWars);
        library.addMedia(quatroEstacoes);
        System.out.println("");

        library.playMedia(starWars);
        library.playMedia(quatroEstacoes);
        library.playMedia(lordOfTheRings);
    } 
}