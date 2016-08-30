package dominio;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Ránking con las mejores puntuaciones.
 *
 * @author Àlex Ramírez Gómez
 */
public class Ranking {

	/**
	 * Entrada del ránking.
	 *
	 * @author Àlex Ramírez Gómez
	 */
	private class Entrada implements java.lang.Comparable<Entrada> {

		/**
		 * Nombre del jugador que jugó la partida.
		 */
		String nombre;
		/**
		 * Puntuación conseguida.
		 */
		int puntos;

		/**
		 * Crea una entrada del ránking.
		 *
		 * @param nombre	Nombre del jugador que jugón la partida.
		 * @param puntos	Puntuación conseguida.
		 * @return	La nueva entrada del ránking.
		 */
		Entrada(String nombre, int puntos) {
			this.nombre = nombre;
			this.puntos = puntos;
		}

		/**
		 * Función para comparar dos entradas. Heredada de la clase Comparable.
		 *
		 * @param p	Entrada del ránking con la que se desea comparar.
		 * @return	1 si la puntuación de p es menor, -1 si la puntuación de p es
		 * mayor, 0 si ambas entradas tienen la misma puntuación.
		 */
		@Override
		public int compareTo(Entrada p) {
			if (this.puntos == p.puntos && this.nombre.equals(p.nombre)) {
				return 0;
			}
			if (this.puntos > p.puntos) {
				return 1;
			}
			if (this.puntos < p.puntos) {
				return -1;
			}
			//Orden alfabético
			//return this.nombre.compareTo(p.nombre);
			//Orden temporal
			return 0;
		}
	}
	/**
	 * Entradas del ránking.
	 */
	private ArrayList<Entrada> entradas;

	/**
	 * Crea un ránking.
	 *
	 * @return	El nuevo ránking.
	 */
	Ranking() {
		entradas = new ArrayList<Entrada>();
	}
	/**
	 * Añade una entrada al ránking en la posición adecuada.
	 *
	 * @param nombre Nombre del jugador que jugón la partida.
	 * @param puntos Puntuación conseguida.
	 */
	public void addEntrada(String nombre, int puntos) {
		Entrada e = new Entrada(nombre, puntos);
		int pos = Collections.binarySearch(entradas, e);
		if (pos < 0) {
			pos = -pos - 1;
		}
		if(entradas.size() > 0)
			while(pos < entradas.size() && entradas.get(pos).puntos == puntos)
				++pos;
		entradas.add(pos, e);
		if (entradas.size() > 10) {
			entradas.remove(10);
		}
	}

	/**
	 * Elimina todas las entradas del ránking.
	 */
	public void reset() {
		entradas = new ArrayList<Entrada>();
	}

	/**
	 * Retorna el nombre del jugador en la posición i.
	 *
	 * @param i La posición del ránking a consultar.
	 * @return El nombre del jugador en la posición i.
	 * @exception Exception Si la posición del ránking es incorrecta.
	 */
	public String getNombre(int i) throws Exception {
		if(i < 0 || i >= entradas.size())
			throw new Exception("Posición incorrecta.");
		return entradas.get(i).nombre;
	}

	/**
	 * Retorna la puntuación del jugador en la posición i.
	 *
	 * @param i La posición del ránking a consultar.
	 * @return La puntuación del jugador en la posición i.
	 * @exception Exception Si la posición del ránking es incorrecta.
	 */
	public int getPuntos(int i) throws Exception {
		if(i < 0 || i >= entradas.size())
			throw new Exception("Posición incorrecta.");
		return entradas.get(i).puntos;
	}

	/**
	 * Retorna el número de entradas en el ránking.
	 *
	 * @return El número de entradas en el ránking.
	 */
	public int getNEntradas() {
		return entradas.size();
	}
}
