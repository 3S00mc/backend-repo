public class Main {
    public static void main(String[] args) {
        Eletronics tv = new Eletronics("TV", 1000, 3);
        Clothing shirt = new Clothing("Shirt", 100, "M");


        ShoppingCart cart = new ShoppingCart();
        cart.addItem(tv);
        cart.addItem(shirt);
    }
}
