package dominio;

import java.io.IOException;

/**
 * Controlador de configuración de partida.
 *
 * @author Àlex Ramírez Gómez
 */
public class ControladorConfig {

	/**
	 * La partida en cuesti�n.
	 */
	private Config config;
	private Datos.ControladorDatosConfig datos;
	private String PATH_PREDETERMINADO = "hexConfig";

	/**
	 * Crea un controlador de configuración de partida.
	 */
	public ControladorConfig() {
		datos = new Datos.ControladorDatosConfig();
		cargarConfigPredeterminada();
	}

	/**
	 * Crea un controlador de configuración de partida.
	 *
	 * @param tarta	Indica si la regla de la tarta est� habilitada.
	 * @param cambio	Indica si se ha realizado un cambio de bandos en la regla
	 * de la tarta (s�lo si la regla de la tarta est� activada y la partida est�
	 * m�s all� del 2� turno).
	 * @param ayuda	Indica si las ayudas est�n habilitadas.
	 * @param deshacer	Indica si la opci�n de deshacer est� habilitada.
	 * @param apertura	El jugador que realiza la primera jugada.
	 * @param duracion_turno	Duraci�n m�xima de un turno.
	 * @param humano1	Si el jugador1 es humano o no.
	 * @param humano2	Si el jugador2 es humano o no.
	 * @param duracion_turno	La duración máxima del turno.
	 * @param tamanno	El tamaño del tablero.
	 * @param difIA1	El nivel de dificultad de la IA 1.
	 * @param difIA2	El nivel de dificultad de la IA 2.
	 * @param profIA1	La profundidad de la IA 1.
	 * @param profIA2	La profundidad de la IA 2.
	 * @param ramIA1	La ramificación de la IA 1.
	 * @param ramIA2	La ramificación de la IA 2.
	 * @param nombre1	El nombre del jugador 1.
	 * @param nombre2	El nombre del jugador 2.
	 * @return	El nuevo controlador de configuración de partida.
	 * @exception Exception Si la apertura es inválida.
	 * @exception Exception Si la duración del turno es negativa o 0.
	 */
	public ControladorConfig(boolean tarta, boolean cambio, boolean ayuda, boolean deshacer, int apertura, boolean humano1, boolean humano2, int duracion_turno, int tamanno, int difIA1, int difIA2, int profIA1, int profIA2, int ramIA1, int ramIA2, String nombre1, String nombre2) throws Exception {
		config = new ConfigContrarreloj(tarta, cambio, ayuda, deshacer, apertura, humano1, humano2, duracion_turno, tamanno, difIA1, difIA2, profIA1, profIA2, ramIA1, ramIA2, nombre1, nombre2);
		datos = new Datos.ControladorDatosConfig();
	}

	/**
	 * Crea un controlador de configuración de partida.
	 *
	 * @param tarta	Indica si la regla de la tarta est� habilitada.
	 * @param cambio	Indica si se ha realizado un cambio de bandos en la regla
	 * de la tarta (s�lo si la regla de la tarta est� activada y la partida est�
	 * m�s all� del 2� turno).
	 * @param ayuda	Indica si las ayudas est�n habilitadas.
	 * @param deshacer	Indica si la opci�n de deshacer est� habilitada.
	 * @param apertura	El jugador que realiza la primera jugada.
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
	 * @return	El nuevo controlador de configuración de partida.
	 * @exception Exception Si la apertura es inválida.
	 */
	public ControladorConfig(boolean tarta, boolean cambio, boolean ayuda, boolean deshacer, int apertura, boolean humano1, boolean humano2, int tamanno, int difIA1, int difIA2, int profIA1, int profIA2, int ramIA1, int ramIA2, String nombre1, String nombre2) throws Exception {
		config = new ConfigNormal(tarta, cambio, ayuda, deshacer, apertura, humano1, humano2, tamanno, difIA1, difIA2, profIA1, profIA2, ramIA1, ramIA2, nombre1, nombre2);
		datos = new Datos.ControladorDatosConfig();
	}

	/**
	 * Retorna si la regla de la tarta est� habilitada.
	 *
	 * @return Indica si la regla de la tarta est� habilitada.
	 */
	public boolean getTarta() {
		return config.getTarta();
	}

	/**
	 * Retorna si se ha realizado un cambio de bandos en la regla de la tarta.
	 *
	 * @return Indica si se ha realizado un cambio de bandos en la regla de la tarta.
	 */
	public boolean getCambio() {
		return config.getCambio();
	}

	/**
	 * Retorna si las ayudas est�n habilitadas.
	 *
	 * @return Indica si las ayudas est�n habilitadas.
	 */
	public boolean getAyuda() {
		return config.getAyuda();
	}

	/**
	 * Retorna si la funci�n de deshacer est� habilitada.
	 *
	 * @return Indica si la funci�n de deshacer est� habilitada.
	 */
	public boolean getDeshacer() {
		return config.getDeshacer();
	}

	/**
	 * Retorna el jugador que realiza la primera jugada.
	 *
	 * @return El jugador que realiza la primera jugada.
	 */
	public int getApertura() {
		return config.getApertura();
	}

	/**
	 * Retorna si el jugador1 es humano o no.
	 *
	 * @return Si el jugador1 es humano o no.
	 */
	public boolean getHumano1() {
		return config.getHumano1();
	}

	/**
	 * Retorna si el jugador2 es humano o no.
	 *
	 * @return Si el jugador2 es humano o no.
	 */
	public boolean getHumano2() {
		return config.getHumano2();
	}

	/**
	 * Retorna la configuración.
	 *
	 * @return la configuración.
	 */
	public Config getConfig() {
		return config;
	}

	/**
	 * Retorna la duración del turno.
	 *
	 * @return El la duración del turno. Retorna 0 si no hay límite de tiempo.
	 * @exception Exception Si la partida no tiene límite de tiempo por turno.
	 */
	public int getDuracionTurno() throws Exception {
		if(config instanceof ConfigNormal)
			throw new Exception("La partida no tiene límite de tiempo.");
		return ((ConfigContrarreloj) config).getDuracionTurno();
	}

	/**
	 * Retorna el taaño del tablero.
	 *
	 * @return El tamaño del tablero.
	 */
	public int getTamanno() {
		return config.getTamanno();
	}

	/**
	 * Retorna la dificultad de la IA 1.
	 *
	 * @return La dificultad de la IA 1.
	 */
	public int getDifIA1() {
		return config.getDifIA1();
	}

	/**
	 * Retorna la dificultad de la IA 2.
	 *
	 * @return La dificultad de la IA 2.
	 */
	public int getDifIA2() {
		return config.getDifIA2();
	}

	/**
	 * Retorna la profundidad de la IA 1.
	 *
	 * @return La profundidad de la IA 1.
	 */
	public int getProfIA1() {
		return config.getProfIA1();
	}

	/**
	 * Retorna la profundidad de la IA 2.
	 *
	 * @return La profundidad de la IA 2.
	 */
	public int getProfIA2() {
		return config.getProfIA2();
	}

	/**
	 * Retorna la ramificación de la IA 1.
	 *
	 * @return La ramificación de la IA 1.
	 */
	public int getRamIA1() {
		return config.getRamIA1();
	}

	/**
	 * Retorna la ramificación de la IA 2.
	 *
	 * @return La ramificación de la IA 2.
	 */
	public int getRamIA2() {
		return config.getRamIA2();
	}

	/**
	 * Retorna el nombre del jugador 1.
	 *
	 * @return El nombre del jugador 1.
	 */
	public String getNombre1() {
		return config.getNombre1();
	}

	/**
	 * Retorna el nombre del jugador 2.
	 *
	 * @return El nombre del jugador 2.
	 */
	public String getNombre2() {
		return config.getNombre2();
	}


	/**
	 * Establece si la regla de la tarta est� habilitada.
	 *
	 * @param tarta Indica si la regla de la tarta est� habilitada.
	 */
	public void setTarta(boolean tarta) {
		config.setTarta(tarta);
	}

	/**
	 * Establece si se ha realizado un cambio de bandos en la regla de la tarta
	 * (s�lo si la regla de la tarta est� activada y la partida est� m�s all�
	 * del 2� turno).
	 *
	 * @param cambio Indica si se ha realizado un cambio de bandos en la regla
	 * de la tarta (s�lo si la regla de la tarta est� activada y la partida est�
	 * m�s all� del 2� turno).
	 */
	public void setCambio(boolean cambio) {
		config.setCambio(cambio);
	}

	/**
	 * Establece si las ayudas est�n habilitadas.
	 *
	 * @param ayuda Indica si las ayudas est�n habilitadas.
	 */
	public void setAyuda(boolean ayuda) {
		config.setAyuda(ayuda);
	}

	/**
	 * Establece si la funci�n de deshacer est� habilitada.
	 *
	 * @param deshacer Indica si la funci�n de deshacer est� habilitada.
	 */
	public void setDeshacer(boolean deshacer) {
		config.setDeshacer(deshacer);
	}

	/**
	 * Establece el jugador que realiza la primera jugada.
	 *
	 * @param apertura El jugador que realiza la primera jugada.
	 * @exception Exception Si la apertura es inválida.
	 */
	public void setApertura(int apertura) throws Exception {
		config.setApertura(apertura);
	}



	/**
	 * Establece si el jugador1 es humano o no.
	 *
	 * @param humano Si el jugador1 es humano o no.
	 */
	public void setHumano1(boolean humano) {
		config.setHumano1(humano);
	}

	/**
	 * Establece si el jugador2 es humano o no.
	 *
	 * @param humano Si el jugador2 es humano o no.
	 */
	public void setHumano2(boolean humano) {
		config.setHumano2(humano);
	}

	/**
	 * Establece la duración del turno.
	 *
	 * @param time La duración del turno. Si es 0, la partida no tiene límite de
	 * tiempo.
	 * @exception Exception Si la duración del turno es negativa.
	 */
	public void setDuracionTurno(int time) throws Exception {
		if(time < 0)
			throw new Exception("La duración del turno debe ser mayor que 0.");
		if(config instanceof ConfigNormal && time != 0)
			config = new ConfigContrarreloj(config.getTarta(), config.getCambio(), config.getAyuda(), config.getDeshacer(), config.getApertura(), config.getHumano1(), config.getHumano2(), time, config.getTamanno(), config.getDifIA1(), config.getDifIA2(), config.getProfIA1(), config.getProfIA2(), config.getRamIA1(), config.getRamIA2(), config.getNombre1(), config.getNombre2());
		else if(config instanceof ConfigContrarreloj) {
			if(time == 0)
				config = new ConfigNormal(config.getTarta(), config.getCambio(), config.getAyuda(), config.getDeshacer(), config.getApertura(), config.getHumano1(), config.getHumano2(), config.getTamanno(), config.getDifIA1(), config.getDifIA2(), config.getProfIA1(), config.getProfIA2(), config.getRamIA1(), config.getRamIA2(), config.getNombre1(), config.getNombre2());
			else
				((ConfigContrarreloj) config).setDuracionTurno(time);
		}
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
		config.setTamanno(x);
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
		config.setDifIA1(x);
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
		config.setDifIA2(x);
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
		config.setProfIA1(x);
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
		config.setProfIA2(x);
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
		config.setRamIA1(x);
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
		config.setRamIA2(x);
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
		config.setNombre1(s);
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
		config.setNombre2(s);
	}

	/**
	 * Establece la configuración.
	 *
	 * @param c La configuración.
	 */
	public void setConfig(Config c) {
		config = c;
	}

	/**
	 * Carga una configuración.
	 *
	 * @param path Path donde se encuentra la configuración guardada.
	 * @exception IOException Error al leer el fichero (es un directorio, no existe, fallo de permisos...).
	 * @exception Exception Error al crear la configuración;
	 */
	public void cargarConfig(String path) throws IOException, Exception {
		//System.err.println("cargarConfig");
		String i[] = datos.cargarConfig(path);
		/*System.err.println("dominio:");
		for(String s : i)
			System.err.print(s + " ");
		System.err.println();*/
		boolean tarta = Integer.parseInt(i[0]) != 0;
		boolean cambio = Integer.parseInt(i[1]) != 0;
		boolean ayuda = Integer.parseInt(i[2]) != 0;
		boolean deshacer = Integer.parseInt(i[3]) != 0;
		int		apertura = Integer.parseInt(i[4]);
		boolean humano1 = Integer.parseInt(i[5]) != 0;
		boolean humano2 = Integer.parseInt(i[6]) != 0;
		int		tamanno = Integer.parseInt(i[7]);
		int		difIA1 = Integer.parseInt(i[8]);
		int		difIA2 = Integer.parseInt(i[9]);
		int		profIA1 = Integer.parseInt(i[10]);
		int		profIA2 = Integer.parseInt(i[11]);
		int		ramIA1 = Integer.parseInt(i[12]);
		int		ramIA2 = Integer.parseInt(i[13]);
		String	nombre1 = i[14];
		String	nombre2 = i[15];
		if (i.length == 17) {
			int duracion_turno = Integer.parseInt(i[16]);
			config = new ConfigContrarreloj(tarta, cambio, ayuda, deshacer, apertura, humano1, humano2, duracion_turno, tamanno, difIA1, difIA2, profIA1, profIA2, ramIA1, ramIA2, nombre1, nombre2);
		} else {
			config = new ConfigNormal(tarta, cambio, ayuda, deshacer, apertura, humano1, humano2, tamanno, difIA1, difIA2, profIA1, profIA2, ramIA1, ramIA2, nombre1, nombre2);
		}
	}

	/**
	 * Carga la configuración predeterminada.
	 */
	public final void cargarConfigPredeterminada() {
		//System.err.println("cargarConfigPredeterminada");
		try {
			cargarConfig(PATH_PREDETERMINADO);
		} catch (Exception e) {
			//System.err.println("Se crea una nueva config predeterminada.");
			config = new ConfigNormal();
		}
	}

	/**
	 * Guarda una configuración.
	 *
	 * @param path Path donde guardar la configuración guardada.
	 * @exception IOException Error al escribir el fichero (es un directorio, fallo de permisos...).
	 */
	public void guardarConfig(String path) throws IOException {
		//System.err.println("guardarConfig");
		datos.guardarConfig(path, transformar());
	}

	/**
	 * Guarda una configuración como predeterminada.
	 * @exception IOException Error al escribir el fichero (es un directorio, fallo de permisos...).
	 */
	public void guardarConfigPredeterminada() throws IOException {
		//System.err.println("guardarConfigPredeterminada");
		guardarConfig(PATH_PREDETERMINADO);
	}

	/**
	 * Retorna la configuración como tipos básicos.
	 *
	 * @return La configuración como tipos básicos.
	 */
	public String[] transformar() {
		String[] i = new String[16];
		if(config instanceof ConfigContrarreloj)
			i = new String[17];
		i[0] = getTarta() ? "1" : "0";
		i[1] = getCambio() ? "1" : "0";
		i[2] = getAyuda() ? "1" : "0";
		i[3] = getDeshacer() ? "1" : "0";
		i[4] = new Integer(getApertura()).toString();
		i[5] = getHumano1() ? "1" : "0";
		i[6] = getHumano2() ? "1" : "0";
		i[7] = new Integer(getTamanno()).toString();
		i[8] = new Integer(getDifIA1()).toString();
		i[9] = new Integer(getDifIA2()).toString();
		i[10] = new Integer(getProfIA1()).toString();
		i[11] = new Integer(getProfIA2()).toString();
		i[12] = new Integer(getRamIA1()).toString();
		i[13] = new Integer(getRamIA2()).toString();
		i[14] = getNombre1();
		i[15] = getNombre2();
		if(config instanceof ConfigContrarreloj)
			i[16] = new Integer(((ConfigContrarreloj) config).getDuracionTurno()).toString();
		return i;
	}
}
