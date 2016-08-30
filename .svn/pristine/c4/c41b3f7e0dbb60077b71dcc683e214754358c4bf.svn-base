package Presentacion;

import java.awt.Component;

/**
 *
 * @author Sergio Moyano Diaz
 */
public class ControladorPresentacion {

    //private static final long serialVersionUID = 1L;     
    private ControladorVistaPartida vp;
    private ControladorVistaConfig vc;
    private ControladorVistaRanking vr;
    private ControladorVistaJuego vj;
    private VistaPrincipal vpr;
    
    public ControladorPresentacion() {
        try {            
            vr = new ControladorVistaRanking();
            vc = new ControladorVistaConfig();
            vp = new ControladorVistaPartida();
            vj = new ControladorVistaJuego();            
            vc.setControladores(vj, vp);
            vp.crearVistas(vj, vc);
                
            VistaInfo vi = new VistaInfo(vc.getVista(), vj.getVistaAlgoritmo(), vr.getVista());            
            vpr = new VistaPrincipal(vi, vp.getVistaTitulo(), vj.getVistaTablero(), vp.getVistaMenu());
            vj.setVistaInfo(vi);
            this.inicializaVP(null);
            
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }
    
    public void inicializaVP(Component nd) {
        
        vpr.setLocationRelativeTo(nd);
        vpr.setVisible(true);
    }
}
