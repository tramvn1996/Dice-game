import javax.swing.ImageIcon;

//add something so it pauses for a while for player to click to roll dice
public class GameEngine 
{
	static int myRoundScore = 0, compRoundScore = 0;
	static int myTotalScore = 0, compTotalScore = 0;
	static int myMaxScore;
	static Die2 die1 = new Die2();
	static Die2 die2 = new Die2();
	static String instructionText, myTotalScoreStr, myRoundScoreStr, compRoundScoreStr, compTotalScoreStr ;

	public GameEngine()
	{

	}

	public static void playerRoll()
	{
		// when player clicked Roll
		die1.roll(); // ask why static
		die2.roll();

		// set round score to zero
		myRoundScore = 0;
		compRoundScore = 0;
		
		// if both of the dice roll 1's, then total score is 0
		if (die1.getTop() == 1 && die2.getTop() == 1)
		{
			myRoundScore = 0;
			myTotalScore = 0;
			instructionText = "Please pass the die to the computer";
		}
		// if one of the dice roll 1's, then round score is 0
		else if (die1.getTop() == 1 || die2.getTop() == 1)
		{
			myRoundScore = 0;
			myTotalScore = myTotalScore;
			instructionText = "You roll a 1's, so you lost your point for this round";
		}
		// if none of them roll 1's, then add up score
		else if (!(die1.getTop() == 1) && !(die2.getTop() == 1))
		{
			myRoundScore = myRoundScore + die2.getTop();
			myTotalScore = myRoundScore + myRoundScore;
			instructionText = "Keep rolling or pass the dice to the computer";
		}
		
		myRoundScoreStr = String.valueOf(myRoundScore); //change it to String to return
		myTotalScoreStr = String.valueOf(myTotalScore);
	}
	
	//setters and getters for player1
	public String getRoundScore()
	{
		return myRoundScoreStr;
	}
	
	public void setRoundScore(String prs)
	{
		myRoundScoreStr = prs;
	}
	
	public String getTotalScore()
	{
		return myTotalScoreStr;
	}
	public void setTotalScore(String pts)
	{
		myTotalScoreStr = pts;
	}
	
	public String getInstruction()
	{
		return instructionText;
	}
	public void setInstruction(String ins)
	{
		instructionText = ins;
	}

	// Comp's turn to roll
	public static void compRoll()
	{
		die1.roll(); // ask why static
		die2.roll();

		// set comp's score to zero
		myRoundScore = 0;
		compRoundScore = 0;
		
		while (compRoundScore <= 20)
		{
			// if both of the dice roll 1's, then total score is 0
			if (die1.getTop() == 1 && die2.getTop() == 1)
			{
				compRoundScore = 0;
				compTotalScore = 0;
				instructionText = "Please pass the die to the computer";
			}
			// if one of the dice roll 1's, then round score is 0
			else if (die1.getTop() == 1 || die2.getTop() == 1)
			{
				compRoundScore = 0;
				compTotalScore = compTotalScore;
				instructionText = "It's the player's turn to roll";
			}
			// if none of them roll 1's, then add up score
			else if (!(die1.getTop() == 1) && !(die2.getTop() == 1))
			{
				compRoundScore = compRoundScore + die2.getTop();
				compTotalScore = compRoundScore + compRoundScore;	
			}		
		}	
		// if the comp's score is >=20, pass the dice to player
		if (compTotalScore >= 20)
		{
			// disable CompRoll button?
			instructionText = "it's the player's turn";
		}	
		compRoundScoreStr = String.valueOf(compRoundScore); //change it to String to return
		compTotalScoreStr = String.valueOf(compTotalScore);
	}
	public String getCRoundScore()
	{
		return compRoundScoreStr;
	}
	
	public void setCRoundScore(String crs)
	{
		compRoundScoreStr = crs;
	}
	
	public String getCTotalScore()
	{
		return compTotalScoreStr;
	}
	public void setCTotalScore(String cts)
	{
		compTotalScoreStr = cts;
	}
	
	public String getCInstruction()
	{
		return instructionText;
	}
	public void setCInstruction(String ins)
	{
		instructionText = ins;
	}
}
