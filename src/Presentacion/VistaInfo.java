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
 * @author Sergio Moyano Diaz
 */
public final class VistaInfo extends Vista{
   
    
   private VistaVerAlgoritmo vva;
   private VistaVerConfig vconf;
   private VistaAcercade vac;
   private VistaRanking vr;
   private JComboBox jc; 
   private JButton ocultador;
   private ImageIcon i1;
   private ImageIcon i2;
   private boolean veralgo;
   public VistaInfo(VistaVerConfig vc,VistaVerAlgoritmo algo,VistaRanking  vr){
        super();
     
        jc = new JComboBox();
        JPanel o = new JPanel(new GridBagLayout());
        o.setBackground(new Color(216, 180, 140));
        o.setBorder(BorderFactory.createLineBorder(Color.black));
        ocultador = new JButton();
        
        i1 = new ImageIcon(getClass().getResource("/arrow_left.png"));
        i1.setImage(i1.getImage().getScaledInstance(30, 80, Image.SCALE_SMOOTH));
        i2 = new ImageIcon(getClass().getResource("/arrow_right.png"));
        i2.setImage(i2.getImage().getScaledInstance(30, 80, Image.SCALE_SMOOTH));
       
        o.add( ocultador,this.configurarGrid(0,0) );
        ocultador.setPreferredSize(new Dimension(15,40));
        ocultador.setMaximumSize(new Dimension(15,40));
        ocultador.setMinimumSize(new Dimension(15,40));
        ocultador.setSelectedIcon( new ImageIcon());
        ocultador.setFocusable(false);
        // Creacion del JComboBox y añadir los items.
        setveralgo(false);
	ocultador.setIcon(i1);
	// Accion a realizar cuando el JComboBox cambia de item seleccionado.
	jc.addActionListener(new GestorCombo());
        ocultador.addActionListener(new GestorOcultador());
        vconf =  vc;  
        vva = algo;
        vac = new VistaAcercade();
        this.vr = vr;
        setBackground( new Color(255,255,204));
        add(jc, this.configurarGrid(0, 0));
       
       this.setfill(GridBagConstraints.BOTH);
       this.setgridweigth(2, 1);
       this.setweigth(0, 1);      
       setanchor(GridBagConstraints.EAST);
       add(o, this.configurarGrid(1,0)) ;
       this.setgridweigth(1, 1);
       this.setfill(GridBagConstraints.BOTH);
         
    
        vva.setPreferredSize(vconf.getPreferredSize());
        vac.setPreferredSize(vconf.getPreferredSize());
        vr.setPreferredSize(vconf.getPreferredSize());
        
        
        this.setweigth(1, 1);
        this.setInsets(new Insets(1,5,1,5));
        add(vconf, this.configurarGrid(0, 1));
        //f = new VistaVerAlgoritmo(utilConfig.getTam());
        
   }
   public void setveralgo( boolean b){
       veralgo=b;
       if(b){
        
       if(jc.getItemCount() != 0) jc.removeAllItems();
        jc.addItem("Configuración");
	jc.addItem("Ver Algoritmo");
        jc.addItem("Ranking");
	jc.addItem("Acerca de"); 
        
       }else{
        
        if(jc.getItemCount() != 0)jc.removeAllItems();      
        jc.addItem("Configuración");
        jc.addItem("Ranking");
	jc.addItem("Acerca de");
          
       }
       
   }
   public void cambiarinfo(){
       
       if(jc.getSelectedItem().equals("Configuración")  ){
            this.setVisible(false);
            this.remove(2);
            add(vconf,this.configurarGrid(0, 1) );                
            this.setVisible(true);
        }else if(jc.getSelectedItem().equals("Ver Algoritmo") ){
            setVisible(false);
            remove(2);
            add(vva,this.configurarGrid(0, 1) );        
            this.setVisible(true);         
        }else if(jc.getSelectedItem().equals("Ranking") ){
            this.setVisible(false);
            this.remove(2);
            add(vr,this.configurarGrid(0, 1) );        
            this.setVisible(true);
        }else if(jc.getSelectedItem().equals("Acerca de") ){
            this.setVisible(false);
            this.remove(2);
            add(vac,this.configurarGrid(0, 1) );
           this.setVisible(true);
        }
           
   }
   public VistaVerAlgoritmo getVistaAlgoritmo(){ 
      return vva;
   }

   private class GestorCombo implements ActionListener {
  
        @Override
        public void actionPerformed(ActionEvent e) {
        if(jc.getItemCount() !=0)     cambiarinfo();
        }
   }
   private class GestorOcultador implements ActionListener{
       
       private boolean estado ;
       
       GestorOcultador(){ 
        estado = false; 
       }
           @Override    
           public void actionPerformed(ActionEvent e){
           estado = !estado; 
           modificaPanel(estado); 
        }
            
        
       }
       
    public void modificaPanel(boolean estado ){
     
        if(estado){
            
          vconf.setVisible(false);
          vac.setVisible(false); 
          if(veralgo) vva.setVisible(false);
          vr.setVisible(false);
          jc.setVisible(false);
          
          ocultador.setIcon(i2);
            
        }else{
          jc.setVisible(true);
          vconf.setVisible(true);
          vac.setVisible(true); 
          if(veralgo)vva.setVisible(true);
          vr.setVisible(true);  
            ocultador.setIcon(i1);
        }
     
    }
  
  
}