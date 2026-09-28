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
         // Updated to a 6x3 array (6 months rows, 3 job categories columns)
        int[][] jobs = {
            {8, 2, 5}, // JANUARY: Bathroom, Kitchens, Garden
            {7, 4, 5}, // FEBRUARY
            {5, 5, 2}, // MARCH
            {2, 2, 3}, // APRIL
            {7, 7, 9}, // MAY
            {7, 8, 5}  // JUNE
        };
        String[] months = {"JANUARY", "FEB", "MARCH", "APRIL", "MAY", "JUNE"};
        int[] monthlytotals = new int[6];

        System.out.println("----------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("----------------------------------------");
        System.out.println("\t" + "Bathroom" + "\t" + "Kitchens" + "\t" + "Garden");
        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i] + "\t");
            for (int j = 0; j < jobs[i].length; j++) {
                System.out.print(jobs[i][j] + "\t\t");
                monthlytotals[i] += jobs[i][j];
            }
            System.out.println();
        }

        System.out.println("----------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("----------------------------------------");
        for (int k = 0; k < months.length; k++) {
            if (monthlytotals[k] < 15) {
                System.out.println(months[k] + "\t" + monthlytotals[k]);
            } else if (monthlytotals[k] >= 15) {
                System.out.println(months[k] + "\t" + monthlytotals[k] + "\t***");
            }
        }
    }

}
