package com.pluralsight;
import com.pluralsight.Sandwich.Meat;
import com.pluralsight.Sandwich.Sandwich;

import java.util.Scanner;


public class UserInterface {
    private static Scanner scanner = new Scanner(System.in);
    private Order currentOrder;

    public void display() {
        boolean running = true;

        while (displayHomeScreen()) {
            currentOrder = new Order();
            orderScreen();
        }

    }

    private void orderScreen() {

        currentOrder = new Order();
        boolean addOrder = false;

        boolean running = true;
        while (running) {
            System.out.println("What food items would you like to add to your order");
            System.out.println("""
                    1) Add Sandwich
                    ------------------
                    2) Add Drink
                    ------------------
                    3) Add Chips
                    ------------------
                    4) Checkout
                    ------------------
                    5) Cancel Order
                    """);

            String selection = scanner.nextLine();

            switch (selection) {

                case "1":
                    addSandwichToOrder();
                    break;
                case "2":
                    addDrinkToOrder();
                    break;
                case "3":
                    addChipsToOrder();
                    break;
                case "4":
                    checkoutItems();
                    running = false;
                    break;
                case "5":
                    running = false;
                    currentOrder = null;
                    break;
                default:
                    System.out.println("Try again");


            }

        }

    }

    private boolean displayHomeScreen() {
        boolean exit = true;
        boolean running = true;
        while (running) {

            System.out.println("Would you like to make a new order with DELIcious?");
            System.out.println("""
                    1) New Order
                    ------------------
                    2) Exit
                    """);

            String selection = scanner.nextLine();


            switch (selection) {

                case "1":
                    running = false;
                    break;
                case "2":
                    running = false;
                    exit = false;
                    break;
                default:
                    System.out.println("Try again\n");


            }

        }

        return exit;
    }

    private void checkoutItems() {

        boolean running = true;
        while (running) {
            System.out.println("Ready to Checkout?");
            System.out.println("""
                Y) Yes
                N) No
                """);

            String selection = scanner.nextLine();

            switch (selection.toUpperCase()) {


                case "Y":
                    System.out.println("Order Total");
                    System.out.println(currentOrder.getOrderTotal());
                    running = false;
                    break;
                case "N":
                    System.out.println("Okay, let's keep building your order!\n");
                    orderScreen();
                    running = false;
                    break;
                default:
                    System.out.println("Try again");
            }



        }

    }

    private void addChipsToOrder() {

        boolean running = true;
        while (running) {
            System.out.println("Select a chip");
            System.out.println("""
                    1) Lays
                    2) Doritos
                    
                    """);

            String selection = scanner.nextLine();
            String brand = "";

            switch (selection) {


                case "1":
                    brand = "Lays";
                    running = false;
                    break;
                case "2":
                    brand = "Doritos";
                    running = false;
                    break;
                default:
                    System.out.println("Try again");


            }
            Chips newChips = new Chips(brand);
            currentOrder.addItemToOrder(newChips);
        }
    }

    private void addSandwichToOrder() {

        //create a default object and use setters to populate it
        Sandwich newSandwich = new Sandwich();
        String selection;

        boolean running = true;
        while (running) {
            System.out.println("Select you bread:");
            System.out.println("""
                    1) White
                    2) Wheat
                    3) Wrap
                    4) Rye
                    """);
            selection = scanner.nextLine();
            switch (selection) {
                case "1":
                    newSandwich.setBread("White");
                    running = false;
                    break;
                case "2":
                    newSandwich.setBread("Wheat");
                    running = false;
                    break;
                default:
                    System.out.println("try again");
                    break;

            }
        }


    }


    private void addDrinkToOrder() {
        String flavor = "";
        Size size = null;

        boolean isSelectingSize = true;
        String selection;

        while (isSelectingSize) {
            System.out.println("Drink Menu");
            System.out.println("Select size");
            System.out.println("""
            1) Small
            2) Medium
            3) Large
            """);
            selection = scanner.nextLine();

            switch (selection) {
                case "1":
                    size = Size.SMALL;
                    isSelectingSize = false;
                    break;
                case "2":
                    size = Size.MEDIUM;
                    isSelectingSize = false;
                    break;
                case "3":
                    size = Size.LARGE;
                    isSelectingSize = false;
                    break;
                default:
                    System.out.println("Error: Please try again.");
                    break;
            }
        }

        boolean isSelectingFlavor = true;

        while (isSelectingFlavor) {
            System.out.println("What flavor drink?");
            System.out.println("""
            1) Coke
            2) Sprite
            3) Apple Juice
            """);

            selection = scanner.nextLine();
            switch (selection) {
                case "1":
                    flavor = "Coke";
                    isSelectingFlavor = false;
                    break;
                case "2":
                    flavor = "Sprite";
                    isSelectingFlavor = false;
                    break;
                case "3":
                    flavor = "Apple Juice";
                    isSelectingFlavor = false;
                    break;
                default:
                    System.out.println("Error: Please try again");
                    break;
            }
        }


        Drink newDrink = new Drink(flavor, size);
        currentOrder.addItemToOrder(newDrink);
    }


}
