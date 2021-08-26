/*
* Created for the Intro to Java course at the Friends School of Baltimore
*
* (c) 2021
*/
package org.friendsbalt.javaIntro;

import java.awt.Color;
import java.util.ArrayList;


/**
* This {@code Grid} class is intended to provide the basic underlying structure
* for the graphical and logistical components common to all early, grid-based
* arcade games.
* <p>
* The grid is designed to <i> contain </i> only the graphical components
* represented by a 2-D {@code Color} array of pixels which can be drawn using the
* relevant client (in the current course, this is intended to be done
* using the Processing IDE, but this is not strictly necessary). On the
* other hand, since some games demand that two objects be permitted to occupy
* the same square and some forbid this, the {@code Grid} object contains an
* array of {@code GridSquare} objects (which have their own useful properties) that
* can then be referenced by any implementation of the code. 
* @author Joel Hammer
* @version 1.0
*/
public abstract class Grid {
	
	/**
	* The width in squares of the grid.
	***********************************/
	public final int X_DIM;
	
	/**
	* The height in squares of the grid.
	************************************/
	public final int Y_DIM;
	
	/**
	* The number of pixels across each grid square.
	* Note that this is the same in both the horizontal
	* and vertical direction as each grid square is... square.
	***********************************************************/
	public final int RESOLUTION;
	
	/**
	* The number of pixels in the vertical dimmension of the grid.
	**************************************************************/
	public final int PIXEL_HEIGHT;
	
	/**
	* The number of pixels in the horizontal dimension of the grid.
	***************************************************************/
	public final int PIXEL_WIDTH;
	
	private Color[][] background;
	private Color[][] overlay;
	
	
	//Do not allow a no args construction.
	private Grid(){}
	
	/**
	* Creates a {@code Grid} of the specified dimmensions and resolution.
	* @param xdim the number of grid squares horizontally.
	* @param ydim the number of grid squares vertically.
	* @param res the number of pixels in one dimmension of each grid square.
	* the height and width measured in pixels of each grid square is the same.
	********************************************************************************/
	public Grid (int xdim, int ydim, int res) {
		
		this.entries = entries;
		
		X_DIM = xdim;
		Y_DIM = ydim;
		RESOLUTION = res;
		
		background = new Color[X_DIM * RESOLUTION][Y_DIM * RESOLUTION];
		overlay = new Color[X_DIM * RESOLUTION][Y_DIM * RESOLUTION];
	}
	
	/**
	* Returns the color of the requested background pixel measured by its absolute location
	* (without reference to the main grid). The pixel (0,0) is located in the
	* top left corner and increases downwards and to the right in the x and
	* y directions respectively.
	* 
	* The background vs. overlay allows persistence of an underlying structure or game map
	* while characters and other temporary fixtures are drawn on top. In some cases these
	* transient fixtures are deleted or moved in quick succession. The background allows
	* this to occur without concern for overwriting other components.
	*
	* In cases where readily movable components overlap each other, neither should be stored
	* in the background. The graphics for these should be written/overwritten occording to their display
	* priority into the overlay. Persistence of movable, overlapping objects should be handled by
	* storing their graphical design in another class and written frame-by-frame into the overlay.
	*
	* @param x The absolute x coordinate of the desired background pixel.
	* @param y The absolute y coordinate of the desired background pixel.
	* @return The color of the background pixel located at (x,y).
	*****************************************************************************/
	public Color getBackground(int x, int y) {
		if( x > this.PIXEL_WIDTH - 1 || y > this.PIXEL_HEIGHT - 1)
			throw new IllegalArgumentException("The given pixel dimmensions out of bounds. \n The grid is"
				+ this.PIXEL_WIDTH + " x " + this.PIXEL_HEIGHT + "\n requested pixel was ("
				+ x + "," + y + ").");
		
		return background[x][y];
	}
	
	/**
	* Writes a pixel image to the overlay. Anything contained in the overlay already will
	* be overwritten as necessary. Items should be written to the overlay in <i>reverse</i>
	* order of display priority. The image will be aligned so that the given x- and y-coordinates
	* of the graph will contain the top left corner of the pixel image to be written.
	*
	* @param x the x-coordinate of the pixel image.
	* @param y the y-coordinate of the pixel image.
	* @param image the array of {@code Color} objects to be written to the display following
	* the convention image[x][y] to contain the relevant x- and y-coordinates.
	*/
	public void writeToOverlay(int x, int y, Color[][] image) {
		
		//TO DO: fill this in
	}
	
}