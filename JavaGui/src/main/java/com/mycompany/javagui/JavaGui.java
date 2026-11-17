package com.mycompany.javagui;
import javax.swing.*;

public class JavaGui {

    public static void main(String[] args) {

        //Create the JFrame
        JFrame frame = new JFrame("Student Marks Application");

        //Create the labels
        JLabel lblName = new JLabel("Enter student name:");
        JLabel lblMark = new JLabel("Enter test mark:");

        //Create the text fields
        JTextField txtName = new JTextField();
        JTextField txtMark = new JTextField();

        //Create the button
        JButton btnCalculate = new JButton("Calculate Result");

        //Set the layout
        frame.setLayout(null);

        //Set the positions and sizes of components
        lblName.setBounds(30, 30, 150, 25);
        txtName.setBounds(180, 30, 150, 25);

        lblMark.setBounds(30, 70, 150, 25);
        txtMark.setBounds(180, 70, 150, 25);

        btnCalculate.setBounds(100, 120, 150, 30);

        //Add components to the JFrame
        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblMark);
        frame.add(txtMark);
        frame.add(btnCalculate);

        //Add functionality to the button
        btnCalculate.addActionListener(e -> {

            //Retrieve the student's name
            String studentName = txtName.getText();

            //Retrieve and convert the test mark
            int testMark = Integer.parseInt(txtMark.getText());

            //Determine whether the student passed or failed
            String result;

            if (testMark >= 50) {
                result = "Passed";
            } else {
                result = "Failed";
            }

            //Display the student's details and result
            JOptionPane.showMessageDialog(frame,
                    "Student Name: " + studentName
                    + "\nTest Mark: " + testMark
                    + "\nResult: " + result);
        });

        //Set JFrame properties
        frame.setSize(400, 220);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}