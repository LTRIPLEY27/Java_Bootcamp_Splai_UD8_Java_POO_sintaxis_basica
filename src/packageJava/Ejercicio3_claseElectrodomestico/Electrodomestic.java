package packageJava.Ejercicio3_claseElectrodomestico;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * @version = 1.0
 * Ejercicio 3- UD8: GENERAR CONTRASEÑA
 * **/

/*3
Crearemos una clase llamada Electrodomestico con las siguientes características:
•
Sus atributos son precio base, color, consumo energético (letras entre A y F) y peso .
Indica que se podrán heredar.
•
Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de
100 € y el peso de 5 kg. Usa constantes para ello.
•
Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre
esta en mayúsculas o en minúsculas.
•
Los constructores que se implementaran serán
o
Un constructor por defecto.
o
Un constructor con el precio y peso. El resto por defecto.
o
Un constructor con todos los atributos.*/
public class Electrodomestic {
	protected int precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	final static String COLOR = "blanco";
	final static char CONSUMO = 'F';
	final static int PRECIO = 100;
	final static int PESO = 5;
	
	/*CONSTRUCTOR POR DEFECTO
	 * @param color = color por defecto
	 * @param consumoEnergetico = consumo del electrodomestico
	 * @param precioBase = precio inicial del electrodomestico
	 * @param peso = peso inicial*/
	public Electrodomestic() {
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.precioBase = PRECIO;
		this.peso = PESO;
		//this("blanco", 'f', 100, 5);
	}
	
	/*CONSTRUCTOR CON PA{AMETROS PRECIO Y PESO
	 * @param color = color por defecto
	 * @param consumoEnergetico = consumo del electrodomestico
	 * @param precioBase = precio asignado por teclado
	 * @param peso = asignado por par{ametro*/
	public Electrodomestic(int precio, int peso) {
		this.precioBase = precio;
		this.peso = peso;
	}
	
	/*CONSTRUCTOR QUE RECIBE TODOS LOS PAÁMETROS
	 * @param color = color asignado
	 * @param consumoEnergetico = consumo asignado
	 * @param precioBase = precio asignado
	 * @param peso = peso asignado*/
	public Electrodomestic(String color, char consumo, int precio, int peso) {
		this.color = color;
		this.consumoEnergetico = consumo;
		this.precioBase = precio;
		this.peso = peso;
	}
	
	// MÉTODOS DE ACCESO
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setConsumo(char consumo) {
		this.consumoEnergetico = consumo;
	}
	
	public void setPrecio(int precio) {
		this.precioBase = precio;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public char getConsumo() {
		return this.consumoEnergetico;
	}
	
	public int getPrecio() {
		return this.precioBase;
	}
	
	public int setPeso() {
		return this.peso;
	}
	
	public void verificaColor(String colour) {//blanco, negro, rojo, azul y gris
		switch("colour") {
			case "blanco":
				this.color = colour;
				break;
			case "negro":
				this.color = colour;
				break;
			case "rojo":
				this.color = colour;
				break;
			case "azul":
				this.color = colour;
				break;
			case "gris":
				this.color = colour;
				break;
		}
		
	}
	
	public void verificaConsumo(char consumo) {
		String consume = "ABCDEF";
		for(int i = 0; i < consume.length(); i++) {
			if(consume.charAt(i) == consumo) {
				this.consumoEnergetico = consumo;
			}
		}
	}
	
	public String toString() {
		return "La descripcion del electrodoméstico  es : \nColor = " + this.color +
				"\nConsumo = " + this.consumoEnergetico + "\nPrecio = " + this.precioBase +
				"\nPeso = " + this.peso;
	
	}
}
