/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._test_q2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ingredients: ");
        String ingredients = input.nextLine();
        System.out.println("Enter time to make (in minutes): ");
        int time = input.nextInt();
        System.out.println("Enter difficulty: ");
        int difficulty = input.nextInt();
        
        ProcessRecipe recipe = new ProcessRecipe(ingredients, time, difficulty);
        recipe.PrintRecipe();
        
    }
}
