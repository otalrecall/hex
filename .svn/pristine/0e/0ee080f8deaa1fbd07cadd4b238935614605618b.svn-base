package Presentacion;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;

/**
 *
 * @author Sergio Moyano Diaz
 */
public class VistaMenu extends Vista {

        private JMenuBar mb;
	private VistaAyuda vd;
	
    
	public VistaMenu(VistaArchivo va) {
		super();
                mb = new JMenuBar();
                vd = new VistaAyuda();
                
                mb.add(va);
		mb.add(vd); 
                setfill(GridBagConstraints.BOTH);
                this.add(mb,configurarGrid(0,0,0,0,1,1,GridBagConstraints.WEST));             
	}
        
}