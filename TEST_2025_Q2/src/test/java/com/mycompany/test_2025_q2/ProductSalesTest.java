package com.mycompany.test_2025_q2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest {
    
    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {
        int[][] testData = {
            {300, 150, 700},
            {250, 200, 600}
        };
        ProductSales productSales = new ProductSales(testData);
        int expected = 2; // 700 and 600 are over 500

        // Act
        int actual = productSales.GetSalesOverLimit();

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {
        int[][] testData = {
            {300, 150, 700},
            {250, 200, 600}
        };
        ProductSales productSales = new ProductSales(testData);
        int expected = 4; // 300, 150, 250, and 200 are under/equal to 500

        // Act
        int actual = productSales.GetSalesUnderLimit();

        // Assert
        assertEquals(expected, actual);
    }
}

