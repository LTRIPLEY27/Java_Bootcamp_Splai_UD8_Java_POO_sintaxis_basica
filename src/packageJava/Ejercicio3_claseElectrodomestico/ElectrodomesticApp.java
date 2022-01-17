package packageJava.Ejercicio3_claseElectrodomestico;

import java.util.Scanner;

/**@author isabel Calzadilla
 * @version = 1.0
 * Ejercicio 3- UD8: GENERAR CONTRASEÑA
 * **/
public class ElectrodomesticApp {

	public static void main(String[] args) {
	
		inicia();
	}

	public static void inicia() {
		Scanner ask = new Scanner(System.in);	
		System.out.println("Desea hacer la busqueda de un electrodomestico?\nMarque (1) para si, \nMarque (2) para cerrar");
		int eleccion = ask.nextInt();
		
		if(eleccion == 1) {
			
			do {
				System.out.println("Indique la característica del electrodomestico \nColor? (blanco, negro, rojo, azul y gris)");
				String color = ask.next().toLowerCase();
				System.out.println("\nConsumo? (A, B, C, D, E, F)");
				String consumo = ask.next().toUpperCase();
				char consume = consumo.charAt(0);// CONVERSION DE STRING A CHAR
				System.out.println("\nPeso:?");
				int peso = ask.nextInt();
				System.out.println("\nPrecio:?");
				int precio = ask.nextInt();
				
				Electrodomestic elect1 = new Electrodomestic(color, consume, peso, precio);
				System.out.println(elect1.toString());
				System.out.println("Desea hacer la busqueda de un electrodomestico?\nMarque (1) para si, \nMarque (2) para cerrar");
				eleccion = ask.nextInt();
			}while(eleccion == 1);
			System.out.println("Adiós..");
		} else {
			System.out.println("Adiós..");
		}

		ask.close();
	}
}
