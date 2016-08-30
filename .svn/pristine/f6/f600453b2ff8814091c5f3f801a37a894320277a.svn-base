package dominio;
/**
 * Clase que representa una jugador Humano.
 *
 * @author Albert Pérez Huertas
 */
public class Humano extends Jugador
{
    /**
     * Indica el nombre del jugador humano.
     */
    private String nombre;
    //constructora
    /**
	 * Crea una jugador Humano.
	 *
	 * @param nom	Indica el nombre del jugador Humano.
         * @throws llamaremos una excepción  si el jugador Humano se pasa del límite de carácteres para el nombre o no pone nada.
	 * @return	El nuevo jugador Humano.
	 */
    Humano (String nom) throws Exception {
        super();
        if(nom.length() > 25 || nom.length() == 0) throw new Exception("Error: no hi ha nom o el nom supera els 25 caràcters");
	this.nombre = nom;
    }
    /**
	 * Crea una jugador Humano.
	 *
         * @param color Indica el color de sus fichas.
         * @param temps Indica el tiempo del jugador. 
	 * @param nom	Indica el nombre del jugador Humano.
         * @throws llamaremos una excepción  si el jugador Humano se pasa del límite de carácteres para el nombre o no pone nada.
	 * @return	El nuevo jugador Humano.
	 */
    Humano (int color, int temps, String nom) throws Exception {
        super(color,temps);
        if(nom.length() > 25 || nom.length() == 0) throw new Exception("Error: no hi ha nom o el nom supera els 25 caràcters");
	this.nombre = nom;
        this.nombre=nom;
    }
    /**
	 * Cambia el nombre del jugador Humano.
	 *
	 * @param nom	Indica el nombre del jugador Humano.
         * @throws llamaremos una excepción  si el jugador Humano se pasa del límite de carácteres para el nombre o no pone nada.
	 * @return	Cambia el nombre del jugador Humano.
	 */
    public void setNombre (String s) throws Exception {
        if(s.length() > 25 || s.length() == 0) throw new Exception("Error: no hi ha nom o el nom supera els 25 caràcters");
        this.nombre = s;
    }
    /**
	 * Devuelve el nombre del jugador Humano.
	 *
	 * @return	Devuelve un String que es el nombre del jugador Humano.
	 */
    public String getNombre() {
	return this.nombre;
    }
}
    
    

    
