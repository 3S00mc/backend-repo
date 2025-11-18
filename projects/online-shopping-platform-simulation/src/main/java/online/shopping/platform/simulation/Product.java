package online.shopping.platform.simulation;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Price: " + price);
    }

    public void certifiedProduct(){
        System.out.println("Teste de criação e invocação de Métodos: Produto Certificado!");
    }
}
