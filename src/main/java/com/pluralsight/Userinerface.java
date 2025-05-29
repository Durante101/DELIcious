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





    }

}
