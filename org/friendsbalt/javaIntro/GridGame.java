package org.friendsbalt.javaIntro;

/**
* The {@code GridGame} defines the physical structure of a
* 2-D game plade on an n x m grid. The game presumes each
* grid square is made up of so many 
*/

public abstract class GridGame {
	
	/**
	* Represents the number of frames drawn by the
	* game each second.
	*/
	public final int FPS;
	
	/**
	* Represents the number of <i>grid squares</i> 
	* laid out horizontally (in the x-direction)
	*/
	public final int X_DIM;
	
	/**
	* Represents the number of <i>grid squares</i> 
	* laid out vertically (in the y-direction)
	*/
	public final int Y_DIM;
	
	/**
	* Holds the pixel dimension of each grid square.
	* Note that each grid square is <i> square </i>
	* so that only one resolution value is accepted.
	*/
	public final int RESOLUTION;
	private Grid grid;
	
	//Do not allow a no arguments constructor.
	private GridGame(){}
	
	public GridGame(int fps, int xdim, int ydim, int res, Grid grid) {
		FPS = fps;
		X_DIM = xdim;
		Y_Dim = ydim;
		RESOLUTION = res;
		this.grid = grid;
	}
	
	/**
	* Advances the game to the next frame. This method
	* should be called a number of times each second
	* equal to {@code FPS}.
	*/
	public abstract void next();
	
	
	
}