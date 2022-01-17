package packageJava.Ejercicio2_clasePassword;
/**@author isabel Calzadilla
 * @version = 1.0
 * Ejercicio 2- UD8: GENERAR CONTRASE�A
 * 
 * 2
Haz una clase llamada Password que siga las siguientes condiciones:
�
Que tenga los atributos longitud y contrase�a . Por defecto, la longitud ser� de 8.
�
Los constructores ser�n los siguiente
-
Un constructor por defecto
-
Un constructor con la longitud que nosotros le pasemos. Generara una
contrase�a aleatoria con esa longitud.
 * **/
public class Password {
	protected int longitud;
	protected String passwordRandom;
	/*
	 * CONSTRUCTOR POR DEFECTO
	 * @param longitud = longitud por defecto de la contrase�a
	 * @param passwordRandom = contrase�a
	 * */
	public Password() {
		this.longitud = 8;
		this.passwordRandom = "";
	}
	
	/*
	 * CONSTRUCTOR CON 1 PAR�METRO
	 * @param longitud = longitud que recibe por teclado
	 * @param passwordRandom = contrase�a por defecto
	 * */
	public Password(int longitude) {
		this.longitud = longitude;
		this.passwordRandom = "";
	}
	
// M�TODOS GETTERS Y SETTERS
	
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
	
	//M�TODO QUE VERIFICA SI LA LONGITUD ES MENOR O NO A 8
	public boolean passwordGenerate() {
		if(this.longitud < 8) {
			return false;
		}
		return true;
	}
	
	//M�TODO QUE GENERA LA CONTRASE�A
	public String createPassword() {
		if(passwordGenerate()) {
			this.passwordRandom = "n3wp4ssw0rd";
		} else {
			this.passwordRandom = "La contrase�a debe de ser de 8 caracteres m�nimo";
		}
		return passwordRandom;
	}
}
