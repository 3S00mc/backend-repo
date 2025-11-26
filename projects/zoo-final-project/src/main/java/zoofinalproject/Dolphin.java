package zoofinalproject;

public class Dolphin extends Animal implements Swim {

    //properties
    private String color;
    private int swimmingSpeed;

    //constructor with parameters
    public Dolphin(String color, int swimmingSpeed) {
        this.color = color;
        this.swimmingSpeed = swimmingSpeed;
    }

    //constructor
    public Dolphin() {
        super("Dolphin");
    }

    //getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(int swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    //override eat methods
    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish");
    }

    @Override
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    //swim methods
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of " + swimmingSpeed + " nautical miles per hour");
    }
}
