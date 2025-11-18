public class Eletronics extends Product{
    int warrantyPeriodInMonths;

    public Eletronics(String name, double price, int warrantyPeriodInMonths) {
        super(name, price);
        this.warrantyPeriodInMonths = warrantyPeriodInMonths;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty Period: " + warrantyPeriodInMonths + " months");
    }
}
