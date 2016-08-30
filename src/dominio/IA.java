package dominio;

/**
 * Clase que representa una jugador IA.
 *
 * @author Albert Pérez Huertas
 */
public class IA extends Jugador {

    /**
     * Indica la dificultad de la IA.
     */
    private enum tipusDificultat {

        FACIL, MEDIO, DIFICIL, EXTREME
    }
    private tipusDificultat dificultat;

    /**
     * Crea una jugador IA.
     *
     * @param dif	Indica la dificultad.
     * @throws llamaremos una excepción si ponen una dificultat < 1 o > 3.
     * @return	El nuevo jugador IA.
     */
    IA(int dif) throws Exception {
        super();
        if (dif < 1 || dif > 4) {
            throw new Exception("Error: la dificultat sólo puede ser 1(FACIL),2(MEDIO),3(DIFICIL)");
        }
        if (dif == 2) {
            this.dificultat = tipusDificultat.MEDIO;
        }
        if (dif == 3) {
            this.dificultat = tipusDificultat.DIFICIL;
        }
        if (dif == 1) {
            this.dificultat = tipusDificultat.FACIL;
        }
        if (dif == 4) {
            this.dificultat = tipusDificultat.EXTREME;
        }
    }

    /**
     * Crea una jugador IA.
     *
     * @param color Indica el color.
     * @param temps Indica el tiempo.
     * @param dif	Indica la dificultad.
     * @throws llamaremos una excepción si ponen una dificultat < 1 o > 3.
     * @return	El nuevo jugador IA.
     */
    IA(int color, int temps, int dif) throws Exception {

        super(color, temps);
        if (dif < 1 || dif > 4) {
            throw new Exception("Error: la dificultat sólo puede ser 1(FACIL),2(MEDIO),3(DIFICIL)");
        }
        if (dif == 2) {
            this.dificultat = tipusDificultat.MEDIO;
        } else if (dif == 3) {
            this.dificultat = tipusDificultat.DIFICIL;
        } else if (dif == 1) {
            this.dificultat = tipusDificultat.FACIL;
        } else if (dif == 4) {
            this.dificultat = tipusDificultat.EXTREME;
        }
    }

    /**
     * Devuelve la dificultad del jugador IA.
     *
     * @return	Devuelve un entero que representa la dificultad del jugador IA.
     */
    public int getdificultat() {
        if (this.dificultat == tipusDificultat.MEDIO) {
            return 2;
        } else if (this.dificultat == tipusDificultat.DIFICIL) {
            return 3;
        } else if (this.dificultat == tipusDificultat.EXTREME) {
            return 4;
        } else {
            return 1;
        }
    }

    /**
     * Cambia la dificultad del jugador IA.
     *
     * @param dif Indica la dificultad del jugador IA.
     * @throws llamaremos una excepción si ponen una dificultat < 1 o > 3.
     * @return	Cambia un entero que representa la dificultad del jugador IA.
     */
    public void setdificultat(int dif) throws Exception {
        if (dif < 1 || dif > 4) {
            throw new Exception("Error: la dificultat sólo puede ser 1(FACIL),2(MEDIO),3(DIFICIL)");
        }
        if (dif == 2) {
            this.dificultat = tipusDificultat.MEDIO;
        } else if (dif == 3) {
            this.dificultat = tipusDificultat.DIFICIL;
        } else if (dif == 4) {
            this.dificultat = tipusDificultat.EXTREME;
        } else {
            this.dificultat = tipusDificultat.FACIL;
        }
    }
}