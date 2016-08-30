package dominio;

import java.io.IOException;

/**
 * Controlador de ránking.
 *
 * @author Àlex Ramírez Gómez
 */
public class ControladorRanking {

	/**
	 * El ránking en cuestión.
	 */
	private Ranking r;
	private Datos.ControladorDatosRanking cdr;

	/**
	 * Crea un controlador de ránking.
	 *
	 * @return	El nuevo controlador de ránking.
	 */
	public ControladorRanking() {
		this.r = new Ranking();
		cdr = new Datos.ControladorDatosRanking();
	}

	/**
	 * Carga un ránking guardado en memoria externa.
	 *
	 * @param path El path en el que está guardado el ránking.
	 * @exception IOException Error al leer el fichero (es un directorio, no existe, fallo de permisos...).
	 */
	public void cargarRanking(String path) throws IOException {
		String[][] s = cdr.cargarRanking(path);
		r = new Ranking();
		for (int i = 0; i < s.length; ++i) {
			r.addEntrada(s[i][0], Integer.parseInt(s[i][1]));
		}
	}

	/**
	 * Guarda el ránking en memoria externa.
	 * @exception IOException Error al escribir el fichero (es un directorio, fallo de permisos...).
	 */
	public void guardarRanking(String path) throws IOException {
		cdr.guardarRanking(path, getEntradas());
	}

	/**
	 * Añade una entrada en el Ránking.
	 *
	 * @param nombre El nombre del jugador.
	 * @param puntos La puntuación del jugador.
	 */
	public void addEntrada(String nombre, int puntos) {
		r.addEntrada(nombre, puntos);
	}

	/**
	 * Vacía el ránking
	 */
	public void reset() {
		r.reset();
	}
	

	/**
	 * Retorna una matriz de String que contiene todas las entradas del ránking.
	 *
	 * @return	Una matriz de String que contiene todas las entradas del ránking.
	 */
	public String[][] getEntradas() {
		String[][] s = new String[r.getNEntradas()][2];
		for (int i = 0; i < r.getNEntradas(); ++i) {
			try{
				s[i][0] = r.getNombre(i);
				s[i][1] = Integer.toString(r.getPuntos(i));
			} catch (Exception e) {}
		}
		return s;
	}
}
