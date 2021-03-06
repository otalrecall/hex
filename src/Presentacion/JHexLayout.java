package Presentacion;


import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.LayoutManager;

/**
 * A layoutmanager for interleaved hexagons. This layout is based on GridLayout. It
 * divides the parent component into equal parts and resizes the subcomponents to fit
 * these. Since every other row will hold one element less than than the one before
 * (or after), this LM only register how many columns the user wants, and then calculates
 * the number of rows needed to fit this need according to the number of gui elements
 * that needs to be allocated. 
 *
 * @author Sergio Moyano Diaz
 *
 */
public class JHexLayout implements LayoutManager {

    private Insets insets;
    private int rows;
    private int cols;
 
    private Dimension minSize;
    private Dimension prefSize;


    /**
     * Generates a HexagonalLayout with the number of columns given. The layout
     * divides the componenets into equal portions of the parent container. The
     * rows are arranged in big rows and small rows (every other). The layout
     * calculates how many rows it need to hold the number of items the parent has.
     * The number of columns represent the number of items in a long row.
     * @param cols Number of items in a big row
     */
    public JHexLayout(int cols) {
	checkColInput(cols);
	minSize = new Dimension(800, 600); //Standard size. Can be changed with setter.
	prefSize = new Dimension(800, 600); //Standard size. Can be changed with setter.
	insets = new Insets(0, 0, 0, 0);
	this.rows = 0;
	this.cols = cols;
	
    }



    /**
     * Generates a HexagonalLayout with the number of columns given. The layout
     * divides the componenets into equal portions of the parent container. The
     * rows are arranged in big rows and small rows (every other). The layout
     * calculates how many rows it need to hold the number of items the parent has.
     * The number of columns represent the number of items in a big row.
     *
     * This constructor also takes an Insets object that specify insets between
     * elements in the gui.
     *
     * @param cols Number of coulumns in a big row.
     * @param i Insets object that specifies the spacing between gui elements.
     */
    public JHexLayout(int cols, Insets i) {
	checkColInput(cols);
	insets = i;
	minSize = new Dimension(800, 600); //Standard size. Can be changed with setter.
	prefSize = new Dimension(800, 600); //Standard size. Can be changed with setter.
	this.rows = 0;
	this.cols = cols;
	
    }


    /**
     * Checks that the column input is valid: Columns must be set to n > 0;
     * @param cols
     */
    private void checkColInput(int cols) {
	if (cols <= 0) {
	    throw new IllegalArgumentException("Columns can't be set to n < 0");
	}
    }

    /**
     * Calculates the numbers of rows needed for the components given the
     * number of columns given.
     * @param componentCount
     * @return
     */
    private int calculateRows(int componentCount) {

	int numberOfRows = 0;
	int bgRow = cols;
	int smRow = bgRow - 1;

	int placedItems = 0;
	
	    while (true) {
		if (placedItems >= componentCount) {
		    break;
		}
		placedItems += bgRow;
		numberOfRows += 1;
		if (placedItems >= componentCount) {
		    break;
		}
		placedItems += smRow;
		numberOfRows += 1;
	    }

	return numberOfRows;
    }

    /*
     * (non-Javadoc)
     * @see java.awt.LayoutManager#layoutContainer(java.awt.Container)
     */
    @Override
    public void layoutContainer(Container parent) {

	// Get componentCount and check that it is not 0
	int componentCount = parent.getComponentCount();
	if (componentCount == 0) {
	    return;
	}

	// Calculating the number of rows needed
	rows = calculateRows(componentCount);

	// insets
	int leftOffset = insets.left;
	int rightOffset = insets.right;
	int topOffset = insets.top;
	int bottomOffset = insets.bottom;

	// spacing dimensions
        double ajx = 0.098;
        double ajy = 0.65;
        
        if(cols == 2){ajx = 0.269; ajy = 0.37;  }
        else if(cols == 3){ajx = 0.184; ajy = 0.5;  }
        else if (cols ==4 ){ajx = 0.144; ajy = 0.6;  }
        else if ( cols ==5 ){ajx = 0.12; ajy = 0.65;   }
        else if ( cols ==6 ){ajx = 0.098; ajy = 0.65;   }
        else if ( cols ==7 ){ajx = 0.088; ajy = 0.65;  }
        else if ( cols ==8 ){ajx = 0.078; ajy = 0.65;  }
        else if ( cols ==9 ){ajx = 0.068; ajy = 0.65;  }
        else if ( cols ==10 ){ajx = 0.068; ajy = 0.65;  }
        else if ( cols ==11 ){ajx = 0.068; ajy = 0.65;  }
        //ajx = 0.0029*cols*cols -0.0531*cols+0.3141;
	int boxWidth = (int) Math.floor((parent.getWidth()-20)/(cols+(float)(cols-1)/2));
        int boxHeight = (int) Math.floor((parent.getHeight() -20) /(cols-(float)((cols-1))/4));
	double heightRatio = 0.75;

	// component dimensions
	int cWidth = (boxWidth - (leftOffset + rightOffset));
	int cHeight = (boxHeight - (topOffset + bottomOffset));

        
	int x = 10;
	int y = 10;
        int row = 0;
        int col = 0;
	// Laying out each of the components in the container
	for (Component c : parent.getComponents()) {
	    if ((x > parent.getWidth() - boxWidth) || col>=cols) {
		row++;
                col =0;
		    x = ((int)Math.round(boxWidth / 2.0))*row+10;
		    y += Math.round(boxHeight*heightRatio);
		
	    }
	    c.setBounds(x + leftOffset, y + topOffset, cWidth, cHeight);
	    x += boxWidth;
            col++;
	}

    }

    /*
     * (non-Javadoc)
     * @see java.awt.LayoutManager#minimumLayoutSize(java.awt.Container)
     */
    @Override
    public Dimension minimumLayoutSize(Container parent) {
	return minSize;
    }

    /*
     * (non-Javadoc)
     * @see java.awt.LayoutManager#preferredLayoutSize(java.awt.Container)
     */
    @Override
    public Dimension preferredLayoutSize(Container parent) {
	return prefSize;
    }

    /*
     * (non-Javadoc)
     * @see java.awt.LayoutManager#removeLayoutComponent(java.awt.Component)
     */
    @Override
    public void removeLayoutComponent(Component comp) {
	// NOT IMPLEMENTED

    }
    /*
     * (non-Javadoc)
     * @see java.awt.LayoutManager#addLayoutComponent(java.lang.String, java.awt.Component)
     */
    @Override
    public void addLayoutComponent(String name, Component comp) {
	// NOT IMPLEMENTED

    }

    public Insets getInsets() {
        return insets;
    }

    public void setInsets(Insets insets) {
        this.insets = insets;
    }

    public int getColumns() {
        return cols;
    }

    public void setColumns(int cols) {
        this.cols = cols;
    }

 

    public Dimension getMinimumSize() {
        return minSize;
    }

    public void setMinimumSize(Dimension minSize) {
        this.minSize = minSize;
    }

    public Dimension getPreferredSize() {
        return prefSize;
    }

    public void setPrefferedSize(Dimension prefSize) {
        this.prefSize = prefSize;
    }

    public int getRows() {
        return rows;
    }

}