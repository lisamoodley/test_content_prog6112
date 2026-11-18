package com.mycompany.exam_2024_q1;

public class EXAM_2024_Q1 {

    public static void main(String[] args) {
        int[][] ticketSales = {{3000, 1500, 1700}, {3500, 1200, 1600}};

        String[] movie = {"Napoleon", "Oppenheimer"};
        String maximumMovie = " ";
        String displayMonths = " ";
        int maximum = ticketSales[0][0];
        int[] totalSales = new int[2];

        for (int i = 0; i < ticketSales.length; i++) {
            for (int j = 0; j < ticketSales[i].length; j++) {
                totalSales[i] = ticketSales[i][0] + ticketSales[i][1] + ticketSales[i][2];
            }
        }

        for (int s = 0; s < movie.length; s++) {
            //Maximum sale
            if (totalSales[s] > maximum) {
                maximum = totalSales[s];
                maximumMovie = movie[s];
            }
        }

        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("\t\tJAN\t\tFEB\t\tMAR");
        System.out.println("-----------------------------------------------------------");
        for (int n = 0; n < ticketSales.length; n++) {
            System.out.print(movie[n] + "\t");
            for (int k = 0; k < ticketSales[n].length; k++) {
                System.out.print(ticketSales[n][k] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("\nTotal movie ticket sales for Napoleon " + totalSales[0]);
        System.out.println("Total movie ticket sales for Oppenheimer " + totalSales[1]);
        System.out.println("\nTop performing movie: " + maximumMovie);

    }
}
