/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Sergio Moyano Diaz
 */
public class VistaNodo extends JPanel {
      
       private int[][] o;
       private JHexButton[][] b;
       private JPanel h;
       private JHexLayout c;
       private JLabel th;
       
       
       
    public VistaNodo(int dimension, Color j1, Color j2){
    o = new int[1][1];     
    o[0][0]=0; 
    b = new JHexButton[dimension][dimension];
    setLayout( new  GridBagLayout());
    GridBagConstraints delimitador = new GridBagConstraints(); //Creamos un delimitador que usaremos para especificar la ubicación de los componentes dentro del panel
    delimitador.ipadx= 10;
    delimitador.ipady= 20;
    delimitador.gridx = 0;
    delimitador.gridy = 0;
    delimitador.weightx=1;
    delimitador.weighty=0.9;
    delimitador.fill=GridBagConstraints.BOTH;
    h = new JPanel();
    c=new JHexLayout(dimension, new Insets(-1,-1,-1,-1));
    Dimension n = new Dimension(130,(int)(130*0.5));
    c.setPrefferedSize(n);
    c.setMinimumSize(n);
    h.setLayout(c);
    setBackground(new Color(255, 255, 204));
    h.setBackground(new Color(255, 255, 204));
    for(int i = 0; i<dimension; i++)
    for(int j = 0; j<dimension;j++)
    { 
        b[i][j] = new JHexButton();
    h.add(b[i][j]);
    }
    add(h,delimitador);
    delimitador.gridy = 1;
    delimitador.weighty=0.1;
    delimitador.fill=GridBagConstraints.HORIZONTAL;
    th = new JLabel("Heuristico : ");
    add(th,delimitador);
   
    
    }
    
    public void setHeuristico(float h ) {  
      th.setText("Heuristico : " +h);
    }
    
    public void setTablero ( int[][]p) {
        o=p;
     for(int i = 0; i<p.length;i++  )
        for(int j = 0; j<p[i].length; j++){
            
            if(p[i][j] ==1 ){
              b[i][j].setBackground(Color.RED);  
                
            }else if (p[i][j] ==2 ){
              b[i][j].setBackground(Color.YELLOW);
            
             }else if (p[i][j] ==0 ){
                 b[i][j].setBackground(Color.white);             
                 
             }
            
                
        }
    }
    
}