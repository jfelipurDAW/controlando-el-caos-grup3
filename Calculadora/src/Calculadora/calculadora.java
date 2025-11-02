package Calculadora;

import java.util.Scanner;


	public class calculadora {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("=== Calculadora Básica ===");
	        double a = 0;
	        double b = 0;
	        double volumen = 0;
	        System.out.println("Introcuce el número que quieres elevar:");
	        a = sc.nextDouble();
	        System.out.println("Introcuce el número que quieres elevar:");
	        b = sc.nextDouble();
	        volumen = Math.pow(a, b);
	    
	        System.out.println("Suma: " + (a + b));
	        System.out.println("Resta: " + (a - b));
	        System.out.println("Multiplicación: " + (a * b));
	        System.out.println("División: " + (a / b));
	        System.out.println("Potencia a^b:" + volumen);
	    }
	}

	        System.out.println("Percentatge: " + ((a / b) * 100) + "%");
	    }
	}
