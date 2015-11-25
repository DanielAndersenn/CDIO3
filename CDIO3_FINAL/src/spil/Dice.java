package spil;

public class Dice {

	public Dice() {
		
	}
	
	public int rollDice() {
		int dice1 = (int)(6.0 * Math.random()) + 1;
		int dice2 = (int)(6.0 * Math.random()) + 1;
		
		int DiceResult = dice1 + dice2;

		return DiceResult;
	}

}
