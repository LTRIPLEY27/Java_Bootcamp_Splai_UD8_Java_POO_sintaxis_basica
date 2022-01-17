package packageJava.Ejercicio2_clasePassword;

import javax.swing.JOptionPane;

import packageJava.Ejercicio1_clasePersona.Persona;

/**@author isabel Calzadilla
 * @version = 1.0
 * Ejercicio 2- UD8: GENERAR CONTRASEÑA
 * **/
public class PasswordApp {

	public static void main(String[] args) {
		
		startProgram();
	}

	public static void startProgram() {
		String pass = JOptionPane.showInputDialog("Desea hacer  genererar contraseña ? \nMarque 1 para generar contraeña \nMarque 2 para salir del programa ");
		int response = Integer.parseInt(pass);
		boolean continu = false;
		
		if(response == 1) {
			continu = true;
			do {
				String longi = JOptionPane.showInputDialog("Indique la longitud que desea = ?");
				int longitude = Integer.parseInt(longi);
				Password password = new Password(longitude);
				JOptionPane.showConfirmDialog(null, "La nueva contraseñ@ es = " + password.createPassword());
				pass = JOptionPane.showInputDialog("Desea hacer  genererar contraseña ? \nMarque 1 para generar contraeña \nMarqe 2 para salir del programa ");
				response = Integer.parseInt(pass);
			}while(continu);
		} else {
			JOptionPane.showMessageDialog(null, "hasta luego " );
		}
	}
}
