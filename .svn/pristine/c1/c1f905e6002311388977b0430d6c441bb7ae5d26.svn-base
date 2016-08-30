package Datos;

/**
 *
 * @author Sergio Moyano Diaz
 */
import java.io.*;
import java.util.ArrayList;

public class GestorTablero {

    private RandomAccessFile f;

    /**
     * Crea un Gestor Tablero .
     *
     */
    public GestorTablero() {
        f = null;

    }

    /**
     * Carga los estados de una partida de un fichero.
     *
     * @param path El path en donde esta guardado el fichero la partida.
     * @return Una Arraylist con los estados de la partida.
     * @throws Exception Si hay algun error con la I/O del fichero      *
     */
    public ArrayList<Integer> cargarestados(String path) throws Exception {

        ArrayList<Integer> p = new ArrayList<Integer>();
        f = new RandomAccessFile(path + "Tablero", "r");
        f.seek(0);

        if (f.length() == 0) {
            f.writeInt(0);
            f.writeInt(0);
        } // size
        else {
            f.readInt();
            int size = f.readInt();
            for (int i = 0; i < size; i++) {
                p.add(f.readInt());
            }
        }

        f.close();

        return p;
    }

    /**
     * Guardar los estados de los estados en un fichero.
     *
     * @param path El path en se guardará los estados de la partida.
     * @param p Una Arraylist con los estados de una partida.
     * @throws Exception Si hay algun error con la I/O del fichero
     */
    public void guardarestados(String path, ArrayList<Integer> p) throws Exception {

        f = new RandomAccessFile(path + "Tablero", "rw");
        RandomAccessFile ft = new RandomAccessFile("temp", "rw");
        f.seek(0);
        if (f.length() == 0) {
             f.writeInt(0);
             f.writeInt(p.size());
             for (int i = 0; i < p.size(); i++) {
                f.writeInt(p.get(i));
             }
        } else {
            
        ft.seek(0);
        f.seek(0);
        ft.writeInt(f.readInt());
        int s = f.readInt();
        ft.writeInt(s);
        for (int i = 0; i < s; i++) {
            ft.writeInt(f.readInt());
        }
        ft.seek(0);
        f.seek(0);
        f.writeInt(ft.readInt());
        f.writeInt(ft.readInt());
        for (int i = 0; i < s; i++) {
            f.writeInt(ft.readInt());
        }
        
        
        }
        
        f.close();
        ft.close();
    }

    /**
     * Guardar el tamaño del tablero en un fichero.
     *
     * @param path El path en se guardará el tamaño del tablero de la partida.
     * @param p El tamaño del tablero de la partida.
     * @throws Exception Si hay algun error con la I/O del fichero
     */
    
    
    public void guardartamano(String path, int p) throws Exception {

        f = new RandomAccessFile(path + "Tablero", "rw");
        RandomAccessFile ft = new RandomAccessFile("temp", "rw");
        ft.seek(0);
         if (f.length() == 0) {
             f.writeInt(p);
             f.writeInt(0);
       
        }else{
        f.seek(0);
        f.readInt();
        ft.writeInt(p);
        int s = f.readInt();
        ft.writeInt(s);
        for (int i = 0; i < s; i++) {
            ft.writeInt(f.readInt());
        }
        ft.seek(0);
        f.seek(0);
        f.writeInt(ft.readInt());
        f.writeInt(ft.readInt());
        for (int i = 0; i < s; i++) {
            f.writeInt(ft.readInt());
        }
        
       
         }
        f.close();
        ft.close();  
    }

    /**
     * Cargar el tamaño del tablero de un fichero.
     *
     * @param path El path en se guardará los estados de la partida.
     * @return El tamaño del tablero de la partida.
     * @throws Exception Si hay algun error con la I/O del fichero
     */
    public int cargartamano(String path) throws Exception {

        f = new RandomAccessFile(path + "Tablero", "r");
        f.seek(0);
        int r = f.readInt();
        f.close();
        return r;
    }
}