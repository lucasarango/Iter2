import java.util.*;

/*
******************************************************************************
PlayerTurn is a relationship object that connects the Player class with the rest of the code
******************************************************************************
*/

public class PlayerTurn
{
	Player[] players;
	int currentPlayer;
	int numPlayers;
	boolean tokenUsed;
	int actionPoints;

	//initialization requires names of players, assumes acceptable size
	public PlayerTurn(int p, String[] n)
	{
		if(p > 4)
		{
			p = 4;
		}

		players = new Player[p];
		numPlayers = p;
		currentPlayer = 0;
		
		for(int i = 0; i < p, i++)
		{
			players[i] = new Player(n[i]);
		}
		tokenUsed = false;
		actionPoints = 6;
	}

	//change player turn
	public void changeTurn()
	{
		currentPlayer++;
		if(currentPlayer >= numPlayers)
		{
			currentPlayer = 0;
		}
		tokenUsed = false;
		actionPoints = 6;
	}

	public Player getCurrentPlayer()
	{
		return players[currentPlayer].getPlayer();
	}

	public boolean checkActionToken()
	{
		if(players[currentPlayer].getActionTokens() > 0 && !tokenUsed)
		{
			return true;
		{
		else
		{
			return false;
		}
	}

	public void useActionToken()
	{
		players[currentPlayer].useActionToken();
		tokenUsed = true;
		actionPoints++;
	}

	public boolean checkTwoBlock()
	{
		if(players[currentPlayer].twoBlocksLeft() > 0 && actionPoints > 0)
		{
			return true;
		{
		else
		{
			return false;
		}
	}

	public void placeTwoBlock()
	{
		players[currentPlayer].placeTwoBlock();
		actionPoints--;
	}
	
	public boolean checkVillage()
	{
		if(players[currentPlayer].villageBlocksLeft() > 0 && actionPoints > 0)
		{
			return true;
		{
		else
		{
			return false;
		}
	}

	public void placeVillage()
	{
		players[currentPlayer].placeVillageBlock();
		actionPoints--;
	}

	public boolean checkRice()
	{
		if(players[currentPlayer].riceBlocksLeft() > 0 && actionPoints > 0)
		{
			return true;
		{
		else
		{
			return false;
		}
	}

	public void placeVillage()
	{
		players[currentPlayer].placeRiceBlock();
		actionPoints--;
	}
}
