package dominio;

/**
 * Clase que representa la configuración de una partida contrarreloj.
 *
 * @author Àlex Ramírez Gómez
 */
public class ConfigContrarreloj extends Config {

	/**
	 * Duración máxima de un turno.
	 */
	private int duracion_turno;

	/**
	 * Crea una partida contrarreloj.
	 *
	 * @return	La nueva configuración de partida contrarreloj.
	 */
	public ConfigContrarreloj() {
		super();
		this.duracion_turno = 1;
	}

	/**
	 * Crea una configuración de partida contrarreloj.
	 *
	 * @param tarta	Indica si la regla de la tarta est� habilitada.
	 * @param cambio	Indica si se ha realizado un cambio de bandos durante la regla de la tarta.
	 * @param ayuda	Indica si las ayudas están habilitadas.
	 * @param deshacer	Indica si la opción de deshacer está habilitada.
	 * @param apertura	El jugador que realiza la primera jugada (0 para apertura aleatoria).
	 * @param duracion_turno	Duración máxima de un turno.
	 * @param humano1	Si el jugador1 es humano o no.
	 * @param humano2	Si el jugador2 es humano o no.
	 * @param tamanno	El tamaño del tablero.
	 * @param difIA1	El nivel de dificultad de la IA 1.
	 * @param difIA2	El nivel de dificultad de la IA 2.
	 * @param profIA1	La profundidad de la IA 1.
	 * @param profIA2	La profundidad de la IA 2.
	 * @param ramIA1	La ramificación de la IA 1.
	 * @param ramIA2	La ramificación de la IA 2.
	 * @param nombre1	El nombre del jugador 1.
	 * @param nombre2	El nombre del jugador 2.
	 * @return	La nueva configuración de partida contrarreloj.
	 * @exception Exception Si la apertura es inválida.
	 * @exception Exception Si la duración del turno es negativa o 0.
	 */
	public ConfigContrarreloj(boolean tarta, boolean cambio, boolean ayuda, boolean deshacer, int apertura, boolean humano1, boolean humano2, int duracion_turno, int tamanno, int difIA1, int difIA2, int profIA1, int profIA2, int ramIA1, int ramIA2, String nombre1, String nombre2) throws Exception {
		super(tarta, cambio, ayuda, deshacer, apertura, humano1, humano2, tamanno, difIA1, difIA2, profIA1, profIA2, ramIA1, ramIA2, nombre1, nombre2);
		if(duracion_turno <= 0)
			throw new Exception("La duración del turno debe ser mayor que 0.");
		this.duracion_turno = duracion_turno;
	}

	/**
	 * Retorna la duración máxima de un turno.
	 *
	 * @return Duración máxima de un turno.
	 */
	public int getDuracionTurno() {
		return duracion_turno;
	}

	/**
	 * Establece la duración máxima de un turno.
	 *
	 * @param time Duración máxima de un turno.
	 * @exception Exception Si la duración del turno es negativa o 0.
	 */
	public void setDuracionTurno(int time) throws Exception {
		if(duracion_turno <= 0)
			throw new Exception("La duración del turno debe ser mayor que 0.");
		this.duracion_turno = time;
	}
}
