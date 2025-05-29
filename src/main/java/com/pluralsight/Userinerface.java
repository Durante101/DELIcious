package com.pluralsight;
import java.util.Scanner;


public class Userinerface {
    public static Scanner scanner = new Scanner(System.in);




    private static Chips displayHomeScreen()() {

        System.out.println("Select a chip");
        System.out.println("""
                1) New Order
                2) Exit
                
                """);

        String selection = scanner.nextLine();
        Chips chips;

        switch (selection) {


            case "1":
                return new Chips("Lays");
            case "2":
                return new Chips("Doritos");
            default:
                System.out.println("Try again");


        }
        return null;
    }

    private static Chips addChipsToOrder() {

        System.out.println("Select a chip");
        System.out.println("""
                1) Lays
                2) Doritos
                
                """);

        String selection = scanner.nextLine();
        Chips chips;

        switch (selection) {


            case "1":
                return new Chips("Lays");
            case "2":
                return new Chips("Doritos");
            default:
                System.out.println("Try again");


        }
        return null;
    }

    private static Sandwich addSandwichToOrder() {

        //create a default object and use setters to populate it
        Sandwich newSandwich = new Sandwich();
        String selection;

        //while loop starts
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
                break;
            case "2":
                newSandwich.setBread("Wheat");
                break;
            default:
                System.out.println("try again");
                break;

        }
        //first while loops ends

        // asking bread size
        System.out.println("Enter sandwich size");
        System.out.println("""
                S) Small - 4in 5.50
                M) Medium - 8in 7.00
                L) Large - 12 8.50
                
                """);
        selection = scanner.nextLine();

        switch (selection.toUpperCase()) {
            case "S":
                newSandwich.setSize(Size.SMALL);
                break;
            case "M":
                newSandwich.setSize(Size.MEDIUM);
                break;
            case "L":
                newSandwich.setSize(Size.LARGE);
                break;
            default:
                System.out.println("Try Again");

        }

        // continue to build sandwich


        return newSandwich;

    }


    private static Drink addDrinkToOrder() {
        String flavor = "";
        Size size = Size.SMALL;

        boolean isSelectingSize = true;

        String selection;
        while (isSelectingSize) {

            System.out.println("Drink Menu");
            System.out.println("Select size");
            System.out.println("""
                    S) Small
                    M) Medium
                    L) Large
                    
                    """);
            selection = scanner.nextLine();

            switch (selection.toUpperCase()) {

                case "S":
                    //size = Size.SMALL;
                    isSelectingSize = false;
                    break;
                case "M":
                    size = Size.MEDIUM;
                    isSelectingSize = false;
                    break;
                case "L":
                    size = Size.LARGE;
                    isSelectingSize = false;
                    break;

                default:
                    //we can just default to small;
                    //    size = Size.SMALL;
                    System.out.println("Error: Please try again..");
                    break;

            }
        }

        //the while loop for the next question in this menu would start
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

            }
        }


        return new Drink(flavor, size);
    }

}
