/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._test_q2;

/**
 *
 * @author HP
 */
public class ProcessRecipe extends Recipes {
    
    public ProcessRecipe(String ingredients, int time, int difficulty) {
        super(ingredients, time, difficulty);
    }
    
    @Override
    public void PrintRecipe() {
        System.out.println("****************************************");
        System.out.println("INGREDIENTS: " + getIngredients());
        System.out.println("TIME TO MAKE: " + getTime());
        System.out.println("DIFFICULTY LEVEL: " + getDifficulty());
        System.out.println("****************************************");
    }
}
