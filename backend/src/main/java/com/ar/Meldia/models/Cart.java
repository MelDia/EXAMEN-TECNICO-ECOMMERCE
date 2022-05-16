package com.ar.Meldia.models;

public class Cart {

    private Product product;
    private Double totalPrice;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Cart{" + "product=" + product + ", totalPrice=" + totalPrice + '}';
    }

}
