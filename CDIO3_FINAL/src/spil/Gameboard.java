package spil;

import java.util.ArrayList;
import java.util.List;

public class Gameboard {

	Field[] board;
	List<Player> players;
	Player activePlayer;
	
	public Gameboard() {
		players = new ArrayList<Player>();
		board = new Field[22];
		
		board[1] = new Territory("Tribe Encampment", 100, 1000);
		board[2] = new Territory("Crater", 300, 1500);
		board[3] = new Territory("Mountain", 500, 2000);
		board[4] = new Territory("Cold Desert", 700, 3000);
		board[5] = new Territory("Black cave", 1000, 4000);
		board[6] = new Territory("The Werewall", 1300, 4300);
		board[7] = new Territory("Mountain village", 1600, 4750);
		board[8] = new Territory("South Citadel", 2000, 5000);
		board[9] = new Territory("Palace gates", 2600, 5500);
		board[10] = new Territory("Tower", 3200, 6000);
		board[11] = new Territory("Castle", 4000, 8000);
		board[12] = new Refuge("Walled city", 5000);
		board[13] = new Refuge("Monastery", 500);
		board[14] = new LaborCamp("Huts in the mountain", 100, 2500);
		board[15] = new LaborCamp("The pit", 100, 2500);
		board[16] = new Tax("Goldmine", 2000);
		board[17] = new Tax("Caravan", 4000);
		board[18] = new Fleet("Second Sail", 4000);
		board[19] = new Fleet("Sea Grover", 4000);
		board[20] = new Fleet("The Buccaneers", 4000);
		board[21] = new Fleet("Privateer armade", 4000);
		
	}
	
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	public Player getSpecificPlayer(int k) {
		return players.get(k);
	}
	public Field getField(int boardPos) {
		return board[boardPos];
	}
	
	public Player getOwner(Ownable ownable) {
		return ownable.getOwner();
	}
	
	public void setActivePlayer(Player player) {
		activePlayer = player;
	}
	
	public Player getActivePlayer() {
		return activePlayer;
	}
	
	public void movePlayer(int roll, Player player) {
		if(player.getBoardPos() == -1) {
			player.setBoardPos(roll);
		} else if(player.getBoardPos() + roll == 21){
			player.setBoardPos(21);
			} else {
				player.setBoardPos((player.getBoardPos() + roll)%21);
					}

}
}








