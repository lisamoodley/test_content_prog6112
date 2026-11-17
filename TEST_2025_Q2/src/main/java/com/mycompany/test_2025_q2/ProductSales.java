package com.mycompany.test_2025_q2;

public class ProductSales implements IProductSales {

    // Replace these sample values with the actual sales data and limit from your paper
    private int[][] productSales = {
        {300, 150, 700},
        {250, 200, 600}
    };
    private final int SALES_LIMIT = 500;

    public ProductSales(int[][] productSales) {
        this.productSales = productSales;
    }

    @Override
    public int[][] GetProductSales() {
        return productSales;
    }

    @Override
    public int GetTotalSales() {
        int total = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                total += productSales[i][j];
            }
        }
        return total;
    }

    @Override
    public int GetSalesOverLimit() {
        int overLimitCount = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] > SALES_LIMIT) {
                    overLimitCount++;
                }
            }
        }
        return overLimitCount;
    }

    @Override
    public int GetSalesUnderLimit() {
        int underLimitCount = 0;
        for (int i = 0; i < productSales.length; i++) {
            for (int j = 0; j < productSales[i].length; j++) {
                if (productSales[i][j] <= SALES_LIMIT) { // Change to '<' if exact limit is excluded
                    underLimitCount++;
                }
            }
        }
        return underLimitCount;
    }

    @Override
    public int GetProductsProcessed() {
        // Returns the number of rows (years/products) processed
        return productSales.length;
    }

    @Override
    public double GetAverageSales() {
        int total = GetTotalSales();
        int count = 0;
        
        for (int i = 0; i < productSales.length; i++) {
            count += productSales[i].length;
        }
        
        if (count == 0) {
            return 0.0;
        }
        return (double) total / count;
    }
}
