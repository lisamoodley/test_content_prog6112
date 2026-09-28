/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.test_2025__q1;

/**
 *
 * @author HP
 */
public class TEST_2025__Q1 {

    public static void main(String[] args) {
        int[][] SalesData = {{300, 150, 700}, {250, 200, 600}};

        int total = 0;
        int average = 0;
        int maxsales = SalesData[0][0];
        int minsales = SalesData[0][0];

        //Total sales
        for (int i = 0; i < SalesData.length; i++) {
            for (int j = 0; j < SalesData[i].length; j++) {
                total += SalesData[i][j];
                //Maximum sale
                if (SalesData[i][j] > maxsales) {
                    maxsales = SalesData[i][j];
                }
                //Minimum sale
                if (SalesData[i][j] < minsales) {
                    minsales = SalesData[i][j];
                }
            }
        }
        average = (int) Math.round((double) total / 6);

        System.out.println("PRODUCT SALES REPORT - 2025");
        System.out.println("----------------------------------");
        System.out.println("Total sales: " + total);
        System.out.println("Average sales: " + average);
        System.out.println("Maximum sale: " + maxsales);
        System.out.println("Minimum sale: " + minsales);
        System.out.println("----------------------------------");

        ProductSales sales = new ProductSales();

        System.out.println("PRODUCT SALES REPORT 2025");
        System.out.println("Total sales: " + sales.TotalSales(SalesData));
        System.out.println("Average sales: " + Math.round(sales.AverageSales(SalesData)));
        System.out.println("Maximum sale: " + sales.MaxSale(SalesData));
        System.out.println("Minimum sale: " + sales.MinSale(SalesData));
    }
}

