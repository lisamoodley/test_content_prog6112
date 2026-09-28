/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany._test_q1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] accidents = new int[3][2];
        String[] city = {"Cape Town", "Johannesburg", "Port Elizabeth"};
        int[] TotalAccidents = new int[3];

        for (int i = 0; i < city.length; i++) {
            System.out.println("Enter the number of car accidents for " + city[i] + ": ");
            accidents[i][0] = input.nextInt();
            System.out.println("Enter the number of motor bike accidents for " + city[i] + ": ");
            accidents[i][1] = input.nextInt();

            TotalAccidents[i] = accidents[i][0] + accidents[i][1];
        }

        int MostAccidents = -999;
        String MostCity = city[0];

        for (int j = 0; j < city.length; j++) {
            if (TotalAccidents[j] > MostAccidents) {
                MostAccidents = TotalAccidents[j];
                MostCity = city[j];
            }
        }

        System.out.println("-----------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("-----------------------------------------------------------");
        System.out.println("\t" + "CAR\tMOTOR BIKE");
        for (int n = 0; n < accidents.length; n++) {
            System.out.print(city[n] + "\t");
            for (int k = 0; k < accidents[n].length; k++) {
                System.out.print(accidents[n][k] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("-----------------------------------------------------------");
        for (int s = 0; s < city.length; s++) {
            System.out.println(city[s] + "\t" + TotalAccidents[s]);
        }
        System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + MostCity);
        System.out.println("-----------------------------------------------------------");
    }
}
