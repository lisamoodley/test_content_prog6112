package com.mycompany.test_2025_q2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TEST_2025_Q2 {

    public static void main(String[] args) {
        // Product Sales Data (Rows = Years, Columns = Microphone, Speakers, Mixing Desk)
        final int[][] salesData = {
            {300, 150, 700}, // Sales for year 1
            {250, 200, 600} // Sales for year 2
        };
        final int SALES_LIMIT = 500;

        // 1. Frame Setup
        JFrame frame = new JFrame("Product Sales Application");
        frame.setSize(340, 360);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout(10, 10));

        // 2. Menu Bar (File, Edit)
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        JMenu toolsMenu = new JMenu("Tools");
        JMenuItem loadItem = new JMenuItem("Load Product Data");
        JMenuItem saveItem = new JMenuItem("Save Product Data");
        JMenuItem clearItem = new JMenuItem("Clear");
        toolsMenu.add(loadItem);
        toolsMenu.add(saveItem);
        toolsMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);
        frame.setJMenuBar(menuBar);

        // 3. Top Panel for Buttons
        JPanel topPanel = new JPanel(new GridLayout(2, 1, 5, 8));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 15, 0, 15));

        JButton btnLoad = new JButton("Load Product Data");
        JButton btnSave = new JButton("Save Product Data");

        topPanel.add(btnLoad);
        topPanel.add(btnSave);
        frame.add(topPanel, BorderLayout.NORTH);

        // 4. Center Panel for Text Area
        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));

        JTextArea txtDisplay = new JTextArea();
        txtDisplay.setEditable(false);
        txtDisplay.setFont(new Font("SansSerif", Font.PLAIN, 12));
        txtDisplay.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        centerPanel.add(new JScrollPane(txtDisplay), BorderLayout.CENTER);
        frame.add(centerPanel, BorderLayout.CENTER);

        // 5. Bottom Panel for Read-Only Label
        JPanel bottomPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 5, 15));

        JLabel lblYearsProcessed = new JLabel("Years Processed: 0");
        bottomPanel.add(lblYearsProcessed);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        // 6. Load Button Action Listener
        btnLoad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalSales = 0;
                int count = 0;
                int overLimit = 0;
                int underLimit = 0;

                for (int year = 0; year < salesData.length; year++) {
                    for (int product = 0; product < salesData[year].length; product++) {
                        int sale = salesData[year][product];
                        totalSales += sale;
                        count++;

                        if (sale > SALES_LIMIT) {
                            overLimit++;
                        } else {
                            underLimit++;
                        }
                    }
                }

                int averageSales = (int) Math.round((double) totalSales / count);

                String output = "Total Sales: " + totalSales + "\n"
                        + "Average Sales: " + averageSales + "\n"
                        + "Sales over limit: " + overLimit + "\n"
                        + "Sales under limit: " + underLimit;

                txtDisplay.setText(output);
                lblYearsProcessed.setText("Years Processed: " + salesData.length);
            }
        });

        // 7. Save Button Action Listener
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtDisplay.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Please load product data first.", "Warning", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                try (PrintWriter writer = new PrintWriter(new FileWriter("data.txt"))) {
                    writer.println("DATA LOG");
                    writer.println("*******************************");
                    writer.println(txtDisplay.getText());
                    writer.println("*******************************");
                    JOptionPane.showMessageDialog(frame, "Data saved successfully to data.txt!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(frame, "Error saving file: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // 8. Menu Item Action Listeners - Added for Q.2.3
        exitItem.addActionListener(e -> System.exit(0));

        loadItem.addActionListener(e -> btnLoad.doClick());

        saveItem.addActionListener(e -> btnSave.doClick());

        clearItem.addActionListener(e -> {
            txtDisplay.setText("");
            lblYearsProcessed.setText("Years Processed: ");
        });

        // Display Frame
        frame.setVisible(true);
    }
}
