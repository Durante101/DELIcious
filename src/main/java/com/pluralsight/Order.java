package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private List<FoodItem> items;
    private double orderTotal;

    public Order(){
        items = new ArrayList<>();
        orderTotal = 0;
    }

    /// methods
    public void addItemToOrder(FoodItem item){
        items.add(item);
    }

    public List<FoodItem>getOrder(){
        return items;
    }

    public double getOrderTotal(){
        double total = 0;

        for(FoodItem item: items){
            System.out.println(item.getPrice());
            total += item.getPrice();
        }

      return total;
    }
}
