package Datos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Controlador de ránking de la capa de datos.
 *
 * @author Àlex Ramírez Gómez
 */
public class ControladorDatosRanking {

	/**
	 * Guarda un ránking en disco.
	 *
	 * @param path Ubicación en la que se guardará en ránking.
	 * @exception IOException Error al escribir el fichero (es un directorio, fallo de permisos...).
	 */
	public void guardarRanking(String path, String[][] r) throws IOException {
		FileWriter fout = new FileWriter(path + ".ranking");
		fout.write(r.length + "\n");
		for (int i = 0; i < r.length; ++i) {
			fout.write(r[i][0] + "\t" + r[i][1] + "\n");
		}
		fout.close();
	}

	/**
	 * Carga un ránking en disco.
	 *
	 * @param path Ubicación del ránking en disco.
	 * @exception IOException Error al leer el fichero (es un directorio, no existe, fallo de permisos...).
	 */
	public String[][] cargarRanking(String path) throws IOException {
		FileReader fin = new FileReader(path + ".ranking");
		Scanner scanner = new Scanner(fin);
		int n = scanner.nextInt();
		String[][] s = new String[n][2];
		for (int i = 0; i < n; ++i) {
			s[i][0] = scanner.next();
			s[i][1] = scanner.next();
		}
		fin.close();
		return s;
	}
}
