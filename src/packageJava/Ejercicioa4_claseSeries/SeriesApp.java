package packageJava.Ejercicioa4_claseSeries;

import javax.swing.JOptionPane;

/**@author isabel Calzadilla
 * @version = 1.0
 * Ejercicio 3- UD8: GENERAR CONTRASEÑA
 * **/
public class SeriesApp {

	public static void main(String[] args) {
		startProgram();
	}
	
	public static void startProgram() {
		String question = JOptionPane.showInputDialog("Desea almacenar serie");
		
		if(question.toLowerCase().equals("si")) {
			while(question.toLowerCase().equals("si")) {
				String title = JOptionPane.showInputDialog("Indique nombre serie");
				String season = JOptionPane.showInputDialog("Indique temporadas de la serie");
				int seasons = Integer.parseInt(season);
				String entregado = JOptionPane.showInputDialog("Indique si tiene entregas con (si) o (no)");
				String genre = JOptionPane.showInputDialog("Indique género de serie");
				String creator = JOptionPane.showInputDialog("Indique creador de la serie");
				question = JOptionPane.showInputDialog("Desea almacenar serie");
				Series serie = new Series(title, seasons, genre, creator );
				serie.deliveredVerified(entregado);
				System.out.println(serie.toString());
				
				question = JOptionPane.showInputDialog("Desea almacenar serie");
			}
			JOptionPane.showMessageDialog(null, "cierre la ventana");
		}else {
			JOptionPane.showMessageDialog(null, "cierre la ventana");
		}
	}

}
