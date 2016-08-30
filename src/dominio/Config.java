package dominio;

/**
 * Clase que representa una configuración de partida.
 *
 * @author Àlex Ramírez Gómez
 */
public abstract class Config {

	/**
	 * Indica si la regla de la tarta est� habilitada.
	 */
	private boolean tarta;
	/**
	 * Indica si se ha realizado un cambio de bandos en la regla de la tarta
	 * (s�lo si la regla de la tarta está activada).
	 */
	private boolean cambio;
	/**
	 * Indica si las ayudas están habilitadas.
	 */
	private boolean ayuda;
	/**
	 * Indica si la opción de deshacer está habilitada.
	 */
	private boolean deshacer;
	/**
	 * El jugador que realiza la primera jugada.
	 */
	private int apertura;
	/**
	 * El tipo del jugador1.
	 */
	private boolean humano1;
	/**
	 * El tipo del jugador2.
	 */
	private boolean humano2;
	/**
	 * El tamaño del tablero.
	 */
	private int tamanno;
	/**
	 * La dificultad de la IA1.
	 */
	private int difIA1;
	/**
	 * La dificultad de la IA2.
	 */
	private int difIA2;
	/**
	 * La profundidad de la IA1.
	 */
	private int profIA1;
	/**
	 * La profundidad de la IA2.
	 */
	private int profIA2;
	/**
	 * La ramificación de la IA1.
	 */
	private int ramIA1;
	/**
	 * La ramificación de la IA2.
	 */
	private int ramIA2;
	/**
	 * El nombre del jugador 1.
	 */
	private String nombre1;
	/**
	 * El nombre del jugador 2.
	 */
	private String nombre2;

	/**
	 * Crea una configuración de partida.
	 *
	 * @param tarta	Indica si la regla de la tarta está habilitada.
	 * @param cambio	Indica si se ha realizado un cambio de bandos durante la regla de la tarta.
	 * @param ayuda	Indica si las ayudas están habilitadas.
	 * @param deshacer	Indica si la opcián de deshacer está habilitada.
	 * @param apertura	El jugador que realiza la primera jugada (0 para apertura aleatoria).
	 * @param humano1	El tipo del jugador1.
	 * @param humano2	El tipo del jugador2.
	 * @param tamanno	El tamaño del tablero.
	 * @param difIA1	El nivel de dificultad de la IA 1.
	 * @param difIA2	El nivel de dificultad de la IA 2.
	 * @param profIA1	La profundidad de la IA 1.
	 * @param profIA2	La profundidad de la IA 2.
	 * @param ramIA1	La ramificación de la IA 1.
	 * @param ramIA2	La ramificación de la IA 2.
	 * @param nombre1	El nombre del jugador 1.
	 * @param nombre2	El nombre del jugador 2.
	 * @return	La nueva partida.
	 * @exception Exception Si la apertura es inválida.
	 */
	public Config(boolean tarta, boolean cambio, boolean ayuda, boolean deshacer, int apertura, boolean humano1, boolean humano2, int tamanno, int difIA1, int difIA2, int profIA1, int profIA2, int ramIA1, int ramIA2, String nombre1, String nombre2) throws Exception {
		if(apertura != 0 && apertura!= 1 && apertura!= 2)
			throw new Exception("Identificador de jugador incorrecto.");
		this.tarta = tarta;
		this.cambio = cambio;
		this.ayuda = ayuda;
		this.deshacer = deshacer;
		this.apertura = apertura;
		this.humano1 = humano1;
		this.humano2 = humano2;
		this.tamanno = tamanno;
		this.difIA1 = difIA1;
		this.difIA2 = difIA2;
		this.profIA1 = profIA1;
		this.profIA2 = profIA2;
		this.ramIA1 = ramIA1;
		this.ramIA2 = ramIA2;
		this.nombre1 = nombre1;
		this.nombre2 = nombre2;
	}

	/**
	 * Crea una configuración de partida.
	 *
	 * @return	La nueva configuración.
	 */
	public Config() {
		tarta = true;
		cambio = false;
		ayuda = false;
		deshacer = false;
		apertura = 0;
		humano1 = true;
		humano2 = false;
		tamanno = 5;
		difIA1 = difIA2 = 1;
		profIA1 = profIA2 = 1;
		ramIA1 = ramIA2 = 1;
		nombre1 = "Jugadaor 1";
		nombre2 = "Jugador 2";
	}

	/**
	 * Retorna si la regla de la tarta está habilitada.
	 *
	 * @return Indica si la regla de la tarta está habilitada.
	 */
	public boolean getTarta() {
		return tarta;
	}

	/**
	 * Retorna si se ha realizado un cambio de bandos durante la regla de la tarta.
	 *
	 * @return Indica se ha realizado un cambio de bandos durante la regla de la tarta.
	 */
	public boolean getCambio() {
		return cambio;
	}

	/**
	 * Retorna si las ayudas están habilitadas.
	 *
	 * @return Indica si las ayudas están habilitadas.
	 */
	public boolean getAyuda() {
		return ayuda;
	}

	/**
	 * Retorna si la opción de deshacer está habilitada.
	 *
	 * @return Indica si la opción de deshacer estó habilitada.
	 */
	public boolean getDeshacer() {
		return deshacer;
	}

	/**
	 * Retorna el jugador que realiza la primera jugada (0 si es aleatorio).
	 *
	 * @return El jugador que realiza la primera jugada (0 si es aleatorio).
	 */
	public int getApertura() {
		return apertura;
	}

	/**
	 * Retorna si el jugador1 es humano o no.
	 *
	 * @return Si el jugador1 es humano o no.
	 */
	public boolean getHumano1() {
		return humano1;
	}

	/**
	 * Retorna si el jugador2 es humano o no.
	 *
	 * @return Si el jugador2 es humano o no.
	 */
	public boolean getHumano2() {
		return humano2;
	}

	/**
	 * Retorna el taaño del tablero.
	 *
	 * @return El tamaño del tablero.
	 */
	public int getTamanno() {
		return tamanno;
	}

	/**
	 * Retorna la dificultad de la IA 1.
	 *
	 * @return La dificultad de la IA 1.
	 */
	public int getDifIA1() {
		return difIA1;
	}

	/**
	 * Retorna la dificultad de la IA 2.
	 *
	 * @return La dificultad de la IA 2.
	 */
	public int getDifIA2() {
		return difIA2;
	}

	/**
	 * Retorna la profundidad de la IA 1.
	 *
	 * @return La profundidad de la IA 1.
	 */
	public int getProfIA1() {
		return profIA1;
	}

	/**
	 * Retorna la profundidad de la IA 2.
	 *
	 * @return La profundidad de la IA 2.
	 */
	public int getProfIA2() {
		return profIA2;
	}

	/**
	 * Retorna la ramificación de la IA 1.
	 *
	 * @return La ramificación de la IA 1.
	 */
	public int getRamIA1() {
		return ramIA1;
	}

	/**
	 * Retorna la ramificación de la IA 2.
	 *
	 * @return La ramificación de la IA 2.
	 */
	public int getRamIA2() {
		return ramIA2;
	}

	/**
	 * Retorna el nombre del jugador 1.
	 *
	 * @return El nombre del jugador 1.
	 */
	public String getNombre1() {
		return nombre1;
	}

	/**
	 * Retorna el nombre del jugador 2.
	 *
	 * @return El nombre del jugador 2.
	 */
	public String getNombre2() {
		return nombre2;
	}

	/**
	 * Establece si la regla de la tarta está habilitada.
	 *
	 * @param tarta Indica si la regla de la tarta está habilitada.
	 */
	public void setTarta(boolean tarta) {
		this.tarta = tarta;
	}

	/**
	 * Establece si se ha realizado un cambio de bandos durante la regla de la tarta.
	 *
	 * @param cambio Indica si se ha realizado un cambio de bandos durante la regla de la tarta.
	 */
	public void setCambio(boolean cambio) {
		this.cambio = cambio;
	}

	/**
	 * Establece si las ayudas están habilitadas.
	 *
	 * @param ayuda Indica si las ayudas están habilitadas.
	 */
	public void setAyuda(boolean ayuda) {
		this.ayuda = ayuda;
	}

	/**
	 * Establece si la opción de deshacer está habilitada.
	 *
	 * @param deshacer Indica si la opción de deshacer está habilitada.
	 */
	public void setDeshacer(boolean deshacer) {
		this.deshacer = deshacer;
	}

	/**
	 * Establece el jugador que realiza la primera jugada (0 para apertura aleatoria).
	 *
	 * @param apertura El jugador que realiza la primera jugada (0 para apertura aleatoria).
	 * @exception Exception Si la apertura es inválida.
	 */
	public void setApertura(int apertura) throws Exception {
		if(apertura != 0 && apertura != 1 && apertura != 2)
			throw new Exception("Apertura inválida");
		this.apertura = apertura;
	}

	/**
	 * Establece si el jugador1 es humano o no.
	 *
	 * @humano Si el jugador1 es humano o no.
	 */
	public void setHumano1(boolean humano) {
		humano1 = humano;
	}

	/**
	 * Establece si el jugador2 es humano o no.
	 *
	 * @humano Si el jugador2 es humano o no.
	 */
	public void setHumano2(boolean humano) {
		humano2 = humano;
	}

	/**
	 * Establece el tamaño del tablero.
	 *
	 * @param x El tamaño del tablero.
	 * @throws Exception Si el tamaño es inválido.
	 */
	public void setTamanno(int x) throws Exception {
		if(x < 3)
			throw new Exception("Tamaño de tablero incorrecto: " + x);
		tamanno = x;
	}

	/**
	 * Establece la dificultad de la IA 1.
	 *
	 * @param x La dificultad de la IA 1.
	 * @throws Exception Si la dificultad es inválida.
	 */
	public void setDifIA1(int x) throws Exception {
		if(x < 0 || x > 4)
			throw new Exception("Dificultad incorrecta: " + x);
		difIA1 = x;
	}

	/**
	 * Establece la dificultad de la IA 2.
	 *
	 * @param x La dificultad de la IA 2.
	 * @throws Exception Si la dificultad es inválida.
	 */
	public void setDifIA2(int x) throws Exception {
		if(x < 0 || x > 4)
			throw new Exception("Dificultad incorrecta: " + x);
		difIA2 = x;
	}

	/**
	 * Establece la profundidad de la IA 1.
	 *
	 * @param x La profundidad de la IA 1.
	 * @throws Exception Si la profundidad es inválida.
	 */
	public void setProfIA1(int x) throws Exception {
		if(x < 0)
			throw new Exception("Profundidad incorrecta: " + x);
		profIA1 = x;
	}

	/**
	 * Establece la profundidad de la IA 2.
	 *
	 * @param x La profundidad de la IA 2.
	 * @throws Exception Si la profundidad es inválida.
	 */
	public void setProfIA2(int x) throws Exception {
		if(x < 0)
			throw new Exception("Profundidad incorrecta: " + x);
		profIA2 = x;
	}

	/**
	 * Establece la ramificación de la IA 1.
	 *
	 * @param x La ramificación de la IA 1.
	 * @throws Exception Si la ramificación es inválida.
	 */
	public void setRamIA1(int x) throws Exception {
		if(x < 0)
			throw new Exception("Ramificación incorrecta: " + x);
		ramIA1 = x;
	}

	/**
	 * Establece la ramificación de la IA 2.
	 *
	 * @param x La ramificación de la IA 2.
	 * @throws Exception Si la ramificación es inválida.
	 */
	public void setRamIA2(int x) throws Exception {
		if(x < 0)
			throw new Exception("Ramificación incorrecta: " + x);
		ramIA2 = x;
	}

	/**
	 * Establece el nombre del jugador 1.
	 *
	 * @param s El nombre del jugador 1.
	 * @throws Exception Si el nombre es inválido.
	 */
	public void setNombre1(String s) throws Exception {
		if(s == null || s == "")
			throw new Exception("Nombre incorrecto.");
		nombre1 = s;
	}

	/**
	 * Establece el nombre del jugador 2.
	 *
	 * @param s El nombre del jugador 2.
	 * @throws Exception Si el nombre es inválido.
	 */
	public void setNombre2(String s) throws Exception {
		if(s == null || s == "")
			throw new Exception("Nombre incorrecto.");
		nombre2 = s;
	}
}
