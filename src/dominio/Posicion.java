
package dominio;

/**
 *
 * Clase que representa una posición.
 *
 * @author albert.perez.huertas
 */
public class Posicion {
    /**
    * Indica la fila de la posición.
    */
    private int x;
    /**
    * Indica la columna de la posición.
    */
    private int y;
    /**
    * Crea una posición.
     *
     * @return	La nueva posición.
    */
    public Posicion(){
        this.x=-5;
        this.y=-5;
    }
    /**
    * Crea una posición.
     *
     * @param x indica la fila de la posición.
     * @param y indica la columan de la posición.
     * @return	La nueva posición.
    */
    public Posicion(int x, int y){
        this.x=x;
        this.y=y;
    }
    /**
    * Cambia la fila de la posición.
     *
     * @param n indica la fila de la posición.
     *
     * @return	Cambia la fila de la posición.
    */
    public void setx(int n){
        this.x=n;
    }
    /**
    * Cambia la columna de la posición.
     *
     * @param n indica la columna de la posición.
     *
     * @return	Cambia la columna de la posición.
    */
    public void sety(int n){
        this.y=n;
    }
    /**
    * Devuelve la fila de una posición.
     *
     * @return	Devuelve la fila de una posición.
    */
    public int getx(){
        return this.x;
    }
    /**
    * Devuelve la columna de una posición.
     *
     * @return	Devuelve la columna de una posición.
    */
    public int gety(){
        return this.y;
    }
}
