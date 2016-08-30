package Presentacion;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Sergio Moyano Diaz
 */
public class VistaAcercade extends Vista {

    private static final long serialVersionUID = 1L;
   // private VistaMenu menu;

    public VistaAcercade(/*VistaMenu menu*/) {
        //this.menu = menu;
        this.setBackground(new Color(255,255,204));
        //setLayout(new GridBagLayout());
        GridBagConstraints delimitador = new GridBagConstraints(); //Creamos un delimitador que usaremos para especificar la ubicación de los componentes dentro del panel
        delimitador.ipadx = 10; //Espacio mínimo entre los componentes de un mismo renglon
        delimitador.ipady = 5; //Altura de los componentes

        JLabel titulo = new JLabel("<html><center><FONT COLOR=#ff6666><font size=+4>"
                + "<b>HeXcellence</b></font></FONT><br>Versión 2.0</center>");

        JLabel texto = new JLabel("<html><br><center>Una aplicación desarrolla por: "
                + "<br><b>Sergio Moyano Diaz <br>Alexandre Ramírez Gómez <br>Daniel Otal Rodríguez</b>" + "<br><br>"
                + "Subgrupo 6.3<br>PROP<br><br>  </center>");
        delimitador.gridx = 0;
        delimitador.gridy = 0;

        add(titulo, delimitador);
        delimitador.gridx = 0;
        delimitador.gridy = 1;

        add(texto, delimitador);
        //JButton volver = new JButton("Volver");
        //delimitador.gridx = 0;
        //delimitador.gridy = 2;
        //add(volver, delimitador);
        //volver.addActionListener(new GestorMenu());
        setSize(400, 400);


    }
/*
    private class GestorMenu implements ActionListener {

        public GestorMenu() {
        }

        public void actionPerformed(ActionEvent e) {
            Volver();
        }
    }

    public void Volver() {
        VistaMenu f = menu;
        this.setVisible(false);
        this.getRootPane().setContentPane(f);
        this.setVisible(true);
    }
    * */
}
