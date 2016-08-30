/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.io.RandomAccessFile;
import java.util.ArrayList;

/**
 *
 * @author Sergio Moyano Diaz
 */
public class ControladorDatosPartida {


    private GestorTablero gt;
    private GestorJugador gj;

     /**
	Guardar fichas de un jugador en un fichero.

	@param path   El path en se guardará la partida.
        @param player El número del player.
        @param p      Una Arraylist con las fichas del jugador  .
        @throws Exception Si el jugador no existe
        @throws Exception Si hay algun error con la I/O del fichero
        @throws Exception Si el p  no existe
	*/

   public ControladorDatosPartida() {

      gt = new  GestorTablero();
      gj = new GestorJugador();

   }
 /**
	Carga los estados de una partida de un fichero.

	@param path   El path en donde esta guardado el fichero la partida.
        @return       Una Arraylist con los estados de la partida.
        @throws Exception Si hay algun error con la I/O del fichero

	*/

   public ArrayList<Integer> cargarestados (String path)throws Exception{
      ArrayList<Integer> o = gt.cargarestados( path);

       return gt.cargarestados( path);
   }

    /**
	Guardar los estados de los estados en un fichero.

	@param path       El path en se guardará los estados de la  partida.
        @param p          Una Arraylist con los estados de una partida.
        @throws Exception Si hay algun error con la I/O del fichero
	*/


 public ArrayList<Integer> cargarfichasplayer(String path, int player)throws Exception{

       return gj.cargarfichasplayer(path,player);

 }
    /**
	Cargar las tiempo de un jugador de un fichero.

	@param path        El path en el que está guardada la partida.
        @param player      El número del jugador en cuestión.
        @return            El tiempo del  jugador en cuestión.
        @throws Exception  Si el jugador no existe
        @throws Exception  Si hay algun error con la I/O del fichero
	*/


   public int cargartiempoplayer(String path, int player)throws Exception{

        return gj.cargartiempoplayer(path,player);

   }


    /**
	Cargar el color de un jugador de un fichero.

	@param path        El path en el que está guardada la partida.
        @param player      El número del jugador en cuestión.
        @param color       El color del  jugador en cuestión.
        @throws Exception  Si el jugador no existe
        @throws Exception  Si hay algun error con la I/O del fichero
	*/

  public int cargarcolorplayer(String path, int player)throws Exception{

      return gj.cargarcolorplayer( path,player);
   }



   /**
	Cargar el nombre de un jugador de un fichero.

	@param path        El path en el que está guardada la partida.
        @param player      El número del jugador en cuestión.
        @return            El nombre del  jugador en cuestión.
        @throws Exception  Si el jugador no existe
        @throws Exception  Si hay algun error con la I/O del fichero
	*/

  public String cargarnombreplayer(String path, int player)throws Exception{

       return gj.cargarnombreplayer( path,player);
  }

 /**
	Carga el tipo de IA de un jugador de un fichero.

	@param path        El path en el que está guardada la partida.
        @param player      El número del jugador en cuestión.
        @return            El tipo de IA del  jugador en cuestión.
        @throws Exception  Si el jugador no existe
        @throws Exception  Si hay algun error con la I/O del fichero
	*/

  public int cargartipoIAplayer(String path, int player)throws Exception{

       return gj.cargartipoIAplayer( path,player);
  }
    /**
	Guardar los estados de los estados en un fichero.

	@param path       El path en se guardará los estados de la  partida.
        @param p          Una Arraylist con los estados de una partida.
        @throws Exception Si hay algun error con la I/O del fichero
	*/

   public void guardarestados (String path,ArrayList<Integer> o)throws Exception{


        gt.guardarestados( path,o);
   }
     /**
	Guardar fichas de un jugador en un fichero.

	@param path   El path en se guardará la partida.
        @param player El número del player.
        @param p      Una Arraylist con las fichas del jugador  .
        @throws Exception Si el jugador no existe
        @throws Exception Si hay algun error con la I/O del fichero
        @throws Exception Si el p  no existe
	*/
 public void guardarfichasplayer(String path, int player, ArrayList<Integer> p)throws Exception{


        gj.guardarfichasplayer(path,player,p);
 }
   /**
	Guardar tiempo de un jugador en un fichero.

	@param path El path en el que está guardada la partida.
        @param player La partida en cuestión.
        @param tiempo El tiempo del jugador en cuestión.
        @throws Exception Si el jugador no existe
        @throws Exception Si hay algun error con la I/O del fichero
        @throws Exception Si el tiempo es negativo
        *
	*/

   public void  guardartiempoplayer(String path, int player, int tiempo)throws Exception{

         gj.guardartiempoplayer(path,player,tiempo);

   }


   /**
	Guardar color de un jugador en un fichero.

	@param path   El path en el que está guardada la partida.
        @param player El numero del jugador  jugador en cuestión.
        @param color  El color del jugador en cuestión.
        @throws Exception Si el jugador no existe
        @throws Exception Si hay algun error con la I/O del fichero
        @throws Exception Si el color no existe
        *
	*/

  public void guardarcolorplayer(String path, int player,int color)throws Exception{

       gj.guardarcolorplayer( path,player, color);
   }



   /**
	Guardar nombre de un jugador en un fichero.

	@param path   El path en el que está guardada la partida.
        @param player El numero del jugador en cuestión.
        @param color  El nombre del jugador en cuestión.
        @throws Exception Si el jugador no existe
        @throws Exception Si hay algun error con la I/O del fichero
        *
	*/

  public void guardarnombreplayer(String path, int player, String nombre)throws Exception{

      gj.guardarnombreplayer( path,player, nombre);
  }


      /**
	Guardar tipo de IA de un jugador en un fichero.

	@param path   El path en el que está guardada la partida.
        @param player El número del jugador en cuestión.
        @param tipo   El tipo de IA del jugador en cuestión.
        @throws Exception Si el jugador no existe
        @throws Exception Si hay algun error con la I/O del fichero
        @throws Exception Si el tipo no existe
        */

  public void guardartipoIAplayer(String path, int player, int tipo)throws Exception{

        gj.guardartipoIAplayer( path,player,tipo);
  }

  /**
	Guarda el turno de la partida  de un fichero.

	@param path        El path en el que está guardada la partida.
        @param turnos      El turno de la partida en cuestión.
        @throws Exception  Si el turnos es negativo.
        @throws Exception  Si hay algun error con la I/O del fichero
	*/


   public void guardarturnos(String path, int turnos)throws Exception{

        if (turnos <0) throw new Exception(" turno es negativo! " ) ;
        RandomAccessFile f = new RandomAccessFile (path+"datos", "rw");

        f.seek(0);
        f.writeInt(turnos);   // turnos
        f.close();
  }

   /**
	Carga el turnos de la partida  de un fichero.

	@param path        El path en el que está guardada la partida.
        @return            El turno de la partida en cuestión.
        @throws Exception  Si hay algun error con la I/O del fichero
	*/




    public int cargarturnos(String path)throws Exception{

       RandomAccessFile f = new RandomAccessFile (path+"datos", "rw");
        int turnos = 0;
        f.seek(0);
	if (f.length() == 0)f.writeInt(0);   // turnos
        else turnos= f.readInt();
        f.close();

       return turnos;

  }

       /**
     * Guardar el tamaño del tablero en un fichero.
     *
     * @param path El path en se guardará el tamaño del tablero de la partida.
     * @param p El tamaño del tablero de la partida.
     * @throws Exception Si hay algun error con la I/O del fichero
     */


    public void guardartamano(String path, int p) throws Exception {

        gt.guardartamano(path, p);
    }

    /**
     * Cargar el tamaño del tablero de un fichero.
     *
     * @param path El path en se guardará los estados de la partida.
     * @return El tamaño del tablero de la partida.
     * @throws Exception Si hay algun error con la I/O del fichero
     */
    public int cargartamano(String path) throws Exception {

        return gt.cargartamano(path);
    }


   /**
	Guardar profundidad de un jugador en un fichero.

	@param path   El path en el que está guardada la partida.
	@param player El numero del jugador  jugador en cuestión.
	@param prof  La profundidad del jugador en cuestión.
	@throws Exception Si el jugador no existe
	@throws Exception Si hay algun error con la I/O del fichero
    @throws Exception Si el color no existe
	*/
	public void guardarProfPlayer(String path, int player, int prof) throws Exception {
		gj.guardarProfPlayer(path, player, prof);
	}

   /**
	Guardar ramificación de un jugador en un fichero.

	@param path   El path en el que está guardada la partida.
	@param player El numero del jugador  jugador en cuestión.
	@param ram  La profundidad del jugador en cuestión.
	@throws Exception Si el jugador no existe
	@throws Exception Si hay algun error con la I/O del fichero
    @throws Exception Si el color no existe
	*/
	public void guardarRamPlayer(String path, int player, int ram) throws Exception {
		gj.guardarRamPlayer(path, player, ram);
	}

   /**
	Cargar profundidad de un jugador de un fichero.

	@param path   El path en el que está guardada la partida.
	@param player El numero del jugador  jugador en cuestión.
	@return  La profundidad del jugador en cuestión.
	@throws Exception Si el jugador no existe
	@throws Exception Si hay algun error con la I/O del fichero
    @throws Exception Si el color no existe
	*/
	public int cargarProfPlayer(String path, int player) throws Exception {
		return gj.cargarProfPlayer(path, player);
	}

   /**
	Cargar ramificación de un jugador de un fichero.

	@param path   El path en el que está guardada la partida.
	@param player El numero del jugador  jugador en cuestión.
	@return  La profundidad del jugador en cuestión.
	@throws Exception Si el jugador no existe
	@throws Exception Si hay algun error con la I/O del fichero
    @throws Exception Si el color no existe
	*/
	public int cargarRamPlayer(String path, int player) throws Exception {
		return gj.cargarRamPlayer(path, player);
	}
}
