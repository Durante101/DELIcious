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




        //first while loops ends



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
