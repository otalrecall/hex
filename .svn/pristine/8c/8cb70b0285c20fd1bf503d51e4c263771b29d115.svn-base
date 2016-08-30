package dominio;

/**
 * Clase que representa un tablero.
 *
 * @author Albert Pérez Huertas
 */
import java.util.ArrayList;

public class Tablero implements Cloneable {

    /**
     * Indica el tamaño que tiene un tablero.
     */
    private int tamany;
    /**
     * Matriz de Casilla que representa el tablero.
     */
    private Casilla[][] tauler;

    /**
     * Crea un tablero.
     *
     * @return	El nuevo tablero.
     */
    Tablero() {
        this.tamany = 0;
        tauler = new Casilla[0][0];
    }

    /**
     * Crea un tablero.
     *
     * @param n Indica el tamaño NxN del tablero.
     * @throws llamaremos una excepción si el tamaño representado por n se pasa
     * del máximo (7x7) o del mínimo(4x4)
     * @return	El nuevo tablero.
     */
    Tablero(int n) throws Exception {

        /*if (n > 7) {
         throw new Exception("Error: el tauler té com a màxim tamany 7x7");
         }*/
        if (n < 3) {
            throw new Exception("Error: el tauler té com a mínim tamany 3x3");
        }
        this.tamany = n;
        tauler = new Casilla[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                tauler[i][j] = new Casilla(i, j, 0, tamany);
            }
        }
    }

    /**
     * Devuelve el tablero en una matriz de Casilla
     *
     * @return Devuelve una matriz de Casilla.
     */
    public Casilla[][] gettablero() {
        return tauler;
    }

    /**
     * Devuelve si la Casilla (x, y) del tablero está vacía.
     *
     * @param x indica la fila.
     * @param y indica la columna.
     * @throws llamaremos una excepción si los parametros x o y son negativas o
     * se pasa del límite, tamany-1
     * @return Devuelve una booleano si la Casilla (x, y) esta vacía.
     */
    public boolean esta_vacia_casilla(int x, int y) throws Exception {
        if (x < 0 || x > this.tamany - 1) {
            throw new Exception("Error: no puedes tener posiciones fuera del tablero");
        }
        if (y < 0 || y > this.tamany - 1) {
            throw new Exception("Error: no puedes tener posiciones fuera del tablero");
        } else {
            return tauler[x][y].estavacia();
        }
    }

    /**
     * Pone una ficha en la Casilla (x, y) del tablero con color col.
     *
     * @param x indica la fila.
     * @param y indica la columna.
     * @param col indica el color de la ficha
     * @throws llamaremos una excepción si el color de la ficha es 0 significa
     * vacía.
     * @throws llamaremos una excepción si la casilla indicada por x e y está
     * ocupada.
     * @return No devuelve nada, sólo pone la ficha en la posición indicada.
     */
    public void poner_ficha(int x, int y, int col) throws Exception {
        if (col == 0) {
            throw new Exception("Error: no puedes poner una ficha vacia");
        }
        if (!esta_vacia_casilla(x, y)) {
            throw new Exception("Error: esta casilla ya esta ocupada");
        }
        this.tauler[x][y] = new Casilla(x, y, col, tamany);
    }

    /**
     * Quita una ficha en la Casilla (x, y) del tablero.
     *
     * @param x indica la fila.
     * @param y indica la columna.
     * @throws llamaremos una excepción si los parametros x o y son negativas o
     * se pasa del límite, tamany-1
     *
     * @return No devuelve nada, sólo quita la ficha de la posición indicada.
     */
    public void quitar_ficha(int x, int y) throws Exception {
        if (x > tamany - 1 || y > tamany - 1 || x < 0 || y < 0) {
            throw new Exception("Error: no puedes tener posiciones fuera del tablero");
        }
        this.tauler[x][y] = new Casilla(x, y, 0, tamany);
    }

    /**
     * Devuelve el tamaño del tablero
     *
     * @return Devuelve un entero, el tamaño del tablero.
     */
    public int gettamany() {
        return this.tamany;
    }

    /**
     * Devuelve un objeto Casilla de la posición (x, y) del tablero.
     *
     * @param x indica la fila.
     * @param y indica la columna.
     * @throws llamaremos una excepción si los parametros x o y son negativas o
     * se pasa del límite, tamany-1
     * @return Devuelve una Casilla del tablero que está en la posición (x, y).
     */
    public Casilla getcasilla(int x, int y) throws Exception {
        if (x < 0 || y < 0 || x > tamany || y > tamany) {
            throw new Exception("Error: no puedes tener posiciones fuera del tablero");
        }
        return this.tauler[x][y];

    }

    /**
     * Hace un Clon del objeto tablero.
     *
     * @return Devuelve un tablero, hace un clon del objeto tablero.
     */
    public Tablero clon() throws Exception {
        try {
            Tablero t2 = new Tablero(tamany);
            for (int i = 0; i < tamany; ++i) {
                for (int j = 0; j < tamany; ++j) {
                    try {
                        t2.poner_ficha(i, j, getcasilla(i, j).get_color_ficha());
                    } catch (Exception e) {
                    }
                }
            }
            return t2;
        } catch (Exception e) {
        }
        return null;
    }

    /**
     * Retorna una lista de las casillas vacías del tablero.
     *
     * @param t La situación del tablero.
     * @return Una lista de las casillas vacías del tablero.
     */
    public ArrayList<Posicion> getCasillasVacias() {
        ArrayList<Posicion> casillas_vacias = new ArrayList<Posicion>();
        for (int fila = 0; fila < gettamany(); ++fila) {
            for (int col = 0; col < gettamany(); ++col) {
                try {
                    if (esta_vacia_casilla(col, fila)) {
                        casillas_vacias.add(new Posicion(col, fila));
                    }
                } catch (Exception e) {
                }
            }
        }
        return casillas_vacias;
    }
}