package com.larionov.core;


import com.larionov.core.discount.Discount;

public class Commodity {

    private long id;

    private String title;

    private Discount discount;
    private double quantity;
    private double price;


    public Commodity() {

    }

    public boolean discountIsPresent() {
        return discount != null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

