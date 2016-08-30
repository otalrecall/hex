package Presentacion;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author Sergio Moyano Diaz
 */
public class VistaAyuda extends JMenu {

	public VistaAyuda() {
		super("Ayuda");
		
		JMenuItem[] opciones = {new JMenuItem("Manual de usuario")};
		for (int i = 0; i < opciones.length; i++) {
			this.add(opciones[i]);
			opciones[i].addActionListener(new GestorMenu(i));
		}

	}

	private class GestorMenu implements ActionListener {

		private int Indice;

		public GestorMenu(int indice) {
			Indice = indice;

		}

		public void actionPerformed(ActionEvent e) {

			switch (Indice) {
				case 0:
					URL url = ClassLoader.getSystemClassLoader().getResource("manual.pdf");
					if (Desktop.isDesktopSupported()) {
						try {
							Desktop.getDesktop().open(new File(getClass().getResource("/manual.pdf").toURI()));
						} catch (Exception ex) {
							// no application registered for PDFs
						}
					} else {
						try {
							Runtime.getRuntime().exec("xdg-open " + url);
						} catch(IOException ex) {}
					}
					break;
			}


		}
	}
}