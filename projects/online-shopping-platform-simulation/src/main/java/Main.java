import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        Eletronics laptop = new Eletronics("Laptop", 1200, 12);
        Clothing shirt = new Clothing("Shirt", 100, "S");
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(laptop);
        shoppingCart.addItem(shirt);
    }
}
