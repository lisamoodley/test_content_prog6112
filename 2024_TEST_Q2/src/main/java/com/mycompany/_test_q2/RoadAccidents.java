/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._test_q2;

/**
 *
 * @author HP
 */
public abstract class RoadAccidents implements IRoadAccidents {
   protected String type; 
   protected String city;
   protected int total;
   
   public RoadAccidents(String type, String city, int total) {
     this.type = type;
     this.city = city;
     this.total = total;
   }
   
   public String getAccidentVehicleType() {
       return this.type;
   }
   
      public String getCity() {
       return this.city;
   }
      
      public int getAccidentTotal() {
       return this.total;
   }
}
