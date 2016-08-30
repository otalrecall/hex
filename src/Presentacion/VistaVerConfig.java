/*                                                  
 * To change this template, choose Tools | Templates                                                 
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author Otal
 */
public class VistaVerConfig extends Vista {

    private ControladorVistaConfig config;
    private boolean esPred;
    private boolean partidaIniciada;

    /**
     * Creates new form VistaVerConfig
     */
    public VistaVerConfig(ControladorVistaConfig config) {
        esPred = false;
        partidaIniciada = false;
        this.config = config;
        initComponents();
        jPanel1.setVisible(true);
        jLabelNombreJug1.setVisible(false);
        jTextFieldNom1.setVisible(false);
        jLabelNombreJug2.setVisible(false);
        jTextFieldNom2.setVisible(false);
        jLabelDif2.setVisible(false);
        jRadioButtonCPU2f.setVisible(false);
        jRadioButtonCPU2m.setVisible(false);
        jRadioButtonCPU2h.setVisible(false);
        jRadioButtonCPU2e.setVisible(false);
        jLabelDif1.setVisible(false);
        jRadioButtonCPU1f.setVisible(false);
        jRadioButtonCPU1m.setVisible(false);
        jRadioButtonCPU1h.setVisible(false);
        jRadioButtonCPU1e.setVisible(false);
        jSpinnerProf1.setVisible(false);
        jLabelProf1.setVisible(false);
        jSpinnerRam1.setVisible(false);
        jLabelRam1.setVisible(false);
        jLabelRam2.setVisible(false);
        jLabelProf2.setVisible(false);
        jSpinnerProf2.setVisible(false);
        jSpinnerRam2.setVisible(false);
        jLabelMinimax1.setVisible(false);
        jLabelMinimax2.setVisible(false);
        jLabelMontecarlo1.setVisible(false);
        jLabelMontecarlo2.setVisible(false);
        config.setVista(this);
        config.cargarConfig();
        int maxn = (Integer) jSpinner2.getValue();
        SpinnerNumberModel jSpinnerModelProf1 = (SpinnerNumberModel) jSpinnerProf1.getModel();
        jSpinnerModelProf1.setMaximum(maxn * maxn);
        SpinnerNumberModel jSpinnerModelProf2 = (SpinnerNumberModel) jSpinnerProf2.getModel();
        jSpinnerModelProf2.setMaximum(maxn * maxn);
        SpinnerNumberModel jSpinnerModelRam1 = (SpinnerNumberModel) jSpinnerRam1.getModel();
        jSpinnerModelRam1.setMaximum(maxn * maxn);
        SpinnerNumberModel jSpinnerModelRam2 = (SpinnerNumberModel) jSpinnerRam2.getModel();
        jSpinnerModelRam2.setMaximum(maxn * maxn);
        jSpinnerProf1.setModel(jSpinnerModelProf1);
        jSpinnerProf2.setModel(jSpinnerModelProf2);
        jSpinnerRam1.setModel(jSpinnerModelRam1);
        jSpinnerRam2.setModel(jSpinnerModelRam2);
        visibilidad();
        startButton.addActionListener(new gestorConfig(1));
        setSize(400, 400);
    }

    /**
     * Devuelve el radio button de apertura
     *
     * @param num El nÃºmero que identifica al radio button
     * @return Devuelve el radio button en cuestiÃ³n
     */
    public JRadioButton getAperturaRadioButton(int num) {
        if (num == 0) {
            return apertura0RadioButton;
        } else if (num == 1) {
            return apertura1RadioButton;
        } else {
            return apertura2RadioButton;
        }
    }

    public void setEsPred(boolean esPred) {
        this.esPred = esPred;
        if (esPred) {
            startButton.setText("Comenzar partida predeterminada");
        } else {
            startButton.setText("Comenzar partida");
        }
    }

    /**
     * Devuelve el radio button que indica si es CPU
     *
     * @param numJugador El nÃºmero del jugador
     * @return El radio button identificado por numJugador
     */
    public JRadioButton getEsCPURadioButton(int numJugador) {
        if (numJugador == 1) {
            return CPURadioButton1;
        } else {
            return CPURadioButton2;
        }
    }

    public String getNom(int njugador) {
        if (njugador == 1) {
            return jTextFieldNom1.getText();
        } else {
            return jTextFieldNom2.getText();
        }
    }

    public JSpinner getTamSpinner() {
        return jSpinner2;
    }

    public JSpinner getProfSpinner(int njugador) {
        if (njugador == 1) {
            return jSpinnerProf1;
        } else {
            return jSpinnerProf2;
        }
    }

    public JSpinner getRamSpinner(int njugador) {
        if (njugador == 1) {
            return jSpinnerRam1;
        } else {
            return jSpinnerRam2;
        }
    }

    public JRadioButton getDifRadioButton(int njugador, int dif) {
        if (njugador == 1) {
            if (dif == 1) {
                return jRadioButtonCPU1f;
            } else if (dif == 2) {
                return jRadioButtonCPU1m;
            } else if (dif == 3) {
                return jRadioButtonCPU1h;
            } else {
                return jRadioButtonCPU1e;
            }
        } else {
            if (dif == 1) {
                return jRadioButtonCPU2f;
            } else if (dif == 2) {
                return jRadioButtonCPU2m;
            } else if (dif == 3) {
                return jRadioButtonCPU2h;
            } else {
                return jRadioButtonCPU2e;
            }
        }
    }

    public JTextField getNomTextField(int njugador) {
        if (njugador == 1) {
            return jTextFieldNom1;
        } else {
            return jTextFieldNom2;
        }
    }

    public int getTam() {
        return (Integer) jSpinner2.getValue();
    }

    public int getRam(int njugador) {
        if (njugador == 1) {
            return (Integer) jSpinnerRam1.getValue();
        } else {
            return (Integer) jSpinnerRam2.getValue();
        }
    }

    public int getProf(int njugador) {
        if (njugador == 1) {
            return (Integer) jSpinnerProf1.getValue();
        } else {
            return (Integer) jSpinnerProf2.getValue();
        }
    }

    public int getDif(int njugador) {
        if (njugador == 1) {
            int dif1 = 0;
            if (jRadioButtonCPU1f.isSelected()) {
                dif1 = 1;
            } else if (jRadioButtonCPU1m.isSelected()) {
                dif1 = 2;
            } else if (jRadioButtonCPU1h.isSelected()) {
                dif1 = 3;
            } else if (jRadioButtonCPU1e.isSelected()) {
                dif1 = 4;
            }
            return dif1;
        } else {
            int dif2 = 0;
            if (jRadioButtonCPU2f.isSelected()) {
                dif2 = 1;
            } else if (jRadioButtonCPU2m.isSelected()) {
                dif2 = 2;
            } else if (jRadioButtonCPU2h.isSelected()) {
                dif2 = 3;
            } else if (jRadioButtonCPU2e.isSelected()) {
                dif2 = 4;
            }
            return dif2;
        }
    }

    /**
     * Devuelve el radio button que indica si es humano
     *
     * @param numJugador El nÃºmero del jugador
     * @return El radio button identificado por numJugador
     */
    public JRadioButton getEsHumanoRadioButton(int numJugador) {
        if (numJugador == 1) {
            return humRadioButton1;
        } else {
            return humRadioButton2;
        }
    }

    /**
     * Devuelve el spinner de la contrarreloj
     *
     * @return El spinner de la contrarreloj
     */
    public JSpinner getSpinnerContrarreloj() {
        return jSpinner1;
    }

    /**
     * Devuelve los check box de la configuraciÃ³n
     *
     * @param codigo Palabra que identifica cada check box
     * @return El check box seleccionado
     */
    public JCheckBox getCheckBox(String codigo) {
        if ("time".equals(codigo)) {
            return tiempoCheckBox;
        } else if ("help".equals(codigo)) {
            return helpCheckBox;
        } else if ("pie".equals(codigo)) {
            return tartaCheckBox;
        } else {
            return undoCheckBox;
        }
    }

    private class gestorConfig implements ActionListener {

        private int Indice;

        public gestorConfig(int indice) {
            Indice = indice;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (Indice) {
                case 1:
                    if ((humRadioButton1.isSelected() && jTextFieldNom1.getText().length() == 0)
                            || (humRadioButton2.isSelected() && jTextFieldNom2.getText().length() == 0)) {
                        alertLabel.setText("Â¡El nombre del jugador estÃ¡ vacÃ­o!");
                    } else if ((humRadioButton1.isSelected() && jTextFieldNom1.getText().length() > 25)
                            || (humRadioButton2.isSelected() && jTextFieldNom2.getText().length() > 25)) {
                        alertLabel.setText("Â¡El nombre del jugador supera los 25 carÃ¡cteres!");
                    } else {
                        comenzarPartida();
                    }
                    break;
            }
        }
    }

    /**
     * Rutina que configura la visibilidad de los componentes de la vista
     */
    private void visibilidad() {
        if (humRadioButton1.isSelected()) {
            jLabelNombreJug1.setVisible(true);
            jTextFieldNom1.setVisible(true);
        } else {
            jLabelDif1.setVisible(true);
            jRadioButtonCPU1f.setVisible(true);
            jRadioButtonCPU1m.setVisible(true);
            jRadioButtonCPU1h.setVisible(true);
            jRadioButtonCPU1e.setVisible(true);
            jSpinnerProf1.setVisible(true);
            jLabelProf1.setVisible(true);
            jSpinnerRam1.setVisible(true);
            jLabelRam1.setVisible(true);
            jLabelMinimax1.setVisible(true);
            jLabelMontecarlo1.setVisible(true);
        }
        if (humRadioButton2.isSelected()) {
            jLabelNombreJug2.setVisible(true);
            jTextFieldNom2.setVisible(true);
        } else {
            jLabelDif2.setVisible(true);
            jRadioButtonCPU2f.setVisible(true);
            jRadioButtonCPU2m.setVisible(true);
            jRadioButtonCPU2h.setVisible(true);
            jRadioButtonCPU2e.setVisible(true);
            jSpinnerProf2.setVisible(true);
            jLabelProf2.setVisible(true);
            jSpinnerRam2.setVisible(true);
            jLabelRam2.setVisible(true);
            jLabelMinimax2.setVisible(true);
            jLabelMontecarlo2.setVisible(true);
        }
        if (!tiempoCheckBox.isSelected()) {
            secLabel.setVisible(false);
        }

    }

    public void setUtilConfig(UtilConfiguracion utilConfig) {
        eliminarVisibilidadConfig();
        tartaCheckBox.setSelected(utilConfig.getTarta());
        helpCheckBox.setSelected(utilConfig.getHelp());
        undoCheckBox.setSelected(utilConfig.getUndo());
        boolean esHum1 = utilConfig.getEsHum1();
        humRadioButton1.setSelected(esHum1);
        if (esHum1) {
            jLabelNombreJug1.setVisible(true);
            jTextFieldNom1.setVisible(true);
            jTextFieldNom1.setText(utilConfig.getNom1());
        } else {
            jSpinnerProf1.setVisible(true);
            jLabelProf1.setVisible(true);
            jSpinnerRam1.setVisible(true);
            jLabelRam1.setVisible(true);
            jRadioButtonCPU1f.setVisible(true);
            jRadioButtonCPU1m.setVisible(true);
            jRadioButtonCPU1h.setVisible(true);
            jRadioButtonCPU1e.setVisible(true);
            jLabelMinimax1.setVisible(true);
            jLabelMontecarlo1.setVisible(true);
            int dif1 = utilConfig.getDif1();
            if (dif1 == 1) {
                jRadioButtonCPU1f.setSelected(true);
            } else if (dif1 == 2) {
                jRadioButtonCPU1m.setSelected(true);
            } else if (dif1 == 3) {
                jRadioButtonCPU1h.setSelected(true);
            } else if (dif1 == 4) {
                jRadioButtonCPU1e.setSelected(true);
            }
            jSpinnerRam1.setValue(utilConfig.getRamificacion(1));
            jSpinnerProf1.setValue(utilConfig.getProfundidad(1));
        }
        boolean esHum2 = utilConfig.getEsHum2();
        humRadioButton2.setSelected(esHum2);
        if (esHum2) {
            jLabelNombreJug2.setVisible(true);
            jTextFieldNom2.setVisible(true);
            jTextFieldNom2.setText(utilConfig.getNom2());
        } else {
            jSpinnerProf2.setVisible(true);
            jLabelProf2.setVisible(true);
            jSpinnerRam2.setVisible(true);
            jLabelRam2.setVisible(true);
            jRadioButtonCPU2f.setVisible(true);
            jRadioButtonCPU2m.setVisible(true);
            jRadioButtonCPU2h.setVisible(true);
            jRadioButtonCPU2e.setVisible(true);
            jLabelMinimax2.setVisible(true);
            jLabelMontecarlo2.setVisible(true);
            int dif2 = utilConfig.getDif2();
            if (dif2 == 2) {
                jRadioButtonCPU2f.setSelected(true);
            } else if (dif2 == 2) {
                jRadioButtonCPU2m.setSelected(true);
            } else if (dif2 == 3) {
                jRadioButtonCPU2h.setSelected(true);
            } else if (dif2 == 4) {
                jRadioButtonCPU2e.setSelected(true);
            }
            jSpinnerRam2.setValue(utilConfig.getRamificacion(2));
            jSpinnerProf2.setValue(utilConfig.getProfundidad(2));
        }
        int duracionTurno = utilConfig.getDuracionTurno();
        if (duracionTurno != 0) {
            secLabel.setVisible(true);
            jSpinner1.setVisible(true);
            tiempoCheckBox.setSelected(true);
            jSpinner1.setValue(duracionTurno);
        } else {
            tiempoCheckBox.setSelected(false);
        }
        int apertura = utilConfig.getApertura();
        if (apertura == 0) {
            apertura0RadioButton.setSelected(true);
        } else if (apertura == 1) {
            apertura1RadioButton.setSelected(true);
        } else if (apertura == 2) {
            apertura2RadioButton.setSelected(true);
        }
        jSpinner2.setValue(utilConfig.getTam());
    }

    /**
     * Rutina para comenzar la partida de juego
     */
    private void comenzarPartida() {
        UtilConfiguracion utilConfig = new UtilConfiguracion();
        utilConfig.setTarta(tartaCheckBox.isSelected());
        utilConfig.setHelp(helpCheckBox.isSelected());
        utilConfig.setUndo(undoCheckBox.isSelected());
        boolean esHum1 = humRadioButton1.isSelected();
        utilConfig.setHum1(esHum1);
        if (esHum1) {
            utilConfig.setNom1(jTextFieldNom1.getText());
        } else {
            if (jRadioButtonCPU1f.isSelected()) {
                utilConfig.setDif1(1);
            } else if (jRadioButtonCPU1m.isSelected()) {
                utilConfig.setDif1(2);
            } else if (jRadioButtonCPU1h.isSelected()) {
                utilConfig.setDif1(3);
            } else if (jRadioButtonCPU1e.isSelected()) {
                utilConfig.setDif1(4);
            }
            utilConfig.setRamificacion(1, (Integer) jSpinnerRam1.getValue());
            utilConfig.setProfundidad(1, (Integer) jSpinnerProf1.getValue());
        }
        boolean esHum2 = humRadioButton2.isSelected();
        utilConfig.setHum2(esHum2);
        if (esHum2) {
            utilConfig.setNom2(jTextFieldNom2.getText());
        } else {
            if (jRadioButtonCPU2f.isSelected()) {
                utilConfig.setDif2(1);
            } else if (jRadioButtonCPU2m.isSelected()) {
                utilConfig.setDif2(2);
            } else if (jRadioButtonCPU2h.isSelected()) {
                utilConfig.setDif2(3);
            } else if (jRadioButtonCPU2e.isSelected()) {
                utilConfig.setDif2(4);
            }
            utilConfig.setRamificacion(2, (Integer) jSpinnerRam2.getValue());
            utilConfig.setProfundidad(2, (Integer) jSpinnerProf2.getValue());
        }
        int duracionTurno;
        if (tiempoCheckBox.isSelected()) {
            duracionTurno = (Integer) jSpinner1.getValue();
        } else {
            duracionTurno = 0;
        }
        utilConfig.setDuracionTurno(duracionTurno);
        if (apertura0RadioButton.isSelected()) {
            utilConfig.setApertura(0);
        } else if (apertura1RadioButton.isSelected()) {
            utilConfig.setApertura(1);
        } else if (apertura2RadioButton.isSelected()) {
            utilConfig.setApertura(2);
        }
        utilConfig.setTam((Integer) jSpinner2.getValue());
        config.guardarConfig();
        try {
            if (!esPred) {
                config.comenzarPartida(utilConfig, true, false, null);
            } else {
                config.comenzarPartida(utilConfig, true, true, null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        partidaIniciada = true;
        deshabilitar();
    }

    public boolean getEsPred() {
        return esPred;
    }

    public boolean getPartidaIniciada() {
        return partidaIniciada;
    }

    public void deshabilitar() {
        startButton.setEnabled(false);
        jSpinner2.setEnabled(false);
        jTextFieldNom1.setEnabled(false);
        jTextFieldNom2.setEnabled(false);
        jRadioButtonCPU2f.setEnabled(false);
        jRadioButtonCPU2m.setEnabled(false);
        jRadioButtonCPU2h.setEnabled(false);
        jRadioButtonCPU2e.setEnabled(false);
        jRadioButtonCPU1f.setEnabled(false);
        jRadioButtonCPU1m.setEnabled(false);
        jRadioButtonCPU1h.setEnabled(false);
        jRadioButtonCPU1e.setEnabled(false);
        jSpinner1.setEnabled(false);
        jSpinnerProf1.setEnabled(false);
        jSpinnerRam1.setEnabled(false);
        jSpinnerProf2.setEnabled(false);
        jSpinnerRam2.setEnabled(false);
        tartaCheckBox.setEnabled(false);
        helpCheckBox.setEnabled(false);
        undoCheckBox.setEnabled(false);
        tiempoCheckBox.setEnabled(false);
        apertura0RadioButton.setEnabled(false);
        apertura1RadioButton.setEnabled(false);
        apertura2RadioButton.setEnabled(false);
        CPURadioButton1.setEnabled(false);
        CPURadioButton2.setEnabled(false);
        humRadioButton1.setEnabled(false);
        humRadioButton2.setEnabled(false);
    }

    public void habilitar() {
        partidaIniciada = false;
        startButton.setEnabled(true);
        jSpinner2.setEnabled(true);
        jTextFieldNom1.setEnabled(true);
        jTextFieldNom2.setEnabled(true);
        jRadioButtonCPU2f.setEnabled(true);
        jRadioButtonCPU2m.setEnabled(true);
        jRadioButtonCPU2h.setEnabled(true);
        jRadioButtonCPU2e.setEnabled(true);
        jRadioButtonCPU1f.setEnabled(true);
        jRadioButtonCPU1m.setEnabled(true);
        jRadioButtonCPU1h.setEnabled(true);
        jRadioButtonCPU1e.setEnabled(true);
        jSpinner1.setEnabled(true);
        jSpinnerProf1.setEnabled(true);
        jSpinnerRam1.setEnabled(true);
        jSpinnerProf2.setEnabled(true);
        jSpinnerRam2.setEnabled(true);
        tartaCheckBox.setEnabled(true);
        helpCheckBox.setEnabled(true);
        undoCheckBox.setEnabled(true);
        tiempoCheckBox.setEnabled(true);
        apertura0RadioButton.setEnabled(true);
        apertura1RadioButton.setEnabled(true);
        apertura2RadioButton.setEnabled(true);
        CPURadioButton1.setEnabled(true);
        CPURadioButton2.setEnabled(true);
        humRadioButton1.setEnabled(true);
        humRadioButton2.setEnabled(true);
    }

    private void eliminarVisibilidadConfig() {
        secLabel.setVisible(false);
        jSpinner1.setVisible(false);
        jLabelDif2.setVisible(false);
        jRadioButtonCPU2f.setVisible(false);
        jRadioButtonCPU2m.setVisible(false);
        jRadioButtonCPU2h.setVisible(false);
        jRadioButtonCPU2e.setVisible(false);
        jLabelDif1.setVisible(false);
        jRadioButtonCPU1f.setVisible(false);
        jRadioButtonCPU1m.setVisible(false);
        jRadioButtonCPU1h.setVisible(false);
        jRadioButtonCPU1e.setVisible(false);
        jSpinnerProf1.setVisible(false);
        jLabelProf1.setVisible(false);
        jSpinnerRam1.setVisible(false);
        jLabelRam1.setVisible(false);
        jSpinnerProf2.setVisible(false);
        jLabelProf2.setVisible(false);
        jSpinnerRam2.setVisible(false);
        jLabelRam2.setVisible(false);
        jLabelNombreJug1.setVisible(false);
        jLabelNombreJug2.setVisible(false);
        jTextFieldNom1.setVisible(false);
        jTextFieldNom2.setVisible(false);
        jLabelMinimax2.setVisible(false);
        jLabelMontecarlo2.setVisible(false);
        jLabelMinimax1.setVisible(false);
        jLabelMontecarlo1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroupMove = new javax.swing.ButtonGroup();
        buttonGroupP1 = new javax.swing.ButtonGroup();
        buttonGroupP2 = new javax.swing.ButtonGroup();
        buttonGroupDifCPU1 = new javax.swing.ButtonGroup();
        buttonGroupDifCPU2 = new javax.swing.ButtonGroup();
        tartaCheckBox = new javax.swing.JCheckBox();
        helpCheckBox = new javax.swing.JCheckBox();
        undoCheckBox = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        humRadioButton1 = new javax.swing.JRadioButton();
        CPURadioButton1 = new javax.swing.JRadioButton();
        humRadioButton2 = new javax.swing.JRadioButton();
        CPURadioButton2 = new javax.swing.JRadioButton();
        apertura2RadioButton = new javax.swing.JRadioButton();
        apertura1RadioButton = new javax.swing.JRadioButton();
        apertura0RadioButton = new javax.swing.JRadioButton();
        startButton = new javax.swing.JButton();
        secLabel = new javax.swing.JLabel();
        tiempoCheckBox = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabelTablero = new javax.swing.JLabel();
        jLabelNombreJug1 = new javax.swing.JLabel();
        jTextFieldNom1 = new javax.swing.JTextField();
        jLabelDif2 = new javax.swing.JLabel();
        jTextFieldNom2 = new javax.swing.JTextField();
        jLabelDif1 = new javax.swing.JLabel();
        jRadioButtonCPU1f = new javax.swing.JRadioButton();
        jRadioButtonCPU1m = new javax.swing.JRadioButton();
        jRadioButtonCPU1h = new javax.swing.JRadioButton();
        jLabelNombreJug2 = new javax.swing.JLabel();
        jRadioButtonCPU2f = new javax.swing.JRadioButton();
        jRadioButtonCPU2m = new javax.swing.JRadioButton();
        jRadioButtonCPU2h = new javax.swing.JRadioButton();
        jRadioButtonCPU1e = new javax.swing.JRadioButton();
        jRadioButtonCPU2e = new javax.swing.JRadioButton();
        jLabelProf1 = new javax.swing.JLabel();
        jLabelProf2 = new javax.swing.JLabel();
        jLabelRam1 = new javax.swing.JLabel();
        jLabelRam2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSpinnerProf1 = new javax.swing.JSpinner();
        jSpinnerRam1 = new javax.swing.JSpinner();
        jSpinnerProf2 = new javax.swing.JSpinner();
        jSpinnerRam2 = new javax.swing.JSpinner();
        jLabelMontecarlo1 = new javax.swing.JLabel();
        jLabelMinimax1 = new javax.swing.JLabel();
        jLabelMontecarlo2 = new javax.swing.JLabel();
        jLabelMinimax2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSpinner2 = new javax.swing.JSpinner();
        alertLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setMaximumSize(new java.awt.Dimension(314, 285));
        setName(""); // NOI18N
        setLayout(new java.awt.GridBagLayout());

        tartaCheckBox.setBackground(new java.awt.Color(255, 255, 204));
        tartaCheckBox.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        tartaCheckBox.setText("Habilitar regla de la tarta");
        tartaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tartaCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(tartaCheckBox, gridBagConstraints);

        helpCheckBox.setBackground(new java.awt.Color(255, 255, 204));
        helpCheckBox.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        helpCheckBox.setText("Habilitar sugerir");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(helpCheckBox, gridBagConstraints);

        undoCheckBox.setBackground(new java.awt.Color(255, 255, 204));
        undoCheckBox.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        undoCheckBox.setText("Habilitar deshacer");
        undoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                undoCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(undoCheckBox, gridBagConstraints);

        jSeparator1.setForeground(new java.awt.Color(255, 102, 102));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(jSeparator1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setText("Jugador 1  ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setText("Jugador 2");
        jLabel3.setMaximumSize(new java.awt.Dimension(65, 15));
        jLabel3.setMinimumSize(new java.awt.Dimension(65, 15));
        jLabel3.setPreferredSize(new java.awt.Dimension(65, 15));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(jLabel3, gridBagConstraints);

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 999, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 8);
        add(jSpinner1, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setText("Primer turno");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 12);
        add(jLabel5, gridBagConstraints);

        humRadioButton1.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroupP1.add(humRadioButton1);
        humRadioButton1.setSelected(true);
        humRadioButton1.setText("Humano");
        humRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humRadioButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(humRadioButton1, gridBagConstraints);

        CPURadioButton1.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroupP1.add(CPURadioButton1);
        CPURadioButton1.setText("CPU");
        CPURadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPURadioButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(CPURadioButton1, gridBagConstraints);

        humRadioButton2.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroupP2.add(humRadioButton2);
        humRadioButton2.setSelected(true);
        humRadioButton2.setText("Humano");
        humRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                humRadioButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(humRadioButton2, gridBagConstraints);

        CPURadioButton2.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroupP2.add(CPURadioButton2);
        CPURadioButton2.setText("CPU");
        CPURadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPURadioButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(CPURadioButton2, gridBagConstraints);

        apertura2RadioButton.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroupMove.add(apertura2RadioButton);
        apertura2RadioButton.setSelected(true);
        apertura2RadioButton.setText("Jugador 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(apertura2RadioButton, gridBagConstraints);

        apertura1RadioButton.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroupMove.add(apertura1RadioButton);
        apertura1RadioButton.setText("Jugador 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(apertura1RadioButton, gridBagConstraints);

        apertura0RadioButton.setBackground(new java.awt.Color(255, 255, 204));
        buttonGroupMove.add(apertura0RadioButton);
        apertura0RadioButton.setText("Aleatorio");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 16);
        add(apertura0RadioButton, gridBagConstraints);

        startButton.setText("Comenzar partida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        add(startButton, gridBagConstraints);

        secLabel.setText("segundos/turno");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(secLabel, gridBagConstraints);

        tiempoCheckBox.setBackground(new java.awt.Color(255, 255, 204));
        tiempoCheckBox.setText("Activar contrarreloj");
        tiempoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tiempoCheckBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        add(tiempoCheckBox, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 153)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabelTablero.setText("Tablero");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jPanel1.add(jLabelTablero, gridBagConstraints);

        jLabelNombreJug1.setText("Nombre Jugador 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel1.add(jLabelNombreJug1, gridBagConstraints);

        jTextFieldNom1.setText("J1");
        jTextFieldNom1.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextFieldNom1.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 10, 0, 0);
        jPanel1.add(jTextFieldNom1, gridBagConstraints);

        jLabelDif2.setText("Modo Jugador IA 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel1.add(jLabelDif2, gridBagConstraints);

        jTextFieldNom2.setText("J2");
        jTextFieldNom2.setMinimumSize(new java.awt.Dimension(100, 20));
        jTextFieldNom2.setPreferredSize(new java.awt.Dimension(100, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 10, 3, 0);
        jPanel1.add(jTextFieldNom2, gridBagConstraints);

        jLabelDif1.setText("Modo Jugador IA 1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel1.add(jLabelDif1, gridBagConstraints);

        jRadioButtonCPU1f.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroupDifCPU1.add(jRadioButtonCPU1f);
        jRadioButtonCPU1f.setSelected(true);
        jRadioButtonCPU1f.setText("Distancia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        jPanel1.add(jRadioButtonCPU1f, gridBagConstraints);

        jRadioButtonCPU1m.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroupDifCPU1.add(jRadioButtonCPU1m);
        jRadioButtonCPU1m.setText("Estocástico");
        jRadioButtonCPU1m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCPU1mActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jRadioButtonCPU1m, gridBagConstraints);

        jRadioButtonCPU1h.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroupDifCPU1.add(jRadioButtonCPU1h);
        jRadioButtonCPU1h.setText("Estocástico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        jPanel1.add(jRadioButtonCPU1h, gridBagConstraints);

        jLabelNombreJug2.setText("Nombre Jugador 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel1.add(jLabelNombreJug2, gridBagConstraints);

        jRadioButtonCPU2f.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroupDifCPU2.add(jRadioButtonCPU2f);
        jRadioButtonCPU2f.setSelected(true);
        jRadioButtonCPU2f.setText("Distancia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        jPanel1.add(jRadioButtonCPU2f, gridBagConstraints);

        jRadioButtonCPU2m.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroupDifCPU2.add(jRadioButtonCPU2m);
        jRadioButtonCPU2m.setText("Estocástico");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        jPanel1.add(jRadioButtonCPU2m, gridBagConstraints);

        jRadioButtonCPU2h.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroupDifCPU2.add(jRadioButtonCPU2h);
        jRadioButtonCPU2h.setText("Estocástico");
        jRadioButtonCPU2h.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCPU2hActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 13;
        jPanel1.add(jRadioButtonCPU2h, gridBagConstraints);

        jRadioButtonCPU1e.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroupDifCPU1.add(jRadioButtonCPU1e);
        jRadioButtonCPU1e.setText("Distancia");
        jRadioButtonCPU1e.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonCPU1eActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        jPanel1.add(jRadioButtonCPU1e, gridBagConstraints);

        jRadioButtonCPU2e.setBackground(new java.awt.Color(255, 255, 153));
        buttonGroupDifCPU2.add(jRadioButtonCPU2e);
        jRadioButtonCPU2e.setText("Distancia");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        jPanel1.add(jRadioButtonCPU2e, gridBagConstraints);

        jLabelProf1.setText("Profundidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        jPanel1.add(jLabelProf1, gridBagConstraints);

        jLabelProf2.setText("Profundidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 11;
        jPanel1.add(jLabelProf2, gridBagConstraints);

        jLabelRam1.setText("Ramificación");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelRam1, gridBagConstraints);

        jLabelRam2.setText("Ramificación");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelRam2, gridBagConstraints);

        jSeparator2.setBackground(new java.awt.Color(255, 153, 153));
        jSeparator2.setForeground(new java.awt.Color(255, 153, 153));
        jSeparator2.setMinimumSize(new java.awt.Dimension(1, 1));
        jSeparator2.setPreferredSize(new java.awt.Dimension(1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(jSeparator2, gridBagConstraints);

        jSpinnerProf1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel1.add(jSpinnerProf1, gridBagConstraints);

        jSpinnerRam1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel1.add(jSpinnerRam1, gridBagConstraints);

        jSpinnerProf2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel1.add(jSpinnerProf2, gridBagConstraints);

        jSpinnerRam2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.insets = new java.awt.Insets(2, 0, 0, 0);
        jPanel1.add(jSpinnerRam2, gridBagConstraints);

        jLabelMontecarlo1.setText("Montecarlo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelMontecarlo1, gridBagConstraints);

        jLabelMinimax1.setText("Minimax");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelMinimax1, gridBagConstraints);

        jLabelMontecarlo2.setText("Montecarlo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelMontecarlo2, gridBagConstraints);

        jLabelMinimax2.setText("Minimax");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        jPanel1.add(jLabelMinimax2, gridBagConstraints);

        jSeparator3.setBackground(new java.awt.Color(255, 153, 153));
        jSeparator3.setForeground(new java.awt.Color(255, 153, 153));
        jSeparator3.setMinimumSize(new java.awt.Dimension(1, 1));
        jSeparator3.setPreferredSize(new java.awt.Dimension(1, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanel1.add(jSeparator3, gridBagConstraints);

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(3), Integer.valueOf(3), null, Integer.valueOf(1)));
        jSpinner2.setMinimumSize(new java.awt.Dimension(60, 20));
        jSpinner2.setPreferredSize(new java.awt.Dimension(60, 20));
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 10, 0, 0);
        jPanel1.add(jSpinner2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 0, 0, 0);
        add(jPanel1, gridBagConstraints);

        alertLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        alertLabel.setForeground(new java.awt.Color(255, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        add(alertLabel, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void undoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_undoCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_undoCheckBoxActionPerformed

    private void tartaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tartaCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tartaCheckBoxActionPerformed

    private void tiempoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tiempoCheckBoxActionPerformed
        // TODO add your handling code here:
        if (tiempoCheckBox.isSelected()) {
            jSpinner1.setVisible(true);
            secLabel.setVisible(true);
        } else {
            jSpinner1.setVisible(false);
            secLabel.setVisible(false);
        }
    }//GEN-LAST:event_tiempoCheckBoxActionPerformed

    private void jRadioButtonCPU1mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCPU1mActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCPU1mActionPerformed

    private void CPURadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPURadioButton1ActionPerformed
        // TODO add your handling code here:
        jLabelDif1.setVisible(true);
        jRadioButtonCPU1f.setVisible(true);
        jRadioButtonCPU1m.setVisible(true);
        jRadioButtonCPU1h.setVisible(true);
        jRadioButtonCPU1e.setVisible(true);
        jSpinnerProf1.setVisible(true);
        jLabelProf1.setVisible(true);
        jSpinnerRam1.setVisible(true);
        jLabelRam1.setVisible(true);
        jLabelNombreJug1.setVisible(false);
        jTextFieldNom1.setVisible(false);
        jLabelMinimax1.setVisible(true);
        jLabelMontecarlo1.setVisible(true);
    }//GEN-LAST:event_CPURadioButton1ActionPerformed

    private void CPURadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPURadioButton2ActionPerformed
        // TODO add your handling code here:
        jLabelDif2.setVisible(true);
        jRadioButtonCPU2f.setVisible(true);
        jRadioButtonCPU2m.setVisible(true);
        jRadioButtonCPU2h.setVisible(true);
        jRadioButtonCPU2e.setVisible(true);
        jSpinnerProf2.setVisible(true);
        jLabelProf2.setVisible(true);
        jSpinnerRam2.setVisible(true);
        jLabelRam2.setVisible(true);
        jLabelNombreJug2.setVisible(false);
        jTextFieldNom2.setVisible(false);
        jLabelMinimax2.setVisible(true);
        jLabelMontecarlo2.setVisible(true);
    }//GEN-LAST:event_CPURadioButton2ActionPerformed

    private void humRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humRadioButton1ActionPerformed
        // TODO add your handling code here:
        jLabelDif1.setVisible(false);
        jRadioButtonCPU1f.setVisible(false);
        jRadioButtonCPU1m.setVisible(false);
        jRadioButtonCPU1h.setVisible(false);
        jRadioButtonCPU1e.setVisible(false);
        jSpinnerProf1.setVisible(false);
        jLabelProf1.setVisible(false);
        jSpinnerRam1.setVisible(false);
        jLabelRam1.setVisible(false);
        jLabelNombreJug1.setVisible(true);
        jTextFieldNom1.setVisible(true);
        jLabelMinimax1.setVisible(false);
        jLabelMontecarlo1.setVisible(false);
    }//GEN-LAST:event_humRadioButton1ActionPerformed

    private void humRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_humRadioButton2ActionPerformed
        // TODO add your handling code here:
        jLabelDif2.setVisible(false);
        jRadioButtonCPU2f.setVisible(false);
        jRadioButtonCPU2m.setVisible(false);
        jRadioButtonCPU2h.setVisible(false);
        jRadioButtonCPU2e.setVisible(false);
        jSpinnerProf2.setVisible(false);
        jLabelProf2.setVisible(false);
        jSpinnerRam2.setVisible(false);
        jLabelRam2.setVisible(false);
        jLabelNombreJug2.setVisible(true);
        jTextFieldNom2.setVisible(true);
        jLabelMinimax2.setVisible(false);
        jLabelMontecarlo2.setVisible(false);
    }//GEN-LAST:event_humRadioButton2ActionPerformed

    private void jRadioButtonCPU1eActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCPU1eActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCPU1eActionPerformed

    private void jRadioButtonCPU2hActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonCPU2hActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonCPU2hActionPerformed

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        // TODO add your handling code here:
        int maxn = (Integer) jSpinner2.getValue();
        SpinnerNumberModel jSpinnerModelProf1 = (SpinnerNumberModel) jSpinnerProf1.getModel();
        jSpinnerModelProf1.setMaximum(maxn * maxn);
        SpinnerNumberModel jSpinnerModelProf2 = (SpinnerNumberModel) jSpinnerProf2.getModel();
        jSpinnerModelProf2.setMaximum(maxn * maxn);
        SpinnerNumberModel jSpinnerModelRam1 = (SpinnerNumberModel) jSpinnerRam1.getModel();
        jSpinnerModelRam1.setMaximum(maxn * maxn);
        SpinnerNumberModel jSpinnerModelRam2 = (SpinnerNumberModel) jSpinnerRam2.getModel();
        jSpinnerModelRam2.setMaximum(maxn * maxn);
        jSpinnerProf1.setModel(jSpinnerModelProf1);
        jSpinnerProf2.setModel(jSpinnerModelProf2);
        jSpinnerRam1.setModel(jSpinnerModelRam1);
        jSpinnerRam2.setModel(jSpinnerModelRam2);
        if ((Integer) jSpinnerProf1.getValue() > maxn * maxn) {
            jSpinnerProf1.setValue(maxn * maxn);
            jSpinnerProf2.setValue(maxn * maxn);
            jSpinnerRam1.setValue(maxn * maxn);
            jSpinnerRam2.setValue(maxn * maxn);
        }
    }//GEN-LAST:event_jSpinner2StateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton CPURadioButton1;
    private javax.swing.JRadioButton CPURadioButton2;
    private javax.swing.JLabel alertLabel;
    private javax.swing.JRadioButton apertura0RadioButton;
    private javax.swing.JRadioButton apertura1RadioButton;
    private javax.swing.JRadioButton apertura2RadioButton;
    private javax.swing.ButtonGroup buttonGroupDifCPU1;
    private javax.swing.ButtonGroup buttonGroupDifCPU2;
    private javax.swing.ButtonGroup buttonGroupMove;
    private javax.swing.ButtonGroup buttonGroupP1;
    private javax.swing.ButtonGroup buttonGroupP2;
    private javax.swing.JCheckBox helpCheckBox;
    private javax.swing.JRadioButton humRadioButton1;
    private javax.swing.JRadioButton humRadioButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDif1;
    private javax.swing.JLabel jLabelDif2;
    private javax.swing.JLabel jLabelMinimax1;
    private javax.swing.JLabel jLabelMinimax2;
    private javax.swing.JLabel jLabelMontecarlo1;
    private javax.swing.JLabel jLabelMontecarlo2;
    private javax.swing.JLabel jLabelNombreJug1;
    private javax.swing.JLabel jLabelNombreJug2;
    private javax.swing.JLabel jLabelProf1;
    private javax.swing.JLabel jLabelProf2;
    private javax.swing.JLabel jLabelRam1;
    private javax.swing.JLabel jLabelRam2;
    private javax.swing.JLabel jLabelTablero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonCPU1e;
    private javax.swing.JRadioButton jRadioButtonCPU1f;
    private javax.swing.JRadioButton jRadioButtonCPU1h;
    private javax.swing.JRadioButton jRadioButtonCPU1m;
    private javax.swing.JRadioButton jRadioButtonCPU2e;
    private javax.swing.JRadioButton jRadioButtonCPU2f;
    private javax.swing.JRadioButton jRadioButtonCPU2h;
    private javax.swing.JRadioButton jRadioButtonCPU2m;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinnerProf1;
    private javax.swing.JSpinner jSpinnerProf2;
    private javax.swing.JSpinner jSpinnerRam1;
    private javax.swing.JSpinner jSpinnerRam2;
    private javax.swing.JTextField jTextFieldNom1;
    private javax.swing.JTextField jTextFieldNom2;
    private javax.swing.JLabel secLabel;
    private javax.swing.JButton startButton;
    private javax.swing.JCheckBox tartaCheckBox;
    private javax.swing.JCheckBox tiempoCheckBox;
    private javax.swing.JCheckBox undoCheckBox;
    // End of variables declaration//GEN-END:variables
}
