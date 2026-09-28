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
        System.out.println("Enter the current staff number: ");
        int number = input.nextInt();
        input.nextLine();
        System.out.println("Enter the staff hiring location: ");
        String location = input.nextLine();
        
        StaffHiring staff = new StaffHiring(number, location);
        staff.printStaffHiring();
    }
}
