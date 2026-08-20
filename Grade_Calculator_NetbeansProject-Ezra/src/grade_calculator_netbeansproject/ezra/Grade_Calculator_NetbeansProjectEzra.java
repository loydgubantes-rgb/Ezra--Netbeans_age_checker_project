/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package grade_calculator_netbeansproject.ezra;

import java.util.Scanner;

/**
 *
 * @author Ezra Loyd P. Gubantes
 */
public class Grade_Calculator_NetbeansProjectEzra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter your test score");
       double testScore = input.nextDouble();
       if (testScore<=74){
          System.out.println("Needs Improvement");
       } else if (testScore>=75 && testScore<=89){
           System.out.println("Good");
       }
    }
    
}
