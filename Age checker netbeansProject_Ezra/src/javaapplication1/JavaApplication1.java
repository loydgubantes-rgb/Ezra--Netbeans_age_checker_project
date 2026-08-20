/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Ezra Loyd. Gubantes
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();
        if (age<12){
            System.out.println("You are a child");
        }else if(age<=18){
            System.out.println("You are a teenager");
        }else{
            System.out.println("You are an adult");
        }
    }
    
}
