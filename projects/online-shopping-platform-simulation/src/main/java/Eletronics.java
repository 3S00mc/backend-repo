public class Eletronics extends Product{
    int warrantyInMonths;

    public Eletronics(String name, double price, int warrantyInMonths) {
        super(name, price);
        this.warrantyInMonths = warrantyInMonths;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warrantyInMonths + " months");
    }
}
