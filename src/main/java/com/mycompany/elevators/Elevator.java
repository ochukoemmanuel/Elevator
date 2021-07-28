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
public class Elevator {
	   // Variable
           Scanner intel = new Scanner(System.in);
           final int maxFloor = 10;
           final int minFloor = 1;
           int curFloor = 1;
           int desFloor = 0;
           
           // functions
           void display(Object o){
               System.out.println(o);
           }
           
           void ask(Object o){
               System.out.println(o);
           }
           
           void delay(int ms){
               try {
                   Thread.sleep(ms);
               } catch(Exception e){
                   
               }
           }
           
           void goUp(){
               while (curFloor++ < desFloor){
                    display("going up... current floor: " + curFloor+ " | DF: " + desFloor);
                    delay(600);
               }
               curFloor--;
           }
           
           void goDown(){
               while (curFloor-- > desFloor){
                    display("going down..... current floor: " + curFloor + " | DF: " + desFloor);
                    delay(600);
               }
               curFloor++;
           }
           
           void ask(){
               ask("Current Floor | " + curFloor + " Enter destination floor: ");
               desFloor = intel.nextInt();
               if(desFloor < minFloor || desFloor > maxFloor || desFloor == curFloor){
                   display("error. floor out of range or your selected floor is curFloor.");
                   ask();
               } else {
                   display("door closing...");
                   delay(600);
                   if(desFloor < curFloor) {
                       goDown();
                   } else if(desFloor > curFloor){
                       goUp();
                   }
               }
               display("Door opening");
               ask();
           }
}

