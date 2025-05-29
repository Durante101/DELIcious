package com.pluralsight;

public class Chips implements FoodItem {
    String brand;

    public Chips(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    //return price of the chips
    @Override
    public double getPrice() {
        return 1.50;
    }



}
