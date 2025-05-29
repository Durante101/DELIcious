package com.pluralsight;

public class Sandwich implements FoodItem {
    String bread;
    Size size;


    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSize() {

        return switch (this.size) {
            case SMALL -> "4in";
            case MEDIUM -> "8in";
            case LARGE -> "12in";
            default -> "";
        };

    }

    public void setSize(Size size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", size=" + getSize() +
                '}';
    }

    @Override
    public double getPrice() {

        double sandwichTotalPrice = 0;

        //check the size of the sandwich and add it to total Cost
        sandwichTotalPrice += getSandwichSizeCost();


        // check if there's meat on the sandwich / extra meat



        //check if there's cheese / extra cheese


        return sandwichTotalPrice;
    }

    private double getSandwichSizeCost(){
        return switch (this.size) {
            case SMALL -> 5.50;
            case MEDIUM -> 7;
            case LARGE -> 8.50;
        };


    }
}
