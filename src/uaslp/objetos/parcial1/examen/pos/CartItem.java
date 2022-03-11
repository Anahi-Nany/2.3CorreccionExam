package uaslp.objetos.parcial1.examen.pos;

import uaslp.objetos.parcial1.examen.pos.Product;

public class CartItem {

    private int quantity;
    private Product product;

    public int getQuantity(){
        return quantity;
    }

    public String getProductName(){
        return product.getName();
    }

    public float getAmount(){
        return product.getAmount();
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(int quantity){
        this.quantity=quantity;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
