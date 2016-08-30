package Datos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Clase que gestiona el almacenamiento de archivos de configuración en disco.
 *
 * @author Àlex Ramírez Gómez
 */
public class ControladorDatosConfig {

	/**
	 * Carga una configuración de partida del disco.
	 *
	 * @param path Ubicación de la configuración en disco.
	 * @return Un array con los parámetros de la configuración.
	 * @exception IOException Error al leer el fichero (es un directorio, no existe, fallo de permisos...).
	 */
	public String[] cargarConfig(String path) throws IOException {
		String[] i;
		FileReader fin = new FileReader(path);
		Scanner scanner = new Scanner(fin);
		String tiempo = scanner.next();
		if (Integer.parseInt(tiempo) == 0) {
			i = new String[16];
		} else {
			i = new String[17];
			i[16] = tiempo;
		}
		//System.err.println("datos:");
		for (int j = 0; j < 16; ++j) {
			i[j] = scanner.next();
			//System.err.print(i[j] + " ");
		}
		//System.err.println();
		fin.close();
		return i;
	}

	/**
	 * Guarda una configuración de partida en el disco.
	 *
	 * @param path Ubicación de la configuración en disco.
	 * @param params Parámetros de la configuración.
	 * @exception IOException Error al escribir el fichero (es un directorio, fallo de permisos...).
	 */
	public void guardarConfig(String path, String[] params) throws IOException {
		FileWriter fout = new FileWriter(path);
		if (params.length == 16) {
			fout.write(0 + " ");
		} else {
			fout.write(params[16] + " ");
		}
		for (int i = 0; i < 16; ++i) {
			fout.write(params[i] + " ");
		}
		fout.write("\n");
		fout.close();
	}

	/*    0 ó duracion_turno
	 * 0: tarta
	 * 1: cambio
	 * 2: ayuda
	 * 3: deshacer
	 * 4: apertura
	 * 5: humano1
	 * 6: humano2
	 * 7: tamanno
	 * 8: dif1
	 * 9: dif2
	 * 10: prof1
	 * 11: prof2
	 * 12: ram1
	 * 13: ram2
	 * 14: nombre1
	 * 15: nombre2
	 * 16: duracion_turno (si es necesario)
	 */
}
