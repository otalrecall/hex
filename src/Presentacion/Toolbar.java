package Presentacion;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Sergio Moyano Diaz
 */
public  class Toolbar extends Vista {
   
    private JButton deshacer;
    private JButton sugerir;
    private JSpinner contador;
    private ControladorVistaJuego cj;
    public Toolbar(ControladorVistaJuego cj) {
        super();   
        this.cj =cj;
        deshacer = new JButton();
  
        sugerir = new JButton();
        deshacer.setLayout(new BorderLayout());
        sugerir.setLayout(new BorderLayout());
        ImageIcon icon2=new ImageIcon(getClass().getResource("/Undo-icon.png"));
        icon2.setImage(icon2.getImage().getScaledInstance(30, 30,Image.SCALE_AREA_AVERAGING));

        JLabel icono = new JLabel("<html><center><FONT COLOR=#d8b48c><font size=+4>"
                + "<b>..  </b></font></FONT><FONT COLOR=#ffffff><font size=+4>"
                + "<b>?</b></font></FONT></center>");
        JLabel text1= new JLabel("<html><center><FONT COLOR=#ffffff><font size-=8>"
                + "<b>Sugerir Jugada</b></font></FONT></center>");
        sugerir.add(text1,BorderLayout.CENTER );
        sugerir.add(icono,BorderLayout.NORTH );
        sugerir.setBackground(new Color(216, 180, 140 ) );
        setBackground(new Color(216, 180, 140));
        JLabel icono2 = new JLabel();
        icono2.setIcon(icon2);
        JLabel text2= new JLabel("<html><center><FONT COLOR=#ffffff><font size-=4>"
                + "<b>Deshacer</b></font></FONT></center>");
        deshacer.add(text2,BorderLayout.SOUTH );   
        deshacer.add(icono2,BorderLayout.NORTH );
        deshacer.setBackground(new Color(216, 180, 140 ) );
        deshacer.setPreferredSize(new Dimension(85,50));
        contador = new JSpinner(new SpinnerNumberModel(1, 1, 99, 1));
        contador.setPreferredSize(new Dimension(35,65));
        sugerir.setPreferredSize(new Dimension(120,65));
        deshacer.setPreferredSize(new Dimension(90,65));
        deshacer.addActionListener(new GestorTool(1));
        sugerir.addActionListener(new GestorTool(2));
        
        add(contador,this.configurarGrid(0,0));
        add(deshacer,this.configurarGrid(1,0));
        add(sugerir,this.configurarGrid(2,0)); 
        
    }
    
    public void  setdeshacer(boolean t){
        
        deshacer.setVisible(t);
        contador.setVisible(t);
    }
    
    public void setAyuda(boolean a){
        sugerir.setVisible(a);
        
    }
    
    public void habilitardeshacer(boolean e){
        deshacer.setEnabled(e);
        contador.setEnabled(e);
        
    }
    public void habilitarAyuda(boolean e){
        sugerir.setEnabled(e);
        
    }
    private class GestorTool implements ActionListener{
       
     private int pos;   
        
     GestorTool(int pos ){
       this.pos =pos;        
     } 
     
     @Override
     public void actionPerformed(ActionEvent e ){
         
        switch(pos){
            
            case 1:
                
                try{
                    Integer i = (Integer)contador.getValue();
                    cj.undo(i);
                }catch(Exception w){
                    w.printStackTrace();
                }
                
                break;
                
            case 2:
                 try{
                    cj.ayuda();
                }catch(Exception w){
                    w.printStackTrace();
                }
                
                
                break;
            
            
        }
         
     }
        
    }

}