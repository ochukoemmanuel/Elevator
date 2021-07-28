/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.elevators;

import java.util.Scanner;

/**
 *
 * @author ochuk
 */
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean status;
        
        
        System.out.println("Enter elevator A or elevator B \n A \n B");
        String in = input.next();
        
        status = true;
        do {
            if("A".equals(in)){
            // Elevator A: Goes to all floors except the penthouse (floor 10).
            Elevator elevatorA = new Elevator();
            elevatorA.ask();
            } else {
            System.out.println("Invalid Input");
            status = false;
            }
        } while(false);
        
        
        // Elevator B: Goes all the way up (including 10) but does not go to the basement (-1).
        Elevator elevatorB = new Elevator();
    }
}
