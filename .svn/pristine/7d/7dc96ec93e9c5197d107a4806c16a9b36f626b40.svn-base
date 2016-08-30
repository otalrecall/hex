/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import dominio.ControladorRanking;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Otal
 */
public class ControladorVistaRanking {

    private ControladorRanking r;
    private VistaRanking vistaR;

    public ControladorVistaRanking() {
        r = new ControladorRanking();
        vistaR = new VistaRanking(this);
    }
    
    public VistaRanking getVista() {
        return vistaR;
    }
    
    /**
     *
     * @param vistaR
     */
    public void setVista (VistaRanking vistaR) {
        this.vistaR = vistaR;
    }

    /**
     * Carga o guarda un ranking
     *
     * @param r El ranking
     * @param clau Clave para acceder al ranking pertinente, según dificultad y
     * tamaño
     * @param tabla La tabla donde se escribe el ranking
     */
    public void capturarRanking(String clau, JTable tabla) {
        for (int i = 1; i <= 10; ++i) {
            tabla.setValueAt(null, i - 1, 0);
            tabla.setValueAt(null, i - 1, 1);
            tabla.setValueAt(null, i - 1, 2);
        }
        try {
            r.cargarRanking(clau);
        } catch (Exception e) {
            try {
                r.reset();
                r.guardarRanking(clau);
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(vistaR, e2.getMessage());
            }
        }
        String lista[][] = r.getEntradas();
        for (int i = 1; i <= lista.length; ++i) {
            tabla.setValueAt(i, i - 1, 0);
            tabla.setValueAt(lista[i - 1][0], i - 1, 1);
            tabla.setValueAt(lista[i - 1][1], i - 1, 2);
        }
    }
    
        /**
     * Resetea un ranking dejándolo vacío
     *
     * @param r El ranking
     * @param clau Clave para acceder al ranking pertinente, según dificultad y
     * tamaño
     * @param tabla La tabla donde se escribe el ranking
     */
    public void resetRanking(String clau, JTable tabla) {
        for (int i = 1; i <= 10; ++i) {
            tabla.setValueAt(null, i - 1, 0);
            tabla.setValueAt(null, i - 1, 1);
            tabla.setValueAt(null, i - 1, 2);
        }
        try {
            r.cargarRanking(clau);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vistaR, e.getMessage());
        }
        r.reset();
        try {
            r.guardarRanking(clau);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vistaR, e.getMessage());
        }
    }
}
