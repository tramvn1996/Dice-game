import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Die
{
	public final static int NOT_ROLLED = -1;
	public final static int SIDE1 = 1;
	public final static int SIDE2 = 2;
	public final static int SIDE3 = 3;
	public final static int SIDE4 = 4;
	public final static int SIDE5 = 5;
	public final static int SIDE6 = 6;
	
	private int myTop;
	private Random myRandom;

	public static void main(String[] args) 
	{
		ImageIcon side1, side2, side3, side4, side5, side6;
		{
			side1 = new ImageIcon("img/one.png");
			side2 = new ImageIcon("img/two.png");
			side3 = new ImageIcon("img/three.png");
			side4 = new ImageIcon("img/four.png");
			side5 = new ImageIcon("img/five.png");
			side6 = new ImageIcon("img/six.png");
		}
	}

	public Die()
	{
		myTop = NOT_ROLLED;
		myRandom = new Random();
	}

	public int roll()
	{
		myTop = Math.abs(myRandom.nextInt() % 7);
		return myTop;
	}

	/*
	 * Setters and getters (or mutators and accessors)
	 */
	public int getTop()
	{
		return myTop;
	}

	public void setTop(int top)
	{
		myTop = top;
	}
	
}
