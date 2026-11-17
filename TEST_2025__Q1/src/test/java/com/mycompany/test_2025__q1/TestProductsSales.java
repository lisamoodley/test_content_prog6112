package com.mycompany.test_2025__q1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestProductsSales {

    // Sample 2D array matching your int[][] parameter type
    // You can replace these numbers with the exact table values from Q.1.1
    private final int[][] sampleSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {
        ProductSales productSales = new ProductSales();
        
        // Sum of sampleSales: 300 + 150 + 700 + 250 + 200 + 600 = 2200
        int expectedTotal = 2200;
        int actualTotal = productSales.TotalSales(sampleSales);
        
        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void AverageSales_ReturnsAverageProductSales() {
        ProductSales productSales = new ProductSales();
        
        // Average of sampleSales: 2200 / 6 = 366.6666...
        double expectedAverage = 366.67;
        double actualAverage = productSales.AverageSales(sampleSales);
        
        // 0.01 is the tolerance (delta) for comparing double decimal values
        assertEquals(expectedAverage, actualAverage, 0.01);
    }
}
