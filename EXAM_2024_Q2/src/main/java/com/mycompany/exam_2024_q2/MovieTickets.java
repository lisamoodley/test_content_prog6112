package com.mycompany.exam_2024_q2;

public class MovieTickets implements IMovieTickets {

    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double subtotal = numberOfTickets * ticketPrice;
        double vat = subtotal * 0.14; // Adjust if a different VAT rate is stated on page 8
        return subtotal + vat;
    }

    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {
        if (movieTicketData == null) {
            return false;
        }

        // Rule 1: Movie Ticket Name cannot be empty
        if (movieTicketData.getMovieName() == null || movieTicketData.getMovieName().trim().isEmpty()) {
            return false;
        }

        // Rule 2: Movie Ticket Price cannot be less than or equal to zero (0)
        if (movieTicketData.getTicketPrice() <= 0) {
            return false;
        }

        // Rule 3: Number of Movie Tickets cannot be less than or equal to zero (0)
        if (movieTicketData.getNumberOfTickets() <= 0) {
            return false;
        }

        return true;
    }
}
