/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._test_q2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class App {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the accident vehicle type: ");
     String type = input.nextLine();
     System.out.println("Enter the city for the vehicle accidents: ");
     String city = input.nextLine();
     System.out.println("Enter the total Car accidents for Cape Town: ");
     int total = input.nextInt();
     
     System.out.println("VEHICLE ACCIDENT REPORT");
     System.out.println("***************************");
     RoadAccidentReport report = new RoadAccidentReport(type, city, total);
     report.printAccidentReport();
     System.out.println("***************************");
    }
}
