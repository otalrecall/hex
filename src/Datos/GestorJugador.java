package Datos;

import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author Sergio Moyano Diaz
 */
public class GestorJugador {

	private RandomAccessFile f;

	/**
	 * Crea un gestor de jugador.
	 *
	 */
	public GestorJugador() {
		f = null;
	}

	/**
	 * Guardar fichas de un jugador en un fichero.
	 *
	 * @param path El path en se guardará la partida.
	 * @param player El número del player.
	 * @param p Una Arraylist con las fichas del jugador .
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 * @throws Exception Si el p no existe
	 */
	public void guardarfichasplayer(String path, int player, ArrayList<Integer> p) throws Exception {

		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}
		f = new RandomAccessFile(path + "jugador" + player, "rw");
		RandomAccessFile ft = new RandomAccessFile("temp", "rw");
		f.seek(0);

		if (f.length() == 0) {

			f.writeInt(0);   // color
			f.writeInt(0);   // tiempo
			f.writeInt(0);   // tipo
			f.writeInt(0);   // profundidad
			f.writeInt(0);   // ramificacion
			f.writeUTF("  ");
			f.writeInt(p.size());

			for (int i = 0; i < p.size(); i++) {
				f.writeInt(p.get(i));
			}

		} else {

			ft.seek(0);
			ft.writeInt(f.readInt()); //color
			ft.writeInt(f.readInt()); //tiempo
			ft.writeInt(f.readInt()); //tipo
			ft.writeInt(f.readInt()); //profundidad
			ft.writeInt(f.readInt()); //ramificación
			ft.writeUTF(f.readUTF()); //nombre
			ft.writeInt(p.size());
			for (int i = 0; i < p.size(); i++) {
				ft.writeInt(p.get(i));
			}

			ft.seek(0);
			f.seek(0);
			f.writeInt(ft.readInt()); //color
			f.writeInt(ft.readInt()); //tiempo
			f.writeInt(ft.readInt()); //tipo
			f.writeInt(ft.readInt()); //profundidad
			f.writeInt(ft.readInt()); //ramificación
			f.writeUTF(ft.readUTF()); //nombre
			f.writeInt(ft.readInt());
			for (int i = 0; i < p.size(); i++) {
				f.writeInt(ft.readInt());
			}
		}

		f.close();
		ft.close();
	}

	/**
	 * Guardar tiempo de un jugador en un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player La partida en cuestión.
	 * @param tiempo El tiempo del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 * @throws Exception Si el tiempo es negativo
	 *
	 */
	public void guardartiempoplayer(String path, int player, int tiempo) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}
		if (tiempo < 0) {
			throw new Exception(" Tiempo negativo");
		}
		f = new RandomAccessFile(path + "jugador" + player, "rw");
		RandomAccessFile ft = new RandomAccessFile("temp", "rw");
		f.seek(0);

		if (f.length() == 0) {
			f.writeInt(0);        // color
			f.writeInt(tiempo);   // tiempo
			f.writeInt(0);        // tipo
			f.writeInt(0);        // profundidad
			f.writeInt(0);        // ramificacion
			f.writeUTF("  ");
			f.writeInt(0);
		} else {
			ft.seek(0);
			ft.writeInt(f.readInt()); //color
			f.readInt();
			ft.writeInt(tiempo);		//tiempo
			ft.writeInt(f.readInt());	//tipo
			ft.writeInt(f.readInt());	//profundidad
			ft.writeInt(f.readInt());	//ramificación
			ft.writeUTF(f.readUTF());	//nombre
			int s = f.readInt();
			ft.writeInt(s);
			for (int i = 0; i < s; i++) {
				ft.writeInt(f.readInt());
			}

			ft.seek(0);
			f.seek(0);
			f.writeInt(ft.readInt()); //color
			f.writeInt(ft.readInt()); //tiempo
			f.writeInt(ft.readInt()); //tipo
			f.writeInt(ft.readInt()); //profundidad
			f.writeInt(ft.readInt()); //ramificación
			f.writeUTF(ft.readUTF()); //nombre
			f.writeInt(ft.readInt());
			for (int i = 0; i < s; i++) {
				f.writeInt(ft.readInt());
			}
		}

		f.close();
		ft.close();
	}

	/**
	 * Guardar color de un jugador en un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player El numero del jugador jugador en cuestión.
	 * @param color El color del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 * @throws Exception Si el color no existe
	 *
	 */
	public void guardarcolorplayer(String path, int player, int color) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}
		if (color != 1 && color != 2) {
			throw new Exception(" Color inexistente");
		}
		f = new RandomAccessFile(path + "jugador" + player, "rw");
		RandomAccessFile ft = new RandomAccessFile("temp", "rw");
		f.seek(0);

		if (f.length() == 0) {
			f.writeInt(color);	 // color
			f.writeInt(0);         // tiempo
			f.writeInt(0);         // tipo
			f.writeInt(0);         // profundidad
			f.writeInt(0);         // ramificacion
			f.writeUTF("  ");
			f.writeInt(0);
		} else {
			ft.seek(0);
			ft.writeInt(color);			//color
			f.readInt();
			ft.writeInt(f.readInt()); // tiempo
			ft.writeInt(f.readInt()); //tipo
			ft.writeInt(f.readInt()); //profundidad
			ft.writeInt(f.readInt()); //ramificación
			ft.writeUTF(f.readUTF()); //nombre
			int s = f.readInt();
			ft.writeInt(s);
			for (int i = 0; i < s; i++) {
				ft.writeInt(f.readInt());
			}

			ft.seek(0);
			f.seek(0);
			f.writeInt(ft.readInt()); //color
			f.writeInt(ft.readInt()); //tiempo
			f.writeInt(ft.readInt()); //tipo
			f.writeInt(ft.readInt()); //profundidad
			f.writeInt(ft.readInt()); //ramificacion
			f.writeUTF(ft.readUTF()); //nombre
			f.writeInt(ft.readInt());

			for (int i = 0; i < s; i++) {
				f.writeInt(ft.readInt());
			}

		}

		f.close();
		ft.close();
	}

	/**
	 * Guardar nombre de un jugador en un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player El numero del jugador en cuestión.
	 * @param color El nombre del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 *
	 */
	public void guardarnombreplayer(String path, int player, String nombre) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}
		f = new RandomAccessFile(path + "jugador" + player, "rw");
		RandomAccessFile ft = new RandomAccessFile("temp", "rw");
		f.seek(0);
		if (f.length() == 0) {

			f.writeInt(0);	 // color
			f.writeInt(0);         // tiempo
			f.writeInt(0);         // tipo
			f.writeInt(0);         // profundidad
			f.writeInt(0);         // ramificacion
			f.writeUTF(nombre);
			f.writeInt(0);   // size de fichas

		} else {

			ft.seek(0);
			ft.writeInt(f.readInt()); //color
			ft.writeInt(f.readInt()); //tiempo
			ft.writeInt(f.readInt()); //tipo
			ft.writeInt(f.readInt()); //profundidad
			ft.writeInt(f.readInt()); //ramificacion
			ft.writeUTF(nombre);
			f.readUTF();
			int s = f.readInt();
			ft.writeInt(s);
			for (int i = 0; i < s; i++) {
				ft.writeInt(f.readInt());
			}

			ft.seek(0);
			f.seek(0);
			f.writeInt(ft.readInt()); //color
			f.writeInt(ft.readInt()); //tiempo
			f.writeInt(ft.readInt()); //tipo
			f.writeInt(ft.readInt()); //profundidad
			f.writeInt(ft.readInt()); //ramificación
			f.writeUTF(ft.readUTF()); //nombre
			f.writeInt(ft.readInt());
			for (int i = 0; i < s; i++) {
				f.writeInt(ft.readInt());
			}

		}

		f.close();
		ft.close();
	}

	/**
	 * Guardar tipo de IA de un jugador en un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player El número del jugador en cuestión.
	 * @param tipo El tipo de IA del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 * @throws Exception Si el tipo no existe
	 */
	public void guardartipoIAplayer(String path, int player, int tipo) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}
		if (tipo != 1 && tipo != 2 && tipo != 3 && tipo != 4) {
			throw new Exception(" Tipo inexistente");
		}
		f = new RandomAccessFile(path + "jugador" + player, "rw");
		RandomAccessFile ft = new RandomAccessFile("temp", "rw");
		f.seek(0);
		if (f.length() == 0) {

			f.writeInt(0);       // color
			f.writeInt(0);       // tiempo
			f.writeInt(tipo);    // tipo
			f.writeInt(0);       // profundidad
			f.writeInt(0);       // ramificación
			f.writeUTF("");      // nombre
			f.writeInt(0);       // size de fichas

		} else {


			ft.seek(0);
			ft.writeInt(f.readInt()); //color
			ft.writeInt(f.readInt()); //tiempo
			ft.writeInt(tipo);
			f.readInt();
			ft.writeInt(f.readInt()); //profundidad
			ft.writeInt(f.readInt()); //ramificacion
			ft.writeUTF(f.readUTF()); //nombre
			int s = f.readInt();
			ft.writeInt(s);
			for (int i = 0; i < s; i++) {
				ft.writeInt(f.readInt());
			}

			ft.seek(0);
			f.seek(0);
			f.writeInt(ft.readInt()); //color
			f.writeInt(ft.readInt()); //tiempo
			f.writeInt(ft.readInt()); //tipo
			f.writeInt(ft.readInt()); //profundidad
			f.writeInt(ft.readInt()); //ramificación
			f.writeUTF(ft.readUTF());
			f.writeInt(ft.readInt());
			for (int i = 0; i < s; i++) {
				f.writeInt(ft.readInt());
			}

		}
		f.close();
		ft.close();
	}

	/**
	 * Cargar las fichas de un jugador de un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player El número del jugador en cuestión.
	 * @return El tipo de IA del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 */
	public ArrayList<Integer> cargarfichasplayer(String path, int player) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}

		ArrayList<Integer> p = new ArrayList<Integer>();
		f = new RandomAccessFile(path + "jugador" + player, "r");
		int u = f.readInt(); //color
		u = f.readInt(); //tiempo
		u = f.readInt(); //tipo
		u = f.readInt(); //profundidad
		u = f.readInt(); //ramificación
		String g = f.readUTF();
		int size = f.readInt();
		for (int i = 0; i < size; i++) {
			p.add(f.readInt());
		}
		f.close();

		return p;

	}

	/**
	 * Cargar las tiempo de un jugador de un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player El número del jugador en cuestión.
	 * @return El tiempo del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 */
	public int cargartiempoplayer(String path, int player) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}

		f = new RandomAccessFile(path + "jugador" + player, "r");
		f.readInt(); //color
		int tiempo = f.readInt(); //tiempo
		f.close();

		return tiempo;
	}

	/**
	 * Cargar el color de un jugador de un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player El número del jugador en cuestión.
	 * @param color El color del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 */
	public int cargarcolorplayer(String path, int player) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}

		f = new RandomAccessFile(path + "jugador" + player, "r");
		int color = f.readInt(); //color
		f.close();

		return color;
	}

	/**
	 * Cargar el nombre de un jugador de un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player El número del jugador en cuestión.
	 * @return El nombre del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 */
	public String cargarnombreplayer(String path, int player) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}

		f = new RandomAccessFile(path + "jugador" + player, "r");
		f.readInt(); //color
		f.readInt(); //tiempo
		f.readInt(); //tipo
		f.readInt(); //profundidad
		f.readInt(); //ramificación
		String nombre = f.readUTF();
		f.close();

		return nombre;
	}

	/**
	 * Carga el tipo de IA de un jugador de un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player El número del jugador en cuestión.
	 * @return El tipo de IA del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 */
	public int cargartipoIAplayer(String path, int player) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}

		f = new RandomAccessFile(path + "jugador" + player, "r");
		f.readInt(); //color
		f.readInt(); //tiempo
		int tipo = f.readInt(); //tipo
		f.close();

		return tipo;
	}

	/**
	 * Carga la profundidad de un jugador de un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player El número del jugador en cuestión.
	 * @return La profundidad del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 */
	public int cargarProfPlayer(String path, int player) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}

		f = new RandomAccessFile(path + "jugador" + player, "r");
		f.readInt(); //color
		f.readInt(); //tiempo
		f.readInt(); //tipo
		int prof = f.readInt(); //prof
		f.close();

		return prof;
	}


	/**
	 * Carga la ramificación de un jugador de un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player El número del jugador en cuestión.
	 * @return La ramificación del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 */
	public int cargarRamPlayer(String path, int player) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}

		f = new RandomAccessFile(path + "jugador" + player, "r");
		f.readInt(); //color
		f.readInt(); //tiempo
		f.readInt(); //tipo
		f.readInt(); //profundidad
		int ram = f.readInt(); //ramificación
		f.close();

		return ram;
	}


	/**
	 * Guardar la profundidad de un jugador en un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player La partida en cuestión.
	 * @param prof La profundidad del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 * @throws Exception Si el tiempo es negativo
	 *
	 */
	public void guardarProfPlayer(String path, int player, int prof) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}
		if (prof <= 0) {
			throw new Exception(" Profundidad no positiva");
		}
		f = new RandomAccessFile(path + "jugador" + player, "rw");
		RandomAccessFile ft = new RandomAccessFile("temp", "rw");
		f.seek(0);

		if (f.length() == 0) {
			f.writeInt(0);        // color
			f.writeInt(0);		  // tiempo
			f.writeInt(0);        // tipo
			f.writeInt(prof);     // profundidad
			f.writeInt(0);        // ramificacion
			f.writeUTF("  ");
			f.writeInt(0);
		} else {
			ft.seek(0);
			ft.writeInt(f.readInt()); //color
			ft.writeInt(f.readInt()); //tiempo
			ft.writeInt(f.readInt()); //tipo
			ft.writeInt(prof);			//profundidad
			f.readInt();
			ft.writeInt(f.readInt()); //ramificación
			ft.writeUTF(f.readUTF());
			int s = f.readInt();
			ft.writeInt(s);
			for (int i = 0; i < s; i++) {
				ft.writeInt(f.readInt());
			}

			ft.seek(0);
			f.seek(0);
			f.writeInt(ft.readInt()); //color
			f.writeInt(ft.readInt()); //tiempo
			f.writeInt(ft.readInt()); //tipo
			f.writeInt(ft.readInt()); //profundidad
			f.writeInt(ft.readInt()); //ramificación
			f.writeUTF(ft.readUTF());
			f.writeInt(ft.readInt());
			for (int i = 0; i < s; i++) {
				f.writeInt(ft.readInt());
			}
		}

		f.close();
		ft.close();
	}


	/**
	 * Guardar ramificacion de un jugador en un fichero.
	 *
	 * @param path El path en el que está guardada la partida.
	 * @param player La partida en cuestión.
	 * @param ram La ramificación del jugador en cuestión.
	 * @throws Exception Si el jugador no existe
	 * @throws Exception Si hay algun error con la I/O del fichero
	 * @throws Exception Si el tiempo es negativo
	 *
	 */
	public void guardarRamPlayer(String path, int player, int ram) throws Exception {
		if (player != 1 && player != 2) {
			throw new Exception(" Player inexistente");
		}
		if (ram <= 0) {
			throw new Exception(" Ramificación no positiva");
		}
		f = new RandomAccessFile(path + "jugador" + player, "rw");
		RandomAccessFile ft = new RandomAccessFile("temp", "rw");
		f.seek(0);

		if (f.length() == 0) {
			f.writeInt(0);        // color
			f.writeInt(0);		  // tiempo
			f.writeInt(0);        // tipo
			f.writeInt(0);        // profundidad
			f.writeInt(ram);        // ramificacion
			f.writeUTF("  ");
			f.writeInt(0);
		} else {
			ft.seek(0);
			ft.writeInt(f.readInt()); //color
			ft.writeInt(f.readInt()); //tiempo
			ft.writeInt(f.readInt()); //tipo
			ft.writeInt(f.readInt()); //profundidad
			f.readInt();
			ft.writeInt(ram);		  //ramificación
			ft.writeUTF(f.readUTF());
			int s = f.readInt();
			ft.writeInt(s);
			for (int i = 0; i < s; i++) {
				ft.writeInt(f.readInt());
			}

			ft.seek(0);
			f.seek(0);
			f.writeInt(ft.readInt()); //color
			f.writeInt(ft.readInt()); //tiempo
			f.writeInt(ft.readInt()); //tipo
			f.writeInt(ft.readInt()); //profundidad
			f.writeInt(ft.readInt()); //ramificación
			f.writeUTF(ft.readUTF());
			f.writeInt(ft.readInt());
			for (int i = 0; i < s; i++) {
				f.writeInt(ft.readInt());
			}
		}

		f.close();
		ft.close();
	}

}

/*
 * color
 * tiempo
 * tipo
 *
 * profundidad
 * ramificación
 *
 * nombre
 */
