package array.counting.vowel;

interface Moveable {
    void move();
}


class Bike implements Moveable {

    public void move() {
        System.out.println("Bike is moving.");
    }

}


class ModuleQuiz_M3L3 {
    public static void main(String []args) {
        Moveable moveableObject = new Bike();
        moveableObject.move();
    }
}