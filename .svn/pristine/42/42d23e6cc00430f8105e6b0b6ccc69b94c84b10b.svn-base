package dominio;


/**
 * Clase que representa Casilla.
 *
 * @author Albert Pérez Huertas
 */

//AUTOR: Albert Pérez Huertas//
//////////////////////////

public class Casilla
{
     /**
     * Indica la posición del Casilla.
     */
     private Posicion p;
     /**
     * Indica la Ficha que hay en la Casilla.
     */
     private Ficha f;
    /**
	 * Crea una casilla.
	 *
	 * @return	La nueva casilla.
	 */
     Casilla(){
          this.p= new Posicion();
          this.f = new Ficha();
     }
     /**
	 * Crea una casilla.
	 *
	 * @param x Indica la fila de la casilla.
	 * @param y	Indica la columna de la casilla.
	 * @param col	Indica el color de la ficha que hay en la casilla.
	 * @param tamanytauler	Indica si la opcián de deshacer está habilitada.
         * @throws llamaremos una excepción si los parametros x e y són alguno de ellos negativos o se pasan del límite, tamanytauler-1.  
         * @return	La nueva casilla.
	 */
     Casilla(int x, int y, int col, int tamanytauler) throws Exception{
	  if(x > tamanytauler-1 || y > tamanytauler-1 || x<0 || y<0){
            throw new Exception("Error: no puedes tener posiciones fuera del tablero");
          }
          this.p= new Posicion(x,y);
          this.f = new Ficha(col,this.p,tamanytauler);
          
     }
     /**
	 * Cambia la ficha de la casilla.
	 *
	 * @param fi Indica la ficha que hay que cambiar.
         * @throws llamaremos una excepción sí el color és negativo o superior a 2.
         * @return	Cambia la ficha de la casilla por la ficha fi.
	 */
    public void setFicha(Ficha fi) throws Exception{
        if(fi.getcolor() > 2 && fi.getcolor() < 0) {
            throw new Exception("Error: color ha de ser: color >= 0 and color <= 2");
        }
        this.f=fi;
    }
    /**
	 * Devuelve la ficha de la casilla.
	 *
	 * @return	Devuelve la ficha de la casilla.
	 */
    public Ficha getFicha(){
	return this.f;
    }
      /**
	 * Devuelve el color la ficha de la casilla.
	 *
	 * @return	Devuelve un entero que es el color de la ficha de la casilla.
	 */
    public int get_color_ficha(){    
        return this.f.getcolor();
    }
    /**
	 * Devuelve la fila de la casilla.
	 *
	 * @return	Devuelve un entero que es  la fila de la casilla.
	 */
    public int getx() {
	 return this.p.getx();
    }
     /**
	 * Devuelve la columna de la casilla.
	 *
	 * @return	Devuelve un entero que es  la columna de la casilla.
	 */
    public int gety(){	
	return this.p.gety();
    }
    /**
	 * Devuelve si la casilla esta vacía.
	 *
	 * @return	Devuelve un booleano si la casilla esta vacía o no.
	 */
    public boolean estavacia(){
	 return this.f.vacia();      
    }
}