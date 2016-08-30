/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import java.awt.*;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;



/**
 *
 * @author Sergio Moyano Diaz
 */
public class VistaVerAlgoritmo  extends Vista{
  
   private DefaultTreeModel modelo; 
   private JTree tree;
   private VistaNodo n; 
   private int dimension;
   private JScrollPane scroll;
   
   public  VistaVerAlgoritmo( ){
            
       
     
   }  
   
   public void setVerAlgoritmo(int dimension){
       
       this.removeAll();
       this.dimension = dimension;

       int p[][] = new int[dimension][dimension];
      
       for(int i = 0; i<dimension ;i++ )
       for(int j =0 ;j<dimension ;j++){
                p[i][j]= 0;            
        }

       
        Node nodo =new Node ("Raíz",0,p);
        modelo = new DefaultTreeModel(nodo);
        tree = new JTree(modelo);
        scroll = new JScrollPane(tree);
        setweigth(0.75,1);
        setfill(GridBagConstraints.BOTH);
        add(scroll,configurarGrid(0,0));
        JPanel scrol = new JPanel();
       
        n = new VistaNodo(dimension,Color.RED,Color.YELLOW);
        setweigth(0.25,1);
        add(n,configurarGrid(0,1));       
        tree.addTreeSelectionListener(new GestorJTree());
   }
  private class Node extends DefaultMutableTreeNode {
    private float heuristo;
    private int Tablero[][];
    public Node(String f,float heuristo,int Tablero[][]) {
        super(f);
        this.heuristo = heuristo;
        this.Tablero =Tablero;
        
    }

    public float getheuristico() {
        return heuristo;
    }
    public int[][] getTablero() {
        return Tablero;
    }
  } 
    
    public void setArbol(float[] o ){
        
       float[] e  = o;
       MagicInt i = new MagicInt();
       Node nodo  =  this.setArbol2(o,i,0,1);
       modelo = new DefaultTreeModel(nodo);
        tree = new JTree(modelo);
        tree.addTreeSelectionListener(new GestorJTree());
        scroll.setViewportView(tree);
    } 
   
    
    private Node setArbol2 (float[] o, MagicInt i,int profundidad, int numeroh ){
        
        int ta[][] = leerTablero(o,i.getint());
        i.setint(i.getint()+ dimension*dimension); 
        float h2 =  o[i.getint()];
        i.inc();
        
        Node nodo = new Node("Jugada"+profundidad+"-"+numeroh,h2,ta);
        
        int nh = (int)o[i.getint()];
        i.inc();
        for(int u = 1; u<=nh; u++){
           Node nodoh =  setArbol2(o,i,profundidad+1,u);
         //if(profundidad == 0)  modelo = new DefaultTreeModel(nodo);
           modelo.insertNodeInto(nodoh, nodo, u-1);
          
        }
           
        return nodo;
    }
    
    private int[][] leerTablero (float[] o, Integer u){
        
        int t [][] = new int[dimension][dimension];
        
          for(int i=0; i<dimension; i++ ){
              for(int j=0; j<dimension; j++ )
              {
              t[j][i]=(int)o[u];
              u++;
              }
          }
        return t;
    
  }
  
 class GestorJTree implements  javax.swing.event.TreeSelectionListener {
     
        public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
            jTree1ValueChanged(evt);
        }
    };
  public void jTree1ValueChanged( TreeSelectionEvent tse ) {
   
       String node2 = tse.getNewLeadSelectionPath().getLastPathComponent().toString();
   // if( node2.equals("Jugada1-1") ) {
    Node node = (Node) tse.getPath().getLastPathComponent();
        n.setHeuristico(node.getheuristico());
        n.setTablero(node.getTablero());
  //  } else if( node2.equals("video") ) {
       // play video
   // }
      
      
  }
 
  
  private class MagicInt {
    private int i ;
    
    MagicInt(){
        
        i=0;
    }
    public void setint( int i){
        
        this.i=i;
    }
    
    public int getint(){
    return i; 
        
    }
    public void inc(){
        i++;
    }
 
}
   
} 
   
   
   
   
   
   
   
