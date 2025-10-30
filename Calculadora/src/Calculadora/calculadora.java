package Calculadora;

import java.util.Scanner;


	public class calculadora {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	    	
	    	double a;
	    	double b;

	        System.out.println("=== Calculadora Básica ===");
	        System.out.println("Valor a ");
			a = sc.nextDouble();
	        System.out.println("Valor b ");
			b = sc.nextDouble();

	 
	        System.out.println("Suma: " + (a + b));
	        System.out.println("Resta: " + (a - b));
	        System.out.println("Multiplicación: " + (a * b));
	        System.out.println("División: " + (a / b));
	        System.out.println("Percentatge: " + ((a / b) * 100) + "%");
	    }
	}
