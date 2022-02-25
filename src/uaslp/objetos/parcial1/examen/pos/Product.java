package uaslp.objetos.parcial1.examen.pos;

public class Product {
    int quantity;
    String data;
    Float price;
    Product next;
    Product previous;

    public Product(int amount, String data, Float price) {
        this.quantity = amount;
        this.data = data;
        this.price = amount;
    }
}
