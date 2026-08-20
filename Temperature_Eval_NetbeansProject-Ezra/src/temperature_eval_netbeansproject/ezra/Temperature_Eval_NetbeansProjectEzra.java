/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperature_eval_netbeansproject.ezra;

import java.util.Scanner;

/**
 *
 * @author Ezra Loyd P. Gubantes
 */
public class Temperature_Eval_NetbeansProjectEzra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter today's temperature in Celsius");
        double temperature = input.nextDouble();
        if (temperature < 0){
            System.out.println("Freezing point");
        }else if (temperature<=25){
            System.out.println("Normal weather");
        }else{
            System.out.println("Hot weather");
        }
    }
    
}
