package packageJava.Ejercicio1_clasePersona;

/**@author isabel Calzadilla
 * @version = 1.0
 * Ejercicio 1- UD8: DEFINICION CLASE PERSONA
 * **/

/*1
Haz una clase llamada Persona que siga las siguientes condiciones:
•
Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y No
queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el
más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.
•
Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0
números, cadena vacía para String , etc.). Sexo sera hombre por defecto, usa una
constante para ello.
•
Se implantaran varios constructores:
o
Un constructor por defecto.
o
Un constructor con el nombre, edad y sexo, el resto por defecto.
o
Un constructor con todos los atributos como parámetro.*/
public class Persona {
	private String  name;
	private String dni;
	private int age = 0;
	private final static  String sexo = "H";
	private String sex = sexo;
	private int weight;
	
	/*
	 * CONSTRUCTOR DEFAULT QUE INICIALIZA LOS ATRIBUTOS Y VALORES DE LOS MISMOS
	 * @param name = ""
	 * @param age = 0
	 * @param weight = 0
	 * */
	public Persona() { 
		this.name = "";
		this.age = 0;
		this.weight = 0;
	}
	/*
	 * CONSTRUCTOR CON PARÁMETROS = NOMBRE, EDAD Y SEXO
	 * @param name = String name
	 * @param age = int age
	 * @param sex = String sex
	 * @param weight = 0
	 * */
	public Persona(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.weight = 0;
	}
	

	/*
	 * CONSTRUCTOR CON PARÁMETROS = NOMBRE, DNI, EDAD, SEXO Y PESO
	 * @param name = String name
	 * @param dni = String dni
	 * @param age = int age
	 * @param sex = String sex
	 * @param weight = 0
	 * */
	public Persona(String name, String dni, int age, String sex, int weight) {
		this.name = name;
		this.dni = dni;
		this.age = age;
		this.sex = sex;
		this.weight = weight;
	}
	
	public static boolean sexIs(Persona person) {
		if(person.sex.equals("H")) {
			return true;
		}
		
		return false;
	}
	
}