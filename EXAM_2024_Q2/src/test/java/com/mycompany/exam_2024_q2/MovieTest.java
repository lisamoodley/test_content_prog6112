package com.mycompany.exam_2024_q2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MovieTest {

    @Test
    public void CalculateTotalTicketPrice_CalculatedSuccessfully() {
        MovieTickets movieTickets = new MovieTickets();
        int numberOfTickets = 3;
        double ticketPrice = 100.0;
        
        // Expected: (3 * 100) + 14% VAT = 300 + 42 = 342.0
        double expectedTotal = 342.0;
        double actualTotal = movieTickets.CalculateTotalTicketPrice(numberOfTickets, ticketPrice);
        
        assertEquals(expectedTotal, actualTotal, 0.01);
    }

    @Test
    public void ValidationTests() {
        MovieTickets movieTickets = new MovieTickets();
        
        // Testing invalid data (empty movie name, 0 tickets, negative price)
        MovieTicketData invalidData = new MovieTicketData("", 0, -50.0);
        
        boolean result = movieTickets.ValidateData(invalidData);
        assertFalse(result);
    }
}
