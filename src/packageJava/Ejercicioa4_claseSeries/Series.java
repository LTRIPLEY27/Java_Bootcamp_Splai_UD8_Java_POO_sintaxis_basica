package packageJava.Ejercicioa4_claseSeries;
/**@author isabel Calzadilla
 * @version = 1.0
 * Ejercicio 4- UD8: ALMACEN DE SERIES
 * 
 * 
 * 4
Crearemos una clase llamada Serie con las siguientes caracter�sticas:
�
Sus atributos son titulo, numero de temporadas entregado, genero y creador.
�
Por defecto, el numero de temporadas es de 3 temporadas y entregado false . El
resto de atributos ser�n valores por defecto seg�n el tipo del atributo.
�
Los constructores que se implementaran ser�n:
o
Un constructor por defecto.
o
Un constructor con el titulo y creador. El resto por defecto.
o
Un constructor con todos los atributos, excepto de entregado.**/
public class Series {
	protected String title;
	protected int seasons;
	protected boolean delivered;
	protected String genre;
	protected String creator;
		
	/*CONSTRUCTOR POR DEFECTO
	 * @param title = t�tulo de la serie incial
	 * @param seasons = temporadas por defecto
	 * @param delivered = entregas por defecto
	 * @param genre = g�nero t�tulo de la serie incial
	 * @param creator = creador la serie incial*/
	public Series() {
		this.title = "";
		this.seasons = 3;
		this.delivered = false;
		this.genre = "";
		this.creator = "";
	}
	/*CONSTRUCTOR CON PAR�METRO CREADOR Y T�TULO
	 * @param title = t�tulo indicado por par�metro
	 * @param seasons = temporadas por defecto
	 * @param delivered = entregas por defecto
	 * @param genre = g�nero t�tulo por defecto
	 * @param creator = creador indicado por t�clado*/
	public Series(String title, String creator ) {
		this.title = title;
		this.seasons = 3;
		this.delivered = false;
		this.genre = "";
		this.creator = creator;
	}
	/*CONSTRUCTOR CON TODOS LOS PAR{AMETROS
	 * @param title = t�tulo indicado por par�metro
	 * @param seasons = temporadas por par�metro
	 * @param delivered = entregas por defecto
	 * @param genre = g�nero t�tulo por par�metro
	 * @param creator = creador indicado por par�metro*/
	public Series(String title, int season, String genre, String creator) {
		this.title = title;
		this.seasons = season;
		this.delivered = false;
		this.genre = genre;
		this.creator = creator;
	}
	
// M�TODOS DE ACCESO
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getSeasons() {
		return seasons;
	}
	public void setSeasons(int seasons) {
		this.seasons = seasons;
	}
	public boolean isDelivered() {
		return delivered;
	}
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public void deliveredVerified(String entrega) {
		if(entrega.equals("si")) {
			this.delivered = true;
		}
	}
	
	@Override
	public String toString() {
		return "Series \nT�tulo = " + title + "\nTemporadas = " + seasons + "\nEntregado = " + delivered + "\nG�nero = " + genre
				+ "\nCreador = " + creator;
	}
}
