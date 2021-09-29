/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bai5;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double a,b ;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input floating-point number: ");
	        a = scanner.nextDouble();	
	        System.out.print("Input floating-point another number: ");
	        b = scanner.nextDouble();	
		
		if ( a==b ) System.out.println("They are the same  ");
		else {System.out.println("They are different");
		
    }
    
}
