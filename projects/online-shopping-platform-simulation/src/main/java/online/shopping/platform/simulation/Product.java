package online.shopping.platform.simulation;

public class Product {
    private String name;
    double price;

    public Product(String name, double price) {
        this.setName(name);
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName() + ", Price: " + price);
    }

    public void certifiedProduct(){
        System.out.println("Teste de criação e invocação de Métodos: Produto Certificado!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
