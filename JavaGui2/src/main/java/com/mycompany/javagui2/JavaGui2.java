
package com.mycompany.javagui2;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;

public class JavaGui2 {

    //Declare GUI components
    static JLabel lblName, lblGender, lblDining, lblMeal, lblRequests;
    static JTextField txtName, txtRequests;

    static JRadioButton rbMale, rbFemale;
    static ButtonGroup genderGroup;

    static JCheckBox chkTakeaway, chkDineIn;

    static JComboBox<String> cmbMeal;

    static JTextArea txtArea;

    static JButton btnSubmit, btnSave;

    static JFrame frame;

    public static void main(String[] args) {

        //Create JFrame
        frame = new JFrame("Restaurant Customer Order Form");

        frame.setSize(550, 550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        //Create a panel for the form
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));

        //Customer name
        lblName = new JLabel("Customer Name:");
        txtName = new JTextField();

        //Gender selection
        lblGender = new JLabel("Gender:");

        rbMale = new JRadioButton("Male");
        rbFemale = new JRadioButton("Female");

        genderGroup = new ButtonGroup();
        genderGroup.add(rbMale);
        genderGroup.add(rbFemale);

        JPanel genderPanel = new JPanel();
        genderPanel.add(rbMale);
        genderPanel.add(rbFemale);

        //Dining option
        lblDining = new JLabel("Dining Option:");

        chkTakeaway = new JCheckBox("Takeaway");
        chkDineIn = new JCheckBox("Dine In");

        //Allow only one dining option
        chkTakeaway.addActionListener(e -> {
            if (chkTakeaway.isSelected()) {
                chkDineIn.setSelected(false);
            }
        });

        chkDineIn.addActionListener(e -> {
            if (chkDineIn.isSelected()) {
                chkTakeaway.setSelected(false);
            }
        });

        JPanel diningPanel = new JPanel();
        diningPanel.add(chkTakeaway);
        diningPanel.add(chkDineIn);

        //Meal selection
        lblMeal = new JLabel("Select Meal:");

        String[] meals = {
            "Burger",
            "Pizza",
            "Pasta",
            "Chicken",
            "Sandwich"
        };

        cmbMeal = new JComboBox<>(meals);

        //Special requests
        lblRequests = new JLabel("Special Requests:");
        txtRequests = new JTextField();

        //Add components to the form panel
        formPanel.add(lblName);
        formPanel.add(txtName);

        formPanel.add(lblGender);
        formPanel.add(genderPanel);

        formPanel.add(lblDining);
        formPanel.add(diningPanel);

        formPanel.add(lblMeal);
        formPanel.add(cmbMeal);

        formPanel.add(lblRequests);
        formPanel.add(txtRequests);

        //Create buttons
        btnSubmit = new JButton("Submit Order");
        btnSave = new JButton("Save to File");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSubmit);
        buttonPanel.add(btnSave);

        //Create text area
        txtArea = new JTextArea(12, 40);
        txtArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(txtArea);

        //Add panels to the JFrame
        frame.add(formPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        //Submit Order button functionality
        btnSubmit.addActionListener(e -> {

            String receipt = generateReceipt();

            if (receipt != null) {
                txtArea.setText(receipt);
            }
        });

        //Save to File button functionality
        btnSave.addActionListener(e -> {

            String receipt = generateReceipt();

            if (receipt != null) {

                try {

                    //Append receipt to the text file
                    FileWriter writer =
                            new FileWriter("CustomerReceipts.txt", true);

                    writer.write(receipt);
                    writer.write("\n--------------------\n");

                    writer.close();

                    JOptionPane.showMessageDialog(frame,
                            "Receipt saved successfully!");

                } catch (IOException ex) {

                    JOptionPane.showMessageDialog(frame,
                            "Error saving receipt to file.");
                }
            }
        });

        //Display JFrame
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    //Method to generate the receipt
    public static String generateReceipt() {

        //Retrieve customer name
        String name = txtName.getText();

        //Check that the name is entered
        if (name.trim().isEmpty()) {
            JOptionPane.showMessageDialog(frame,
                    "Please enter the customer's name.");
            return null;
        }

        //Retrieve gender
        String gender;

        if (rbMale.isSelected()) {
            gender = "Male";
        } else if (rbFemale.isSelected()) {
            gender = "Female";
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please select a gender.");
            return null;
        }

        //Retrieve dining option
        String diningOption;

        if (chkTakeaway.isSelected()) {
            diningOption = "Takeaway";
        } else if (chkDineIn.isSelected()) {
            diningOption = "Dine In";
        } else {
            JOptionPane.showMessageDialog(frame,
                    "Please select a dining option.");
            return null;
        }

        //Retrieve selected meal
        String meal = cmbMeal.getSelectedItem().toString();

        //Retrieve special requests
        String requests = txtRequests.getText();

        if (requests.trim().isEmpty()) {
            requests = "None";
        }

        //Create personalised receipt
        String receipt =
                "       CUSTOMER ORDER RECEIPT\n"
                + "------------------------------\n"
                + "Customer Name: " + name + "\n"
                + "Gender: " + gender + "\n"
                + "Dining Option: " + diningOption + "\n"
                + "------------------------------\n"
                + "Meal Ordered: " + meal + "\n"
                + "Special Requests: " + requests + "\n"
                + "------------------------------\n";

        return receipt;
    }
}
