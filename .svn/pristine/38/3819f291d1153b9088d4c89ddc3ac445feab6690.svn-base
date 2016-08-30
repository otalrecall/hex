/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import dominio.ControladorConfig;
import javax.swing.JOptionPane;

/**
 *
 * @author Otal
 */
public class ControladorVistaConfig {

    private VistaVerConfig vistaC;
    private ControladorConfig config;
    private ControladorVistaJuego juego;
    private ControladorVistaPartida partida;

    public ControladorVistaConfig() {
        config = new ControladorConfig();
        vistaC = new VistaVerConfig(this);
    }

    public void setControladores(ControladorVistaJuego juego,
            ControladorVistaPartida partida) {
        this.juego = juego;
        this.partida = partida;
    }
    
    public void setEsPred(boolean esPred) {
        vistaC.setEsPred(esPred);
    }

    public void comenzarPartida(UtilConfiguracion utilConfig, boolean newGame, boolean esPred, String path) throws Exception {
        partida.setEsPred(esPred);
        partida.setUtilConfig(utilConfig);
        partida.setNewGame(newGame);
        partida.setPath(path);
        partida.comenzarPartida();
        juego.setControladorVistaPartida(partida);
        juego.setUtilConfig(utilConfig);
        juego.setNewGame(newGame);
        juego.comenzarJuego();
    }

    public void setUtilConfig(UtilConfiguracion utilConfig) {
        vistaC.setUtilConfig(utilConfig);
    }

    public VistaVerConfig getVista() {
        return vistaC;
    }

    /**
     * Introduce la vista
     *
     * @param vistaC La vista en cuestión
     */
    public void setVista(VistaVerConfig vistaC) {
        this.vistaC = vistaC;
    }

    /**
     * Rutina que imprime la configuración en la vista
     *
     */
    public void cargarConfig() {
        if (config.getTarta()) {
            vistaC.getCheckBox("pie").setSelected(true);
        }
        if (config.getAyuda()) {
            vistaC.getCheckBox("help").setSelected(true);
        }
        if (config.getDeshacer()) {
            vistaC.getCheckBox("undo").setSelected(true);
        }
        if (config.getApertura() == 1) {
            vistaC.getAperturaRadioButton(1).setSelected(true);
        } else if (config.getApertura() == 2) {
            vistaC.getAperturaRadioButton(2).setSelected(true);
        } else {
            vistaC.getAperturaRadioButton(0).setSelected(true);
        }
        if (config.getHumano1()) {
            vistaC.getEsHumanoRadioButton(1).setSelected(true);
            vistaC.getNomTextField(1).setText(config.getNombre1());
        } else {
            vistaC.getEsCPURadioButton(1).setSelected(true);
            vistaC.getDifRadioButton(1, config.getDifIA1()).setSelected(true);
            vistaC.getProfSpinner(1).setValue(config.getProfIA1());
            vistaC.getRamSpinner(1).setValue(config.getRamIA1());
        }
        if (config.getHumano2()) {
            vistaC.getEsHumanoRadioButton(2).setSelected(true);
            vistaC.getNomTextField(2).setText(config.getNombre2());
        } else {
            vistaC.getEsCPURadioButton(2).setSelected(true);
            vistaC.getDifRadioButton(2, config.getDifIA2()).setSelected(true);
            vistaC.getProfSpinner(2).setValue(config.getProfIA2());
            vistaC.getRamSpinner(2).setValue(config.getRamIA2());
        }
        int tiempoTurno;
        try {
            tiempoTurno = config.getDuracionTurno();
            vistaC.getCheckBox("time").setSelected(true);
            vistaC.getSpinnerContrarreloj().setValue(tiempoTurno);
        } catch (Exception e) {
            vistaC.getCheckBox("time").setSelected(false);
            vistaC.getSpinnerContrarreloj().setVisible(false);
        }
        vistaC.getTamSpinner().setValue(config.getTamanno());
    }

    public void deshabilitar() {
        vistaC.deshabilitar();
    }

    /**
     * Rutina que guarda la configuración predeterminada
     *
     */
    public void guardarConfig() {
        //config = new ControladorConfig();
        try {
            int apertura;
            if (vistaC.getAperturaRadioButton(1).isSelected()) {
                apertura = 1;
            } else if (vistaC.getAperturaRadioButton(2).isSelected()) {
                apertura = 2;
            } else {
                apertura = 0;
            }
            config.setApertura(apertura);
            config.setAyuda(vistaC.getCheckBox("help").isSelected());
            config.setTarta(vistaC.getCheckBox("pie").isSelected());
            config.setDeshacer(vistaC.getCheckBox("undo").isSelected());
            boolean hum1 = vistaC.getEsHumanoRadioButton(1).isSelected();
            if (!hum1) {
                config.setDifIA1(vistaC.getDif(1));
                config.setProfIA1(vistaC.getProf(1));
                config.setRamIA1(vistaC.getRam(1));
            } else {
                config.setNombre1(vistaC.getNom(1));
            }
            boolean hum2 = vistaC.getEsHumanoRadioButton(2).isSelected();
            if (!hum2) {
                config.setDifIA2(vistaC.getDif(2));
                config.setProfIA2(vistaC.getProf(2));
                config.setRamIA2(vistaC.getRam(2));
            } else {
                config.setNombre2(vistaC.getNom(2));
            }
            config.setTamanno(vistaC.getTam());
            config.setHumano1(hum1);
            config.setHumano2(hum2);
            if (vistaC.getCheckBox("time").isSelected()) {
                int time = (Integer) vistaC.getSpinnerContrarreloj().getValue();
                config.setDuracionTurno(time);
            } else {
                config.setDuracionTurno(0);
            }
            config.guardarConfigPredeterminada();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(vistaC, e.getMessage());
        }
    }
    
    public boolean getEsPred() {
        return vistaC.getEsPred();
    }
    
        public boolean getPartidaIniciada() {
        return vistaC.getPartidaIniciada();
    }
    
    public void habilitarConfig() {
        vistaC.habilitar();
    }
}
