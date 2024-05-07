package boletin1.ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Variable donde se guardara el número double
		double doble;
		
		// Variable donde se guardara el número entero
		int integer;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner (System.in);
		
		// Asignamos a la variable doble el método leer double
		doble = readDouble(sc);
		
		// Limpiamos 
		sc.nextLine();
		
		// Asignamos a la variable doble el método leer double 
		integer = readInt(sc);

		// Imprimimos el double
		System.out.println(doble);
		
		// Imprimimos el entero
		System.out.println(integer);
		
		sc.close();
	}
	
	/**
	 * Método para leer el número double
	 * @param sc Parámetro de tipo Scanner para leer el double
	 * @return Devuelve el double introducido
	 */
	public static double readDouble(Scanner sc) {
		double resultado;
		
		try {
			System.out.println("Escribe un doble");
			resultado = sc.nextDouble();			
		} catch (InputMismatchException e ) {
			System.out.println("Valor de mierda");
			resultado = 0;
		}
		
		return resultado;
	}
	
	/**
	 * Método para leer el entero
	 * @param sc Parámetro de tipo Scanner para leer el int
	 * @return Devuelve el entero
	 */
	public static int readInt(Scanner sc) {
		int resultado;
		
		try {
			System.out.println("Escribe un entero");
			resultado = sc.nextInt();			
		} catch (InputMismatchException e ) {
			System.out.println("Valor de mierda");
			resultado = 0;
		}
		
		return resultado;
	}

}
