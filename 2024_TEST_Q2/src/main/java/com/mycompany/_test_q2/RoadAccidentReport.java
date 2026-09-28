/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._test_q2;

/**
 *
 * @author HP
 */
public class RoadAccidentReport extends RoadAccidents {
    
    public RoadAccidentReport(String type, String city, int total) {
    super(type,city,total);
}

    public void printAccidentReport() {
     System.out.println("VEHICLE TYPE: " + type);
     System.out.println("CITY: " + city);
     System.out.println("ACCIDENT TOTAL: " + total);
    }
    
}
