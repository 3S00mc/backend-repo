public class Espresso extends Coffee{

    int numberOfShots;

    // Constructor
    public Espresso(String name, String roast, double price, int numberOfShots) {
        super(name, roast, price);
        this.numberOfShots = numberOfShots;
    }

    public void printEspressoDetail() {
        System.out.println("You asked for " + numberOfShots + " servings! Every serving of Espresso costs " + price + "$." + " Your total bill is " + (numberOfShots * price) + "$.");
    }

    Espresso myEspresso = new Espresso("Espresso", "light", 2.5, 3);

    @Override
    public void grindBeans() {
        super.grindBeans();
    }
}
