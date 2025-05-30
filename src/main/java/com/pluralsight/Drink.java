package com.pluralsight;

public class Drink implements FoodItem {
    private String flavor;
    private Size size;

    public Drink() {

    }
    public Drink(String flavor, Size size) {
        this.flavor = flavor;
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "flavor='" + flavor + '\'' +
                ", size=" + size +
                '}';
    }


    // get price of drink based on size
    @Override
    public double getPrice() {

        return switch (this.size) {
            case SMALL -> 2.00;
            case MEDIUM -> 2.50;
            case LARGE -> 3.00;
        };
    }



}
