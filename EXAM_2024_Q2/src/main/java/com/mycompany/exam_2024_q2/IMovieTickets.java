package com.mycompany.exam_2024_q2;

public interface IMovieTickets {

    double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice);

    boolean ValidateData(MovieTicketData movieTicketData);
}
