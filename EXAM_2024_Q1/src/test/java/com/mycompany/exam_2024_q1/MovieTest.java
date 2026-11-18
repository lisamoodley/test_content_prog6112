package com.mycompany.exam_2024_q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {
   
 @Test
 public void CalculateTotalSales_ReturnExpectedTotalSales() {
    MovieTickets ticketSales = new MovieTickets();
    int[] testSales = {3000, 1500, 1700}; 
    
    int expectedTotal = 6200;
    int actualTotal = ticketSales.TotalMovieSales(testSales);
    
    assertEquals(expectedTotal, actualTotal);
 }
    
 
 @Test
  public void TopMovieSales_ReturnTopMovie() {
    MovieTickets ticketSales = new MovieTickets();
    int[] testTopSales = {6200, 6300}; 
    String[] movies = {"Napoleon", "Oppenheimer"};
    
    String expectedMovie = "Oppenheimer";
    String actualMovie = ticketSales.TopMovie(movies, testTopSales);
    
    assertEquals(expectedMovie, actualMovie);
 }
}
