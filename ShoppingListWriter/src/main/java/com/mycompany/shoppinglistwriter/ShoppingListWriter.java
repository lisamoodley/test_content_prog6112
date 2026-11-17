/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.shoppinglistwriter;

import java.io.FileWriter;
import java.io.*;
import java.io.PrintWriter;

public class ShoppingListWriter {

    public static void main(String[] args) throws IOException {
        String[] shoppingList = {"Milk", "Eggs", "Bread", "Apples", "Chicken"};

        PrintWriter output = new PrintWriter(new FileWriter("shoppinglist.txt"));
        for (String item : shoppingList) {
            output.println(item);
        }
        output.close();
    System.out.println("File written successfully!");
    }
}
