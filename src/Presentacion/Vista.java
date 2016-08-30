package Presentacion;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Sergio Moyano Diaz
 */
public abstract class Vista extends JPanel{
    
    protected GridBagLayout l;
    protected GridBagConstraints ld  ;
    
   public Vista(){
   l = new GridBagLayout();
   ld = new GridBagConstraints();    
   setLayout(l);
   }
   
   public GridBagConstraints configurarGrid(int gridx,int gridy){
        ld.gridx = gridx;
        ld.gridy = gridy; 
        return ld;
   }
   public GridBagConstraints configurarGrid(int gridx,int gridy, int ipadx, int ipady  ){
        ld.gridx = gridx;
        ld.gridy = gridy; 
        ld.ipadx = ipadx;
        ld.ipady = ipady;
        
        return ld;
   }
   public GridBagConstraints configurarGrid(int gridx,int gridy, int ipadx, int ipady, int anchor   ){
        ld.gridx = gridx;
        ld.gridy = gridy; 
        ld.ipadx = ipadx;
        ld.ipady = ipady;
        ld.anchor =anchor;
        return ld;
   }
   public GridBagConstraints configurarGrid(int gridx,int gridy, int ipadx, int ipady,int weigthx,int weigthy, int anchor   ){
        ld.gridx = gridx;
        ld.gridy = gridy;
        ld.ipadx = ipadx;
        ld.ipady = ipady;
        ld.anchor =anchor;
        ld.weightx = weigthx;
        ld.weighty = weigthy;
        return ld;
   }
   public void setfill(int fill ){
     ld.fill=fill ;  
   }    
   public void setgridweigth(int gridheigth,int gridwidth  ){
       ld.gridheight = gridheigth;  
       ld.gridwidth=   gridwidth;
    }
   public void setweigth(double weigthx,double weigthy){
   
      ld.weightx = weigthx;
      ld.weighty = weigthy;
   }
   public void setanchor(int anchor){
      ld.anchor=anchor;
       
       
   }
   public void setInsets(Insets o ){
   ld.insets = o;
    }
}
