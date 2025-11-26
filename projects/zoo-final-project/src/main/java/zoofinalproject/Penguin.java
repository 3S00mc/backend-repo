package zoofinalproject;

public class Penguin extends Animal implements Swim, Walk {

    //properties
    private int swimmingSpeed;
    private int walkingSpeed;
    private boolean isSwimming;

    //constructor with parameters
    public Penguin(int swimmingSpeed, int walkingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
        this.walkingSpeed = walkingSpeed;
    }

    //constructor
    public Penguin() {
        super("Penguin");
    }

    //getters and setters
    public boolean isSwimming() {
        return isSwimming;
    }

    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getWalkingSpeed() {
        return walkingSpeed;
    }

    public void setWalkingSpeed(int walkingSpeed) {
        this.walkingSpeed = walkingSpeed;
    }

    //override eat methods
    @Override
    public void eatingFood() {
        System.out.println("Penguin: I am eating fish");
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish");
    }

    //override swim methods
    @Override
    public void swimming() {
        System.out.println("I am a penguin so I can swim");
        System.out.println("Penguin: I am swimming at the speed of " + swimmingSpeed + " meters per second");
    }

    //override walk methods
    @Override
    public void walking() {
        System.out.println("I am a penguin so I can walk");
        System.out.println("Penguin: I am moving at the speed of " + walkingSpeed + " kilometers per hour");
    }
}
