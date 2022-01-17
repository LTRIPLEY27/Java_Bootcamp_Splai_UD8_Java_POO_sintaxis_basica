package packageJava.Ejercicio1_clasePersona;
/**@author isabel Calzadilla
 * @version = 1.0
 * Ejercicio 1- UD8: DEFINICION CLASE PERSONA
 * **/
public class PersonaApp {

	public static void main(String[] args) {
		startProgram();
	}
	
	public static void startProgram() {
		Persona persona1 = new Persona();
		
		Persona persona2 = new Persona("Elena", 24, "M");
		
		Persona persona3 = new Persona("Arthur", "2238485g", 27, "M", 78);

		sexVerified(persona3.sexIs(persona3));
	}

	public static void sexVerified(boolean sex) {
		if(sex) {
			System.out.println("El sexo es masculino");
		} else if(!sex){
			System.out.println("El sexo es femenino");
		} else {
			System.out.println("El sexo es indeterminado");
		}
	}
}
