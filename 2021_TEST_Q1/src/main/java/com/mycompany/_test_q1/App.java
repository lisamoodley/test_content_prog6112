/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._test_q1;

/**
 *
 * @author HP
 */
public class App {

    public static void main(String[] args) {
        int[][] deliveries = {
            {128, 155, 129},
            {135, 129, 130},
            {139, 175, 185}
        };

        String[] years = {"2018", "2019", "2020"};
        int total = 0;
        int min = deliveries[0][0];
        int max = deliveries[0][0];

        System.out.println("************************************************");
        System.out.println("DELIVERIES REPORT");
        System.out.println("************************************************");

        System.out.println("\t\tJAN" + "\tFEB" + "\tMAR");
        for (int j = 0; j < deliveries.length; j++) {
            System.out.print("DELIVERIES " + years[j] + "\t");
            for (int k = 0; k < deliveries[j].length; k++) {
                System.out.print(deliveries[j][k] + "\t");

                if (min > deliveries[j][k]) {
                    min = deliveries[j][k];
                }

                if (max < deliveries[j][k]) {
                    max = deliveries[j][k];
                }

                total += deliveries[j][k];
            }
            System.out.println();
        }

        System.out.println("************************************************");
        System.out.println("DELIVERIES STATISTICS");
        System.out.println("************************************************");
        System.out.println("Total Deliveries: " + total);
        System.out.println("Maximum Deliveries: " + max);
        System.out.println("Minimum Deliveries: " + min);
        System.out.println("************************************************");
    }
}
