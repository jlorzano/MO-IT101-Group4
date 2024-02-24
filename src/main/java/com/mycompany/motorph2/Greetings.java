/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.motorph2;

/**
 *
 * @author gamer
 */
//abstraction and inheritance
abstract class Greetings {
    
    public void greet1() {
        System.out.println("Welcome to the MotorPH Payroll Portal");
    }
    public abstract void greets();
}

class Greet2 extends Greetings {
        public void greets() {
            System.out.println("Please wait...");
        }
}

