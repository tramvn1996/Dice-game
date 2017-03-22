//add something so it pauses for a while for player to click to roll dice
public class GameEngine 
{
	static int myRoundScore = 0, compRoundScore = 0;
	static int myTotalScore = 0, compTotalScore = 0;
	static int myMaxScore;
	static Die2 die1 = new Die2();
	static Die2 die2 = new Die2();
	static String instructionText, myTotalScoreStr, myRoundScoreStr;

	public GameEngine()
	{

	}

	public static String playerRoll( String instructionText, String myRoundScoreStr, String myTotalScoreStr)
	{
		// when player clicked Roll
		die1.roll(); // ask why static
		die2.roll();

		// set round score to zero
		myRoundScore = 0;
		
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
			myRoundScoreStr = String.valueOf(myRoundScore); //change it to String to return
			myTotalScore = myRoundScore + myRoundScore;
			instructionText = "Keep rolling or pass the dice to the computer";
		}
		//return instructionText = "You lost your turn to the computer";
		return playerRoll(instructionText, myRoundScoreStr, myTotalScoreStr);
	}

	// Comp's turn to roll
	public static String CompRoll()
	{
		die1.roll(); // ask why static
		die2.roll();

		// set comp's score to zero
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
		return null;
	}

}
