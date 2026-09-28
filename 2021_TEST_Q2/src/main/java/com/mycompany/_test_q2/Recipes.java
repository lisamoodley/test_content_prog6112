/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._test_q2;

/**
 *
 * @author HP
 */
public abstract class Recipes implements iRecipes {
   protected String ingredients;
   protected int time;
   protected int difficulty;
   
   public Recipes(String ingredients, int time, int difficulty) {
       this.ingredients = ingredients;
       this.time = time;
       this.difficulty = difficulty;
   }
   
   public String getIngredients() {
       return this.ingredients;
   }
   
   public int getTime() {
       return this.time;
   }
   
   public int getDifficulty() {
       return this.difficulty;
   }
}
