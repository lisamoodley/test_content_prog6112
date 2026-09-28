/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test_2025__q1;

/**
 *
 * @author HP
 */
public class ProductSales implements IProduct {

    @Override
    public int TotalSales(int[][] productSales) {

        int total = 0;

        for (int row = 0; row < productSales.length; row++) {
            for (int column = 0; column < productSales[row].length; column++) {
                total += productSales[row][column];
            }
        }

        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {

        int total = TotalSales(productSales);
        int numberOfSales = 0;

        for (int row = 0; row < productSales.length; row++) {
            numberOfSales += productSales[row].length;
        }

        return (double) total / numberOfSales;
    }

    @Override
    public int MaxSale(int[][] productSales) {

        int maximum = productSales[0][0];

        for (int row = 0; row < productSales.length; row++) {
            for (int column = 0; column < productSales[row].length; column++) {

                if (productSales[row][column] > maximum) {
                    maximum = productSales[row][column];
                }
            }
        }

        return maximum;
    }

    @Override
    public int MinSale(int[][] productSales) {

        int minimum = productSales[0][0];

        for (int row = 0; row < productSales.length; row++) {
            for (int column = 0; column < productSales[row].length; column++) {

                if (productSales[row][column] < minimum) {
                    minimum = productSales[row][column];
                }
            }
        }

        return minimum;
    }
}
