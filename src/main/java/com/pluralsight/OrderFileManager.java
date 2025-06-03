//package com.pluralsight;
//
//import java.io.PrintWriter;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class OrderFileManager {
//
//    public void usaveReceipt(Order order) {
//        LocalDateTime dateTime = LocalDateTime.now();
//
//        DateTimeFormatter dateForm = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
//        String receipt = "Receipts" + "/" + dateTime.format(dateForm) + ".txt";
//
//        try (PrintWriter writer = new PrintWriter(receipt)) {
//
//
//            for (Vehicle vehicle : dealership.getAllVehicles()) {
//                writer.println(
//                        vehicle.getVin() + "|" +
//                                vehicle.getYear() + "|" +
//                                vehicle.getMake() + "|" +
//                                vehicle.getModel() + "|" +
//                                vehicle.getType() + "|" +
//                                vehicle.getColor() + "|" +
//                                vehicle.getOdometer() + "|" +
//                                vehicle.getPrice()
//                );
//            }
//
//        } catch (Exception e) {
//            System.out.println("Error saving inventory file: " + e.getMessage());
//        }
//    }
//
//
//}
