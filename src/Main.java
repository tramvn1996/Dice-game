
/*Tram and Sam
 * Pig Game- main class
 */
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main extends JFrame implements ActionListener
{

	private JPanel myIoPanel, myHeaderPanel, myPanel;
	private JLabel myName, myComputer, myTScore, myRscore, compScore, max, space;
	private Button roll, pass;
	private Font myTitleFont;
	private GridLayout myLayout;
	private JTextField pTScore, pRScore, cTScore, cRScore, instruct;
	static String instructionText = null, myRoundScoreStr = null, myTotalScoreStr = null;

	public static void main(String[] args)
	{

		new Main();
	}

	public Main()
	{

		/*
		 * Set Player name and max score
		 */
		String message = "Please enter your name: ";

		String p1Name = JOptionPane.showInputDialog(message);

		// trying to catch the wrong value
		boolean invalidNum = true;
		int maxVal = -1;
		while (invalidNum)
		{
			try
			{
				String message2 = "Enter the max score for the game: ";
				String strMax = JOptionPane.showInputDialog(message2);
				maxVal = Integer.parseInt(strMax);
				if (50 <= maxVal && maxVal <= 200)
				{
					invalidNum = false;
					JOptionPane.showMessageDialog(null, p1Name + " goes first!");
				} else if (maxVal < 50 || 200 < maxVal)
				{
					throw new IllegalArgumentException("Please enter a number between 50 & 200!");
					// invalidNum=true;
					// JOptionPane.showMessageDialog(null, "Please enter a
					// number between 50 & 200!",null,
					// JOptionPane.ERROR_MESSAGE, null);
				}
			} catch (java.lang.NumberFormatException ex)
			{
				JOptionPane.showMessageDialog(null, "Please enter a number between 50 & 200!", null,
						JOptionPane.ERROR_MESSAGE, null);
			}

			finally
			{
				invalidNum = false;
			}
			/*
			 * Layout and buttons
			 */
			myName = new JLabel(p1Name, SwingConstants.CENTER);
			myComputer = new JLabel("Computer", SwingConstants.CENTER);
			myTScore = new JLabel(p1Name + "'s Score= ", SwingConstants.CENTER);
			myRscore = new JLabel("Round Score= ", SwingConstants.CENTER);
			compScore = new JLabel("Computer's Score= ", SwingConstants.CENTER);
			myPanel = new JPanel();
			roll = new Button("Roll");
			pass = new Button("Pass");
			instruct = new JTextField("Instructions:");
			max = new JLabel("Max Score= " + maxVal, SwingConstants.CENTER);
			space = new JLabel();
			myPanel.setLayout(new GridLayout(0, 3));
			myPanel.add(myName);
			myPanel.add(max);
			myPanel.add(myComputer);
			setLayout(new GridLayout(0, 3, 25, 25));
			myPanel.add(myTScore);
			setLayout(new GridLayout(0, 3));
			myPanel.add(myRscore);
			myPanel.add(compScore);
			setLayout(new GridLayout(2, 3));
			myPanel.add(roll);
			myPanel.add(space);
			myPanel.add(pass);
			setLayout(new GridLayout(2, 3));
			myPanel.add(instruct);
			this.getContentPane().add(myPanel);
			this.pack();

			this.setVisible(true);
			myPanel.setBackground(Color.WHITE);
			this.setSize(500, 500);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		}
	}

	// implement action to link from Game Engine class
	public void actionPerformed(ActionEvent e)
	{
		// when click roll Button
		if (e.getSource() == roll)
		{
			String pTS, pRS;
			GameEngine playerRoll = new GameEngine();
			GameEngine.playerRoll();
			pRS = playerRoll.getRoundScore();
			pRScore.setText(pRS);
			pTS = playerRoll.getTotalScore();
			pTScore.setText(pTS);
		}

		// when click Pass
		if (e.getSource() == pass)
		{
			String cTS, cRS;
			GameEngine playerRoll = new GameEngine();
			GameEngine.playerRoll();
			cRS = playerRoll.getRoundScore();
			cRScore.setText(cRS);
			cTS = playerRoll.getTotalScore();
			cTScore.setText(cTS);
		}
	}

}
