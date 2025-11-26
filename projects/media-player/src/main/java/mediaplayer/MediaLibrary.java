package mediaplayer;

public class MediaLibrary {

    //Este metodo retorna qualquer objeto das subclasses de Media.
    // Esse objeto pode ser um filme, uma musica ou um livro.
    // Pode usar qualquer metodo ou atributo da classe Media.
    public Media addMedia(Media mediaItem) {
        System.out.println("Added media item: "+ mediaItem.title + " to the Library");
        return mediaItem;
    }

    public void playMedia(Media mediaItem) {
        mediaItem.play();
    }
}
