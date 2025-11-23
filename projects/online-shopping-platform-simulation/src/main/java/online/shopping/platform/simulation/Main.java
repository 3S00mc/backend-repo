package online.shopping.platform.simulation;

public class Main {
    public static void main(String[] args) {
        Eletronics laptop = new Eletronics("Laptop", 1200, 12);
        Clothing shirt = new Clothing("Shirt", 100, "S");
        ShoppingCart shoppingCart = new ShoppingCart();

//        shirt.displayInfo();
//        laptop.displayInfo();
//        laptop.certifiedProduct();

//        laptop.getName();
        System.out.println(laptop.getName());
        shoppingCart.addItem(laptop);

        System.out.println(shirt.getName());
        shoppingCart.addItem(shirt);
    }
}
