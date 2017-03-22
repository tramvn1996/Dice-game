//Ask dr. plante if we should create a method to keep track of the dice score in what class

import java.util.Random;

import javax.swing.ImageIcon;

public class Die2
{
	// properties
	private ImageIcon myImage;
	private Random myRandom;
	private int myTop;
	

	// create an array that stores 6 sides of the die and 1 blank side
	static ImageIcon[] dieSide = new ImageIcon[5];
	{
		dieSide[0] = new ImageIcon("img/one.png");
		dieSide[1] = new ImageIcon("img/two.png");
		dieSide[2] = new ImageIcon("img/three.png");
		dieSide[3] = new ImageIcon("img/four.png");
		dieSide[4] = new ImageIcon("img/five.png");
		dieSide[5] = new ImageIcon("img/six.png");
	}

	public Die2()
	{
		myTop = -1;
		myRandom = new Random();
		
	}

	public void roll()
	{
		int side = Math.abs(myRandom.nextInt() % 6);
		myImage = dieSide[side];
		myTop = side + 1;
		
	}

	/*
	 * Setters and getters (or mutators and accessors)
	 */
	public ImageIcon getImage()
	{
		return myImage;
	}
	
	public void setImage(ImageIcon top)
	{
		myImage = top;
	}
	
	public int getTop()
	{
		return myTop;
	}
	public void setTop(int topValue)
	{
		myTop = topValue;
	}
	

	
}
