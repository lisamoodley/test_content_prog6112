package com.mycompany.exam_2024_q2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EXAM_2024_Q2 extends JFrame {

    // Q.2.1 Form Components
    private JComboBox<String> cmbMovie;
    private JTextField txtNumTickets;
    private JTextField txtTicketPrice;
    private JTextArea txtReport;

    // Q.2.2 Menu Components
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu toolsMenu;
    private JMenuItem exitItem;
    private JMenuItem processItem;
    private JMenuItem clearItem;

    public EXAM_2024_Q2() {
        setTitle("MOVIE TICKETS");
        setSize(400, 420);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        // Q.2.2 Menu Setup
        menuBar = new JMenuBar();

        // File Menu
        fileMenu = new JMenu("File");
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0)); // Q.2.3
        fileMenu.add(exitItem);

        // Tools Menu
        toolsMenu = new JMenu("Tools");
        processItem = new JMenuItem("Process");
        clearItem = new JMenuItem("Clear");

        // Q.2.4, Q.2.5 & Q.2.7 Process Action
        processItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String movieName = (String) cmbMovie.getSelectedItem();
                    int numTickets = Integer.parseInt(txtNumTickets.getText().trim());
                    double ticketPrice = Double.parseDouble(txtTicketPrice.getText().trim());

                    MovieTicketData data = new MovieTicketData(movieName, numTickets, ticketPrice);
                    MovieTickets movieTickets = new MovieTickets();

                    if (!movieTickets.ValidateData(data)) {
                        JOptionPane.showMessageDialog(EXAM_2024_Q2.this,
                                "Please ensure movie name is selected, and tickets and price are greater than zero.",
                                "Validation Error",
                                JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    double totalPrice = movieTickets.CalculateTotalTicketPrice(numTickets, ticketPrice);

                    // Format matching Q.2.5 Sample Screenshot
                    String report = "MOVIE TICKET REPORT\n" +
                                    "************************************\n" +
                                    "MOVIE NAME: " + movieName + "\n" +
                                    "MOVIE TICKET PRICE: R " + ticketPrice + "\n" +
                                    "NUMBER OF TICKETS: " + numTickets + "\n" +
                                    "TOTAL TICKET PRICE: R " + totalPrice + "\n" +
                                    "************************************";

                    txtReport.setText(report);

                    // Q.2.5 Save report to report.txt
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter("report.txt"))) {
                        writer.write(report);
                    } catch (IOException ioEx) {
                        JOptionPane.showMessageDialog(EXAM_2024_Q2.this,
                                "Error saving report to file: " + ioEx.getMessage(),
                                "File Error",
                                JOptionPane.ERROR_MESSAGE);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(EXAM_2024_Q2.this,
                            "Please enter valid numeric values for tickets and price.",
                            "Format Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Q.2.6 Clear Action
        clearItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cmbMovie.setSelectedIndex(0);
                txtNumTickets.setText("");
                txtTicketPrice.setText("");
                txtReport.setText("");
            }
        });

        toolsMenu.add(processItem);
        toolsMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);
        setJMenuBar(menuBar);

        // Q.2.1 Form Controls
        JLabel lblMovie = new JLabel("MOVIE:");
        lblMovie.setBounds(20, 20, 140, 25);
        add(lblMovie);

        String[] movies = {"Napoleon", "Oppenheimer", "Damsel"};
        cmbMovie = new JComboBox<>(movies);
        cmbMovie.setBounds(170, 20, 190, 25);
        add(cmbMovie);

        JLabel lblTickets = new JLabel("NUMBER OF TICKETS:");
        lblTickets.setBounds(20, 65, 140, 25);
        add(lblTickets);

        txtNumTickets = new JTextField();
        txtNumTickets.setBounds(170, 65, 190, 25);
        add(txtNumTickets);

        JLabel lblPrice = new JLabel("TICKET PRICE:");
        lblPrice.setBounds(20, 110, 140, 25);
        add(lblPrice);

        txtTicketPrice = new JTextField();
        txtTicketPrice.setBounds(170, 110, 190, 25);
        add(txtTicketPrice);

        JLabel lblReport = new JLabel("TICKET REPORT:");
        lblReport.setBounds(20, 155, 140, 25);
        add(lblReport);

        txtReport = new JTextArea();
        txtReport.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtReport);
        scrollPane.setBounds(20, 190, 340, 140);
        add(scrollPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new EXAM_2024_Q2().setVisible(true);
        });
    }
}
