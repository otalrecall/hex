/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author Otal
 */
public class UtilConfiguracion {

    private boolean cambio;
    private boolean tarta;
    private boolean undo;
    private boolean help;
    private int tam;
    private int duracionTurno;
    private int apertura;
    private boolean esHum1;
    private boolean esHum2;
    private String nom1;
    private String nom2;
    private int dif1;
    private int dif2;
    private int ram1, ram2;
    private int prof1, prof2;

    /**
     * Devuelve la ramificación de la IA
     *
     * @param jugador El número del jugador IA
     * @return La ramificación del jugador
     */
    public int getRamificacion(int jugador) {
        if (jugador == 1) {
            return ram1;
        } else {
            return ram2;
        }
    }

    /**
     * Devuelve la profundidad de la IA
     *
     * @param jugador El número del jugador IA
     * @return La profundidad del jugador
     */
    public int getProfundidad(int jugador) {
        if (jugador == 1) {
            return prof1;
        } else {
            return prof2;
        }
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
     * Retorna si la opción de deshacer está habilitada.
     *
     * @return Indica si la opción de deshacer estó habilitada.
     */
    public boolean getUndo() {
        return undo;
    }

    /**
     * Retorna si las ayudas están habilitadas.
     *
     * @return Indica si las ayudas están habilitadas.
     */
    public boolean getHelp() {
        return help;
    }

    /**
     * Retorna si se ha realizado un cambio de bandos durante la regla de la
     * tarta.
     *
     * @return Indica se ha realizado un cambio de bandos durante la regla de la
     * tarta.
     */
    public boolean getCambio() {
        return cambio;
    }

    /**
     * Retorna si el jugador 1 es humano o no.
     *
     * @return Si el jugador 1 es humano o no.
     */
    public boolean getEsHum1() {
        return esHum1;
    }

    /**
     * Retorna si el jugador 2 es humano o no.
     *
     * @return Si el jugador 2 es humano o no.
     */
    public boolean getEsHum2() {
        return esHum2;
    }

    /**
     * Retorna la dificultad del jugador CPU 1.
     *
     * @return El número de la dificultad.
     */
    public int getDif1() {
        return dif1;
    }

    /**
     * Retorna la dificultad del jugador CPU 2.
     *
     * @return El número de la dificultad.
     */
    public int getDif2() {
        return dif2;
    }

    /**
     * Retorna el nombre del jugador humano 1.
     *
     * @return El nombre.
     */
    public String getNom1() {
        return nom1;
    }

    /**
     * Retorna el nombre del jugador humano 2.
     *
     * @return El nombre.
     */
    public String getNom2() {
        return nom2;
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
     * Retorna el tamaño del tablero.
     *
     * @return El tamaño del tablero.
     */
    public int getTam() {
        return tam;
    }

    /**
     * Retorna la duración de un turno en segundos para la contrarreloj
     *
     * @return La duración de un turno
     */
    public int getDuracionTurno() {
        return duracionTurno;
    }

    /**
     * Establece la ramificación de la IA
     *
     * @param jugador El número del jugador IA
     * @param ramificacion La ramificación a introducir
     */
    public void setRamificacion(int jugador, int ramificacion) {
        if (jugador == 1) {
            this.ram1 = ramificacion;
        } else {
            this.ram2 = ramificacion;
        }
    }

    /**
     * Establece la profundidad de la IA
     *
     * @param jugador El número del jugador IA
     * @param profundidad La profundidad a introducir
     */
    public void setProfundidad(int jugador, int profundidad) {
        if (jugador == 1) {
            this.prof1 = profundidad;
        } else {
            this.prof2 = profundidad;
        }
    }

    /**
     * Establece el tamaño del tablero
     *
     * @param n El tamaño del tablero
     */
    public void setTam(int n) {
        tam = n;
    }

    /**
     * Establece la duración de turno de la contrarreloj en segundos
     *
     * @param n La duración de un turno.
     */
    public void setDuracionTurno(int n) {
        duracionTurno = n;
    }

    /**
     * Establece la dificultad de la IA 1
     *
     * @param n El número de la dificultad
     */
    public void setDif1(int n) {
        dif1 = n;
    }

    /**
     * Establece la dificultad de la IA 2
     *
     * @param n El número de la dificultad
     */
    public void setDif2(int n) {
        dif2 = n;
    }

    /**
     * Establece el jugador que realiza la primera jugada (0 para apertura
     * aleatoria).
     *
     * @param n El jugador que realiza la primera jugada (0 para apertura
     * aleatoria).
     */
    public void setApertura(int n) {
        apertura = n;
    }

    /**
     * Establece si se ha realizado un cambio de bandos durante la regla de la
     * tarta.
     *
     * @param b Indica si se ha realizado un cambio de bandos durante la regla
     * de la tarta.
     */
    public void setCambio(boolean b) {
        cambio = b;
    }

    /**
     * Establece si las ayudas están habilitadas.
     *
     * @param b Indica si las ayudas están habilitadas.
     */
    public void setHelp(boolean b) {
        help = b;
    }

    /**
     * Establece si la opción de deshacer está habilitada.
     *
     * @param b Indica si la opción de deshacer está habilitada.
     */
    public void setUndo(boolean b) {
        undo = b;
    }

    /**
     * Establece si la regla de la tarta está habilitada.
     *
     * @param b Indica si la regla de la tarta está habilitada.
     */
    public void setTarta(boolean b) {
        tarta = b;
    }

    /**
     * Establece si el jugador 1 es humano o no.
     *
     * @param b Si el jugador 1 es humano o no.
     */
    public void setHum1(boolean b) {
        esHum1 = b;
    }

    /**
     * Establece si el jugador 2 es humano o no.
     *
     * @param b Si el jugador 2 es humano o no.
     */
    public void setHum2(boolean b) {
        esHum2 = b;
    }

    /**
     * Establece el nombre del jugador humano 1
     *
     * @param s Su nombre.
     */
    public void setNom1(String s) {
        nom1 = s;
    }

    /**
     * Establece el nombre del jugador humano 2
     *
     * @param s Su nombre.
     */
    public void setNom2(String s) {
        nom2 = s;
    }
}
