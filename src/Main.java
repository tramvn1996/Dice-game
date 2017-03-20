import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Main extends JFrame
{

	private Color myBackgroundColor;
	private JPanel myIoPanel, myHeaderPanel, myPanel;
	private JLabel myInLabel, myOutLabel, myScore, compScore, instruct, max, space, space2;
	private Button roll, pass;
	private Font myTitleFont;
	private GridLayout myLayout;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		new Main();
	}

	String message = "Please enter your name: ";
	String p1Name = JOptionPane.showInputDialog(message);
	String instructions = "play the game";

	public Main()
	{
		super("Main");
		//instantiate variables
		myInLabel = new JLabel(p1Name);
		myOutLabel = new JLabel("computer");
		myScore = new JLabel("score");
		compScore = new JLabel("loser");
		myPanel = new JPanel();
		myBackgroundColor = new Color(50, 125, 100);
		roll = new Button("Roll");
		pass = new Button("Pass");
		instruct = new JLabel(instructions);
		max = new JLabel("Max");
		space = new JLabel();
		space2 = new JLabel();
		pass.setSize(50, 30);
		
		//add things to the panel
		myPanel.setLayout(new GridLayout(0, 3, 50, 50));
		myPanel.setBackground(myBackgroundColor);
		myPanel.add(myInLabel);
		myPanel.add(max);
		myPanel.add(myOutLabel);
		myPanel.add(myScore);
		myPanel.add(space);
		myPanel.add(compScore);
		myPanel.add(roll);
		myPanel.add(space2);
		myPanel.add(pass);
		myPanel.add(instruct);
		this.getContentPane().add(myPanel);
		this.pack();
		this.setVisible(true);
		this.setBackground(Color.GREEN);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}