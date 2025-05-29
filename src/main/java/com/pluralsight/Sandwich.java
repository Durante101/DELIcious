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

        //check the size of the sandwich and add it to toal Cost
        sandwichTotalPrice += getSandwichSizeCost();


        // check if there's meat on the sandwich / extra meat



        //check if there's cheese / extra cheese


        return sandwichTotalPrice;
    }


}
