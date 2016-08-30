/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Otal
 */
public class VistaRanking extends Vista {

    private JTable tabla;
    private JScrollPane jScrollPane;
    private JButton reset;
    private JButton cargarRanking;
    private JComboBox selecDif;
    private JSpinner tam;
    private ControladorVistaRanking contRanking;

    public VistaRanking(ControladorVistaRanking contRanking) {
        this.setBackground(new Color(255, 255, 204));
        this.contRanking = contRanking;
        jScrollPane = new JScrollPane();
        tabla = new JTable(ERROR, WIDTH);
        reset = new JButton();
        cargarRanking = new JButton();
        selecDif = new JComboBox();
        selecDif.setModel(new javax.swing.DefaultComboBoxModel(
                new String[]{"Montecarlo-Distancia", "Montecarlo-Estocástico",
                    "Minimax-Distancia", "Minimax-Estocástico"}));
        SpinnerModel model1 = new SpinnerNumberModel(3, 3, null, 1);
        tam = new JSpinner(model1);
        tam.setMinimumSize(new java.awt.Dimension(60, 20));
        tam.setPreferredSize(new java.awt.Dimension(60, 20));
        reset.setText("Reset");
        cargarRanking.setText("Cargar");
        configTabla();
        JSeparator w = new JSeparator(JSeparator.HORIZONTAL);
        w.setBackground(new Color(255,154,154));
        w.setPreferredSize(new Dimension(150,5));
        JSeparator w2= new JSeparator(JSeparator.HORIZONTAL);
        w2.setBackground(new Color(255,154,154));
            w2.setPreferredSize(new Dimension(150,5));
        
        
        this.setfill(GridBagConstraints.HORIZONTAL );
        setweigth(0,1);
        setInsets(new Insets(5,5,5,5));
        JPanel o = new JPanel(new GridBagLayout());
        o.add(selecDif,configurarGrid(1, 0) );
        setInsets(new Insets(0,0,0,0));
        this.setgridweigth(1, 2);
        o.add(w2,configurarGrid(0, 1) );
        this.setgridweigth(1, 1);
        setInsets(new Insets(5,5,5,5));
       
        o.add(tam,configurarGrid(1, 2));
        this.setgridweigth(1, 2);
        setInsets(new Insets(0,0,0,0));
      
        o.add(w,configurarGrid(0,3 ) );
          this.setgridweigth(1, 1);
        setInsets(new Insets(5,5,5,5));
        JLabel i = new JLabel("Tamaño:");
        o.add(i,configurarGrid(0, 2) );
         JLabel i2 = new JLabel("Seleciona IA:");
        o.add(i2,configurarGrid(0, 0) );
        o.add(cargarRanking,configurarGrid(1, 4) );
        o.setBorder(BorderFactory.createLineBorder(new Color( 255,153,153)));
        o.setBackground(new Color(255,255,153));
      
        this.setfill(GridBagConstraints.HORIZONTAL );
        this.add(o, this.configurarGrid(0, 0));
        
        //this.add(tam, this.configurarGrid(0, 1));
        //this.add(cargarRanking, this.configurarGrid(0, 2));
        
        setweigth(1,0);
        this.add(jScrollPane, this.configurarGrid(0, 4));
        this.setfill(GridBagConstraints.NONE );
        setweigth(0,1);
        this.add(reset, this.configurarGrid(0, 5));
        cargarRanking.addActionListener(new gestorTam(1));
        reset.addActionListener(new gestorTam(2));
    }

    private class gestorTam implements ActionListener {

        private int Indice;
        private String cod;

        public gestorTam(int indice) {
            Indice = indice;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            switch (Indice) {
                case 1:
                    cod = codificar();
                    contRanking.capturarRanking(cod, tabla);
                    break;
                case 2:
                    cod = codificar();
                    contRanking.resetRanking(cod, tabla);
                    break;
            }
        }
    }

    private String codificar() {
        String num = ((Integer) tam.getValue()).toString();
        String s = num + "x" + num;
        if (selecDif.getSelectedIndex() == 0) { //montecarlo-dist
            s += "extr";
        } else if (selecDif.getSelectedIndex() == 1) { //montecarlo-esto
            s += "med";
        } else if (selecDif.getSelectedIndex() == 2) { //minimax-dist
            s += "easy";
        } else if (selecDif.getSelectedIndex() == 3) { //minimax-esto
            s += "hard";
        }
        return s;
    }

    private void configTabla() {
        jScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jScrollPane.setHorizontalScrollBar(null);
        jScrollPane.setMaximumSize(new java.awt.Dimension(200, 190));
        jScrollPane.setMinimumSize(new java.awt.Dimension(200, 190));
        jScrollPane.setPreferredSize(new java.awt.Dimension(200, 190));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null},
                    {null, null, null}
                },
                new String[]{
                    "#", "Nombre", "Puntos"
                }) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tabla.setGridColor(new java.awt.Color(255, 102, 102));
        tabla.setMaximumSize(new java.awt.Dimension(170, 160));
        tabla.setMinimumSize(new java.awt.Dimension(100, 160));
        tabla.setPreferredSize(new java.awt.Dimension(130, 160));
        tabla.setSelectionBackground(new java.awt.Color(255, 204, 204));
        tabla.getTableHeader().setResizingAllowed(false);
        jScrollPane.setViewportView(tabla);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.getColumnModel().getColumn(0).setResizable(false);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabla.getColumnModel().getColumn(1).setResizable(false);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
        tabla.getColumnModel().getColumn(2).setResizable(false);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(50);
    }
}
