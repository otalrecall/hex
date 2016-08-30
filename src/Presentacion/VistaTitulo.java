/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.*;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Otal
 */
public class VistaTitulo extends Vista {

    private JLabel lblTitulo;

    public VistaTitulo() {
        
        this.lblTitulo = new JLabel("HeXcellence ");
        lblTitulo.setHorizontalAlignment(JLabel.CENTER);
        Color c = new Color(255, 102, 102);
        lblTitulo.setForeground(c);
        Font font;
        try {
            font = Font.createFont(Font.TRUETYPE_FONT, new File(getClass().getResource("/fonts/Hexa.ttf ").toURI())).deriveFont(70f);
        } catch (Exception e) {
            try {
                font = Font.createFont(Font.TRUETYPE_FONT, new File("fonts/Hexa.ttf")).deriveFont(70f);
            } catch (Exception e2) {
                font = new Font("Verdana", Font.BOLD, 40);
            }
        }
        GraphicsEnvironment genv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        genv.registerFont(font);
        lblTitulo.setFont(font);
     
        this.setfill(GridBagConstraints.BOTH);
        this.setweigth(1, 1);
        setanchor( GridBagConstraints.CENTER ); 
        this.add(this.lblTitulo,configurarGrid(0,0));
        setBackground(new Color(255, 255, 204));
    }
}
