/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._test_q2;

/**
 *
 * @author HP
 */
public abstract class Staff implements iStaff {

    protected int number;
    protected String location;

    public Staff(int number, String location) {
        this.number = number;
        this.location = location;
    }
    
    @Override
    public int getStaffNumber() {
        return this.number;
    }
    
    @Override
    public String getStaffLocation() {
        return this.location;
    }
    
    @Override
    public abstract String getStaffHiringProcess();
}
