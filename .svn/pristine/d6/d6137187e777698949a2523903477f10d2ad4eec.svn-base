package dominio;

import dominio.Posicion;
/**
 * Clase que representa una Ficha.
 *
 * @author Albert Pérez Huertas
 */

public class Ficha  {
    /**
    * Indica el color de la Ficha.
    */
    private enum estatFicha {J0, J1, J2};
    private estatFicha color; //J0 lliure, J1 fichas del jugador1, 2 fichas del jugador 2
    /**
    * Indica la posición donde está la Ficha.
    */
    private Posicion pos;
    /**
    * Crea una Ficha.
    *
    * @return	La nueva ficha.
    */
    public Ficha(){
        Posicion p = new Posicion();
        this.pos = p;
        this.color = estatFicha.J0;
    }
   /**
    * Crea una Ficha.
    *
    * @param col indica el color de la Ficha.
    * @param  pos indica la posición donde se encuentra la Ficha.
    * @param  tamanytauler indica el tamaño del tablero.
    * @throws llamaremos una excepción si el parametro pos tiene alguna posicion x o y negativa o se pasa del límite, tamanytauler-1
    * @return	La nueva ficha.
    */
    public Ficha(int col, Posicion pos,int tamanytauler) throws Exception {
        if(pos.getx() < 0 || pos.gety() < 0){
            throw new Exception("Error: no puedes tener posiciones negativas");
        }
        
        if(pos.getx() > tamanytauler-1 | pos.gety() > tamanytauler-1){
            throw new Exception("Error: no puedes tener posiciones fuera del tablero");
        }
        this.pos = pos;
        
        if(col==1) this.color=estatFicha.J1;
        else if(col==2) this.color=estatFicha.J2;
        else if(col==0) this.color = estatFicha.J0;
        else {
            throw new Exception("Error: color ha de ser: color >= 0 and color <= 2");
            
        }
    }
    /**
    * Devuelve si la ficha esta vacía.
    *
    * @return	Devuelve un booleano diciendo si la ficha esta vacía o no.
    */
    public boolean vacia(){
	return (this.color == estatFicha.J0);
    }
    /**
    * Devuelve el color de la ficha.
    *
    * @return	Devuelve un entero que representa el color de la ficha.
    */
    public int getcolor(){
	if(this.color == estatFicha.J0) return 0;
        else if(this.color == estatFicha.J1) return 1;
        else return 2;
    }
    /**
    * Cambia el color de la ficha.
    *
     * @param  color indica el color de la ficha.
     * @throws llamaremos una excepción si el color es negativo o superior a 2.
    * @return	Cambia el color de la ficha.
    */
    public void setcolor(int color) throws Exception{
	if(color==1) this.color=estatFicha.J1;
        else if(color==2) this.color=estatFicha.J2;
        else if(color==0) this.color = estatFicha.J0;
        else {
            throw new Exception("Error: color ha de ser: color >= 0 and color <= 2");
        }
    }
    /**
    * Cambia la posición de la ficha.
    *
     * @param  pos indica la posición de la ficha.
     * @throws llamaremos una excepción si el parametro pos tiene alguna posicion x o y negativa 
    * @return	Cambia la posición de la ficha.
    */
    public void setPosicion(Posicion pos) throws Exception{
	
        if(pos.getx() < 0 || pos.gety() <0){
            throw new Exception("Error: no puedes tener posiciones negativas");
        }else{
            this.pos = pos;
        }
    }
}
