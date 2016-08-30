package Presentacion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

/**
 * Simple hexagonal button class.
 *
 * @author Sergio Moyano Diaz
 *
 */
public class JHexButton extends JButton {

    /**
     * autoGenerated serial-version.
     */
    private static final long serialVersionUID = -7142502695252118612L;
    Polygon hexagonalShape;
    Polygon borderhexagonalShape;
    private double scale;
    private String borde;
    private Color j1;
    private Color j2;
    public JHexButton() {
	this.setOpaque(false);
	hexagonalShape = getHexPolygon();
        borderhexagonalShape= getborderHexPolygon();
        scale=0.9;
        borde="-";
        j1 =  Color.getHSBColor(0,1,130);
        j2 =  Color.getHSBColor(60,100,100);
        
    }
    public JHexButton(double scaleborder) {
	this.setOpaque(false);
	hexagonalShape = getHexPolygon();
        borderhexagonalShape= getborderHexPolygon();
        scale=scaleborder;
        borde="-";
        j1 =  Color.getHSBColor(0,1,130);
        j2 =  Color.getHSBColor(60,100,100);
    }
    public JHexButton(String borde) {
	this.setOpaque(false);
	hexagonalShape = getHexPolygon();
        borderhexagonalShape= getborderHexPolygon();
        scale=0.9;
        this.borde=borde;
        
         j1 =   new Color(185,45,45);
        j2 =  new Color(185,185,45);
    }
    /**
     * Generates the buttons Hexagonal shape
     *
     * @return Polygon with the buttons hexagonal shape.
     */
    private Polygon getHexPolygon() {
        
	Polygon hex = new Polygon();
	int w = getWidth() - 1;
	int h = getHeight() - 1;
	int ratio = (int) (h * .25);

	hex.addPoint(w / 2, 0);
	hex.addPoint(w, ratio);
	hex.addPoint(w, h - ratio);
	hex.addPoint(w / 2, h);
	hex.addPoint(0, h - ratio);
	hex.addPoint(0, ratio);
        
        
	return hex;
    }
    private Polygon getborderHexPolygon() {
	int w = getWidth() - 1;
	int h = getHeight() - 1;
	int ratio = (int) (h * .25);

        Polygon hexborder = new Polygon();
        
        hexborder.addPoint(0,(int)Math.round(-h*scale/2));     
	hexborder.addPoint((int)Math.round(w*scale/2),(int)Math.round((-h/2 +ratio)*scale));
	hexborder.addPoint((int)Math.round(w*scale/2),  (int)Math.round(ratio*scale));
        
	hexborder.addPoint(0,(int) Math.round((h/2)*scale));  
        hexborder.addPoint((int)Math.round(-w*scale/2),(int)  Math.round(ratio*scale));
	hexborder.addPoint((int)(Math.round(-w*scale/2)),(int) (Math.round((ratio-h/2)*scale)));
        hexborder.translate(Math.round(w/2),Math.round(h/2)); 
        return hexborder;
    }
    
    
    /*
     * (non-Javadoc)
     * @see java.awt.Component#contains(java.awt.Point)
     */
    @Override
    public boolean contains(Point p) {
	return borderhexagonalShape.contains(p);
    }

    /*
     * (non-Javadoc)
     * @see javax.swing.JComponent#contains(int, int)
     */
    @Override
    public boolean contains(int x, int y) {
	return borderhexagonalShape.contains(x, y);
    }

    /*
     * (non-Javadoc)
     * @see java.awt.Component#setSize(java.awt.Dimension)
     */
    @Override
    public void setSize(Dimension d) {
	super.setSize(d);
	hexagonalShape = getHexPolygon();
        borderhexagonalShape = getborderHexPolygon();
    }

    /*
     * (non-Javadoc)
     * @see java.awt.Component#setSize(int, int)
     */
    @Override
    public void setSize(int w, int h) {
	super.setSize(w, h);
	hexagonalShape = getHexPolygon();
        borderhexagonalShape = getborderHexPolygon();
    }

    /*
     * (non-Javadoc)
     * @see java.awt.Component#setBounds(int, int, int, int)
     */
    @Override
    public void setBounds(int x, int y, int width, int height) {
	super.setBounds(x, y, width, height);
	hexagonalShape = getHexPolygon();
        borderhexagonalShape = getborderHexPolygon();
    }

    /*
     * (non-Javadoc)
     * @see java.awt.Component#setBounds(java.awt.Rectangle)
     */
    @Override
    public void setBounds(Rectangle r) {
	super.setBounds(r);
	hexagonalShape = getHexPolygon();
        borderhexagonalShape = getborderHexPolygon();
        
    }

    /*
     * (non-Javadoc)
     * @see javax.swing.JComponent#processMouseEvent(java.awt.event.MouseEvent)
     */
    @Override
    protected void processMouseEvent(MouseEvent e) {
	if (contains(e.getPoint()))
	    super.processMouseEvent(e);
    }

    /*
     * (non-Javadoc)
     * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
     */
    @Override
    protected void paintComponent(Graphics g) {
	       
        g.setColor(new Color(0.0f, 0.0f, 0.0f, 0.0f));
	g.fillRect(0, 0, getWidth(), getHeight());
        g.setColor(new Color(0.0f, 0.0f, 0.0f));
	g.drawPolygon(hexagonalShape);
	g.fillPolygon(hexagonalShape);
       pintaborde(g); 
       
        g.setColor(getBackground());
        g.drawPolygon(borderhexagonalShape);
	g.fillPolygon(borderhexagonalShape);
        
   
      
    }
    private void pintaborde(Graphics g){
        
         if(borde == "N"){
        Polygon po = new Polygon( );
        po.addPoint(this.borderhexagonalShape.xpoints[0], this.borderhexagonalShape.ypoints[0]);
        po.addPoint(this.borderhexagonalShape.xpoints[1], this.borderhexagonalShape.ypoints[1]);
        po.addPoint(this.hexagonalShape.xpoints[1], this.hexagonalShape.ypoints[1]);
        po.addPoint(this.hexagonalShape.xpoints[0], this.hexagonalShape.ypoints[0]);
         
         
        g.setColor( j1);
        g.drawPolygon(po);
	g.fillPolygon(po);  
            Polygon po2 = new Polygon( );
        po2.addPoint(this.borderhexagonalShape.xpoints[5], this.borderhexagonalShape.ypoints[5]);
        po2.addPoint(this.borderhexagonalShape.xpoints[0], this.borderhexagonalShape.ypoints[0]);
        po2.addPoint(this.hexagonalShape.xpoints[0], this.hexagonalShape.ypoints[0]);
        po2.addPoint(this.hexagonalShape.xpoints[5], this.hexagonalShape.ypoints[5]);
        g.setColor(j1);
        g.drawPolygon(po2);
	g.fillPolygon(po2);
        }else if(borde == "S"){
            
                Polygon po = new Polygon( );
        po.addPoint(this.borderhexagonalShape.xpoints[2], this.borderhexagonalShape.ypoints[2]);
        po.addPoint(this.borderhexagonalShape.xpoints[3], this.borderhexagonalShape.ypoints[3]);
        po.addPoint(this.hexagonalShape.xpoints[3], this.hexagonalShape.ypoints[3]);
        po.addPoint(this.hexagonalShape.xpoints[2], this.hexagonalShape.ypoints[2]);
        g.setColor(j1);
        g.drawPolygon(po);
	g.fillPolygon(po);
            Polygon po2 = new Polygon( );
        po2.addPoint(this.borderhexagonalShape.xpoints[3], this.borderhexagonalShape.ypoints[3]);
        po2.addPoint(this.borderhexagonalShape.xpoints[4], this.borderhexagonalShape.ypoints[4]);
        po2.addPoint(this.hexagonalShape.xpoints[4], this.hexagonalShape.ypoints[4]);
        po2.addPoint(this.hexagonalShape.xpoints[3], this.hexagonalShape.ypoints[3]);
        g.setColor(j1);
        g.drawPolygon(po2);
	g.fillPolygon(po2);
        }else if(borde == "E"){
            
                Polygon po = new Polygon( );
        po.addPoint(this.borderhexagonalShape.xpoints[0], this.borderhexagonalShape.ypoints[0]);
        po.addPoint(this.borderhexagonalShape.xpoints[1], this.borderhexagonalShape.ypoints[1]);
        po.addPoint(this.hexagonalShape.xpoints[1], this.hexagonalShape.ypoints[1]);
        po.addPoint(this.hexagonalShape.xpoints[0], this.hexagonalShape.ypoints[0]);
        g.setColor(j2);
        g.drawPolygon(po);
	g.fillPolygon(po);
            Polygon po2 = new Polygon( );
        po2.addPoint(this.borderhexagonalShape.xpoints[1], this.borderhexagonalShape.ypoints[1]);
        po2.addPoint(this.borderhexagonalShape.xpoints[2], this.borderhexagonalShape.ypoints[2]);
        po2.addPoint(this.hexagonalShape.xpoints[2], this.hexagonalShape.ypoints[2]);
        po2.addPoint(this.hexagonalShape.xpoints[1], this.hexagonalShape.ypoints[1]);
        g.setColor(j2);
        g.drawPolygon(po2);
	g.fillPolygon(po2);
        }else if(borde == "W"){
                Polygon po = new Polygon( );
        po.addPoint(this.borderhexagonalShape.xpoints[4], this.borderhexagonalShape.ypoints[4]);
        po.addPoint(this.borderhexagonalShape.xpoints[5], this.borderhexagonalShape.ypoints[5]);
        po.addPoint(this.hexagonalShape.xpoints[5], this.hexagonalShape.ypoints[5]);
        po.addPoint(this.hexagonalShape.xpoints[4], this.hexagonalShape.ypoints[4]);
        g.setColor(j2);
        g.drawPolygon(po);
	g.fillPolygon(po);
            Polygon po2 = new Polygon( );
        po2.addPoint(this.borderhexagonalShape.xpoints[3], this.borderhexagonalShape.ypoints[3]);
        po2.addPoint(this.borderhexagonalShape.xpoints[4], this.borderhexagonalShape.ypoints[4]);
        po2.addPoint(this.hexagonalShape.xpoints[4], this.hexagonalShape.ypoints[4]);
        po2.addPoint(this.hexagonalShape.xpoints[3], this.hexagonalShape.ypoints[3]);
        g.setColor(j2);
        g.drawPolygon(po2);
	g.fillPolygon(po2);
            
        }else if(borde == "NW"){
            
                Polygon po = new Polygon( );
        po.addPoint(this.borderhexagonalShape.xpoints[3], this.borderhexagonalShape.ypoints[3]);
        po.addPoint(this.borderhexagonalShape.xpoints[4], this.borderhexagonalShape.ypoints[4]);
        po.addPoint(this.hexagonalShape.xpoints[4], this.hexagonalShape.ypoints[4]);
        po.addPoint(this.hexagonalShape.xpoints[3], this.hexagonalShape.ypoints[3]);
        g.setColor(j2);
        g.drawPolygon(po);
	g.fillPolygon(po);
            Polygon po2 = new Polygon( );
        po2.addPoint(this.borderhexagonalShape.xpoints[4], this.borderhexagonalShape.ypoints[4]);
        po2.addPoint(this.borderhexagonalShape.xpoints[5], this.borderhexagonalShape.ypoints[5]);
        po2.addPoint(this.hexagonalShape.xpoints[5], this.hexagonalShape.ypoints[5]);
        po2.addPoint(this.hexagonalShape.xpoints[4], this.hexagonalShape.ypoints[4]);
        g.setColor(j2);
        g.drawPolygon(po2);
	g.fillPolygon(po2);
            Polygon po3 = new Polygon( );
        po3.addPoint(this.borderhexagonalShape.xpoints[5], this.borderhexagonalShape.ypoints[5]);
        po3.addPoint(this.borderhexagonalShape.xpoints[0], this.borderhexagonalShape.ypoints[0]);
        po3.addPoint(this.hexagonalShape.xpoints[0], this.hexagonalShape.ypoints[0]);
        po3.addPoint(this.hexagonalShape.xpoints[5], this.hexagonalShape.ypoints[5]);
        g.setColor(j1);
        g.drawPolygon(po3);
	g.fillPolygon(po3);
            Polygon po4 = new Polygon( );
        po4.addPoint(this.borderhexagonalShape.xpoints[0], this.borderhexagonalShape.ypoints[0]);
        po4.addPoint(this.borderhexagonalShape.xpoints[1], this.borderhexagonalShape.ypoints[1]);
        po4.addPoint(this.hexagonalShape.xpoints[1], this.hexagonalShape.ypoints[1]);
        po4.addPoint(this.hexagonalShape.xpoints[0], this.hexagonalShape.ypoints[0]);
        g.setColor(j1);
        g.drawPolygon(po4);
	g.fillPolygon(po4);
        }else if(borde == "NE"){
            
         Polygon po = new Polygon( );
        po.addPoint(this.borderhexagonalShape.xpoints[5], this.borderhexagonalShape.ypoints[5]);
        po.addPoint(this.borderhexagonalShape.xpoints[0], this.borderhexagonalShape.ypoints[0]);
        po.addPoint(this.hexagonalShape.xpoints[0], this.hexagonalShape.ypoints[0]);
        po.addPoint(this.hexagonalShape.xpoints[5], this.hexagonalShape.ypoints[5]);
        g.setColor(j1);
        g.drawPolygon(po);
	g.fillPolygon(po);
        Polygon po2 = new Polygon( );
        po2.addPoint(this.borderhexagonalShape.xpoints[0], this.borderhexagonalShape.ypoints[0]);
        po2.addPoint(this.borderhexagonalShape.xpoints[1], this.borderhexagonalShape.ypoints[1]);
        po2.addPoint(this.hexagonalShape.xpoints[1], this.hexagonalShape.ypoints[1]);
        po2.addPoint(this.hexagonalShape.xpoints[0], this.hexagonalShape.ypoints[0]);
        g.setColor( j1);
        g.drawPolygon(po2);
	g.fillPolygon(po2);
        Polygon po3 = new Polygon( );
        po3.addPoint(this.borderhexagonalShape.xpoints[1], this.borderhexagonalShape.ypoints[1]);
        po3.addPoint(this.borderhexagonalShape.xpoints[2], this.borderhexagonalShape.ypoints[2]);
        po3.addPoint(this.hexagonalShape.xpoints[2], this.hexagonalShape.ypoints[2]);
        po3.addPoint(this.hexagonalShape.xpoints[1], this.hexagonalShape.ypoints[1]);
        g.setColor( j2);
        g.drawPolygon(po3);
	g.fillPolygon(po3);
        

        }else if(borde == "SE"){

        Polygon po2 = new Polygon( );
        po2.addPoint(this.borderhexagonalShape.xpoints[0], this.borderhexagonalShape.ypoints[0]);
        po2.addPoint(this.borderhexagonalShape.xpoints[1], this.borderhexagonalShape.ypoints[1]);
        po2.addPoint(this.hexagonalShape.xpoints[1], this.hexagonalShape.ypoints[1]);
        po2.addPoint(this.hexagonalShape.xpoints[0], this.hexagonalShape.ypoints[0]);
        g.setColor( j2);
        g.drawPolygon(po2);
	g.fillPolygon(po2);
        Polygon po3 = new Polygon( );
        po3.addPoint(this.borderhexagonalShape.xpoints[1], this.borderhexagonalShape.ypoints[1]);
        po3.addPoint(this.borderhexagonalShape.xpoints[2], this.borderhexagonalShape.ypoints[2]);
        po3.addPoint(this.hexagonalShape.xpoints[2], this.hexagonalShape.ypoints[2]);
        po3.addPoint(this.hexagonalShape.xpoints[1], this.hexagonalShape.ypoints[1]);
        g.setColor( j2);
        g.drawPolygon(po3);
	g.fillPolygon(po3);
        Polygon po4 = new Polygon( );
        po4.addPoint(this.borderhexagonalShape.xpoints[3], this.borderhexagonalShape.ypoints[3]);
        po4.addPoint(this.borderhexagonalShape.xpoints[4], this.borderhexagonalShape.ypoints[4]);
        po4.addPoint(this.hexagonalShape.xpoints[4], this.hexagonalShape.ypoints[4]);
        po4.addPoint(this.hexagonalShape.xpoints[3], this.hexagonalShape.ypoints[3]);
        g.setColor( j1);
        g.drawPolygon(po4);
	g.fillPolygon(po4);
          Polygon po5 = new Polygon( );
        po5.addPoint(this.borderhexagonalShape.xpoints[2], this.borderhexagonalShape.ypoints[2]);
        po5.addPoint(this.borderhexagonalShape.xpoints[3], this.borderhexagonalShape.ypoints[3]);
        po5.addPoint(this.hexagonalShape.xpoints[3], this.hexagonalShape.ypoints[3]);
        po5.addPoint(this.hexagonalShape.xpoints[2], this.hexagonalShape.ypoints[2]);
        g.setColor( j1);
        g.drawPolygon(po5);
	g.fillPolygon(po5);    
        }else if(borde == "SW"){
            
        Polygon po = new Polygon();
        po.addPoint(this.borderhexagonalShape.xpoints[3], this.borderhexagonalShape.ypoints[3]);
        po.addPoint(this.borderhexagonalShape.xpoints[4], this.borderhexagonalShape.ypoints[4]);
        po.addPoint(this.hexagonalShape.xpoints[4], this.hexagonalShape.ypoints[4]);
        po.addPoint(this.hexagonalShape.xpoints[3], this.hexagonalShape.ypoints[3]);
        g.setColor(j2);
        g.drawPolygon(po);
	g.fillPolygon(po);
        Polygon po2 = new Polygon();
        po2.addPoint(this.borderhexagonalShape.xpoints[4], this.borderhexagonalShape.ypoints[4]);
        po2.addPoint(this.borderhexagonalShape.xpoints[5], this.borderhexagonalShape.ypoints[5]);
        po2.addPoint(this.hexagonalShape.xpoints[5], this.hexagonalShape.ypoints[5]);
        po2.addPoint(this.hexagonalShape.xpoints[4], this.hexagonalShape.ypoints[4]);
        g.setColor( j2);
        g.drawPolygon(po2);
	g.fillPolygon(po2);
        Polygon po3 = new Polygon();
        po3.addPoint(this.borderhexagonalShape.xpoints[2], this.borderhexagonalShape.ypoints[2]);
        po3.addPoint(this.borderhexagonalShape.xpoints[3], this.borderhexagonalShape.ypoints[3]);
        po3.addPoint(this.hexagonalShape.xpoints[3], this.hexagonalShape.ypoints[3]);
        po3.addPoint(this.hexagonalShape.xpoints[2], this.hexagonalShape.ypoints[2]);
        g.setColor( j1);
        g.drawPolygon(po3);
	g.fillPolygon(po3);
       
        }
        
    }
    /*
     * (non-Javadoc)
     * @see javax.swing.AbstractButton#paintBorder(java.awt.Graphics)
     */
    @Override
    protected void paintBorder(Graphics g) {
	// Does not print border
        
        
    }

}