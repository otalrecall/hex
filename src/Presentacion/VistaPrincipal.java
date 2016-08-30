package Presentacion;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Sergio Moyano Diaz
 */
public class VistaPrincipal extends JFrame {

    private Vista vmenu;
    private Vista vtablero;
    private Vista vinfo;
    
    public VistaPrincipal(VistaInfo info,VistaTitulo titulo ,VistaTablero tablero,VistaMenu menu) {
        super();
        configurarventana();
        vmenu= menu;
        vtablero = tablero;
        vinfo = info;     

        this.setLayout( new GridBagLayout());
        vmenu.setweigth(1,0);
        vmenu.setfill(GridBagConstraints.HORIZONTAL);
        vmenu.setanchor(GridBagConstraints.NORTH);
        vmenu.setgridweigth(1, 3);
        this.add(vmenu,vmenu.configurarGrid(0,0));
        vmenu.setgridweigth(1, 1);
        vmenu.setweigth(1,1);
        vmenu.setfill(GridBagConstraints.BOTH);
        this.add(vtablero,vmenu.configurarGrid(1,1));
        this.add(titulo,vmenu.configurarGrid(2,1));
        vmenu.setweigth(0,1);
        this.add(vinfo,vmenu.configurarGrid(0,1)); 
        
        
    }

    private void configurarventana() {
        this.setIconImage(new ImageIcon(getClass().getResource("/icono.png")).getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH));
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(400, 500);
        Dimension d = new Dimension(400, 400);
        this.setMinimumSize(d);
        setTitle("Hexcellence");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);
       // this.setResizable(false);
        this.setAlwaysOnTop(true);
    }
}
