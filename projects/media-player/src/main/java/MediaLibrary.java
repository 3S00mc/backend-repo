public class MediaLibrary {

    public Media addMedia(Media mediaItem) {
        System.out.println("Added media item: "+ mediaItem.title + " to the Library");
        return mediaItem;
    }

    public void playMedia(Media mediaItem) {
        mediaItem.play();
    }
}
