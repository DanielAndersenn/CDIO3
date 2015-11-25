package spil;

public class Player extends Game {

	private String name;
	private int boardPos;
	public Account account;
	static int number;
	
	
	public Player(String InName, int playerNum) {
		number = playerNum;
		name = InName;
		account = new Account(30000);
		this.boardPos = -1;
		
	}
	
	public void AddMoney(int amount){
		account.addToBalance(amount);
	}
	
	public int SubtractMoney(int amount){
		int toReturn;
		toReturn = account.subtractFromBalance(amount);
		return toReturn;
	}
	
	public int currentMoney() {
		return  account.getBalance();
	}
	
	public String getUserName(){
		return this.name;
	}
	
	public int getBoardPos() {
		return boardPos;
	}
	
	public void setBoardPos(int boardPos) {
		this.boardPos = boardPos;
	}
	
	public int getPlayerNumber(){
		return number;
	}
	
}
