package uaslp.objetos.parcial1.examen.pos;

public class PointOfSale {
    private Product head;
    private Product tail;
    private int size;

    public void addToCart(int quantity, String data, float price) {
        Product product = new Product(quantity, data, price);

        if (size == 0) {
            head = product;
        } else {
            tail.next = product;
            product.previous = tail;
        }

        tail = product;
        size++;
    }

    public void getProducts() {
        return product.data;
    }

    public void getTotal(){
        return product.price;
    }

    public void getCountByName(String name) {
        return product.name
    }

}
