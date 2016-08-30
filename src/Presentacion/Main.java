package Presentacion;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Representa el ejecutable de la aplicacion
 *
 * @author Sergio Moyano Diaz
 * @version 1.0
 */
public class Main {

	/**
	 * Crea una nueva instancia de la clase principal Main
	 */
	public Main() {
	}

	/**
	 * Comienza la ejecucion del programa
	 *
	 * @param args Argumentos de la l�nea de comandos
	 */
	public static void main(String[] args) {
		try {
			// Set cross-platform Java L&F (also called "Metal")
			UIManager.setLookAndFeel(
					UIManager.getSystemLookAndFeelClassName());
		} catch (UnsupportedLookAndFeelException e) {
			// handle exception
		} catch (ClassNotFoundException e) {
			// handle exception
		} catch (InstantiationException e) {
			// handle exception
		} catch (IllegalAccessException e) {
			// handle exception
		}

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				ControladorPresentacion inst = new ControladorPresentacion();

			}
		});
	}
}
