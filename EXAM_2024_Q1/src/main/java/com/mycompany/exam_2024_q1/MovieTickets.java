package com.mycompany.exam_2024_q1;

public class MovieTickets implements IMovieTickets {

    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int i = 0; i < movieTicketSales.length; i++) {
            total += movieTicketSales[i];
        }
        return total;
    }

    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int maxIndex = 0;
        for (int s = 0; s < movies.length; s++) {
            if (totalSales[s] > totalSales[maxIndex]) {
                maxIndex = s;
            }
        }
        return movies[maxIndex];
    }
}
