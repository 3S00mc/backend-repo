package zoofinalproject;

public class Tiger extends Animal implements Walk{

    //properties
    private int numberOfStripes;
    private int speed;
    private int soundLevel;

    //constructor with parameters
    public Tiger(int numberOfStripes, int speed, int soundLevel) {
        this.numberOfStripes = numberOfStripes;
        this.speed = speed;
        this.soundLevel = soundLevel;
    }

    //constructor
    public Tiger() {
        super("Tiger");
    }


    //getters and setters
    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSoundLevel() {
        return soundLevel;
    }

    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    //override eat methods
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    /** não foi requisitado pelo exercício **/
    @Override
    public void eatingFood() {
        System.out.println("Tiger: I am eating red meat");
    }

    //override walk methods
    @Override
    public void walking() {
        System.out.println("Tiger: I am moving at the speed of " + speed + " mph");
    }
}
