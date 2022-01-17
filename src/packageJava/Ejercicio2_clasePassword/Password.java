package packageJava.Ejercicio2_clasePassword;
/**@author isabel Calzadilla
 * @version = 1.0
 * Ejercicio 2- UD8: GENERAR CONTRASEÑA
 * 
 * 2
Haz una clase llamada Password que siga las siguientes condiciones:
•
Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de 8.
•
Los constructores serán los siguiente
-
Un constructor por defecto
-
Un constructor con la longitud que nosotros le pasemos. Generara una
contraseña aleatoria con esa longitud.
 * **/
public class Password {
	protected int longitud;
	protected String passwordRandom;
	/*
	 * CONSTRUCTOR POR DEFECTO
	 * @param longitud = longitud por defecto de la contraseña
	 * @param passwordRandom = contraseña
	 * */
	public Password() {
		this.longitud = 8;
		this.passwordRandom = "";
	}
	
	/*
	 * CONSTRUCTOR CON 1 PARÁMETRO
	 * @param longitud = longitud que recibe por teclado
	 * @param passwordRandom = contraseña por defecto
	 * */
	public Password(int longitude) {
		this.longitud = longitude;
		this.passwordRandom = "";
	}
	
// MÉTODOS GETTERS Y SETTERS
	
	public void setLongitud(int longitude) {
		this.longitud = longitude;
	}
	
	public int getLongitud() {
		return this.longitud;
	}
	
	public void setPassword(String password) {
		this.passwordRandom = password;
	}
	
	public String getPasswordRandom() {
		return this.passwordRandom;
	}
	
	//MÉTODO QUE VERIFICA SI LA LONGITUD ES MENOR O NO A 8
	public boolean passwordGenerate() {
		if(this.longitud < 8) {
			return false;
		}
		return true;
	}
	
	//MÉTODO QUE GENERA LA CONTRASEÑA
	public String createPassword() {
		if(passwordGenerate()) {
			this.passwordRandom = "n3wp4ssw0rd";
		} else {
			this.passwordRandom = "La contraseña debe de ser de 8 caracteres mínimo";
		}
		return passwordRandom;
	}
}
