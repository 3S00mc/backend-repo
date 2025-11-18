package mediaplayer;

public abstract class Media {
    String title;
    String creator;

    public Media(String title, String creator) {
        this.title = title;
        this.creator = creator;
    }

    public abstract void play();

//    public void play() {
//        System.out.println("Playing media: " + title + " by " + creator);
//    }
}


