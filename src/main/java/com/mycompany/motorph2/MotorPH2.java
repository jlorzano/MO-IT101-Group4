/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.motorph2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author gamer
 */
public class MotorPH2 {

    public static void main(String[] args) throws IOException, InterruptedException {
        
        //Abstraction was performed by creating a code that simplifies the output instead of creating multiple instances of the same method.
        //(e.g. "gr.greets();" can be used repeatedly because a class was created where the originating code came from so everytime i use the code it will provide the same output).
        //Inheritance was performed by extending the "Greet2" class to the "Greetings" abstract class where you can utilize both "greet1" and "greets" method.
        //Polymorphism was performed by making a "Greetings" superclass with two different types of greeting "greet1" and "greets" method and the greets method is under the subclass "Greet2"
        Greetings gr = new Greet2() {};
        gr.greet1();
        Thread.sleep(3000);
        gr.greets();
        int maxAttempts = 3;
        int attempts = 0;
        
        //this code is used for the userID login once the user enters their userID the Encapsulation below captures the data entered and uses the buffered reader to search for the
        //employee's data
        boolean cont = true;
        while (cont) {
        Scanner scan = new Scanner(System.in);
        String search,str;
        System.out.print("Enter Employee ID:"+" ");
        search = scan.nextLine();
        attempts++;
        if (attempts==maxAttempts) { System.out.println("You have reached the max attempt!"); break; }
        
        //Encapsulation was performed using the getter and setter methods below
        Eid myEid = new Eid();
        myEid.setId(search);
        System.out.print("Searching Info for Employee.... "); System.out.println(myEid.getId());
        Thread.sleep(5000);
        
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\gamer\\OneDrive\\Documents\\Mmdc\\MotorPH Employee Datav4.txt"));
        
        boolean found = false;
        while ((str = br.readLine()) != null) {
            if (str.contains(search)) { 
                String[] values = str.split(",");
                System.out.println("----------------EMPLOYEE INFO---------------");
                System.out.println("Employee Number: " + values[0]);
                System.out.println("Employee Name: " + values[2] + " "+ values[1]);
                System.out.println("DOB: " +  values[3]);
                System.out.println("----------------PAYOUT INFO-----------------");
                System.out.println("Hours Worked (EOM): " + values[23]);
                System.out.println("Gross Earnings: " + values[24]);
                System.out.println("Total Dedutions: " + values[29]);
                System.out.println("Net Earnings: " + values[30]);
                System.out.println("---------------------------------------------");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("Thank you for using the MotorPH Payroll System!");
                found = true;
                break;   
            }
        } 
        if(!found) {
                System.out.println("Invalid Employee ID...");
        }
        cont = (!found);
        }
    }
}
