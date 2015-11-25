package spil;

public class Account extends Game {

	private int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void addToBalance(int amount) {
		if(amount < 0) {
			System.out.println("THIS SHALL BE CHANGED LATER"); //TODO CHANGE THIS
		} else {
			balance = balance + amount;
		}
		
	}	
	
	public int subtractFromBalance(int amount) {
		int toReturn = 0;
		if(amount < 0) {
			System.out.println("You cannot subtract a negative amount or zero.");
		} else if (balance < amount) {
			System.out.println("You've run out of money! You're out of the game.");
			toReturn = 2;
		} else {
		balance = balance - amount;
		toReturn = 1;
		}
		return toReturn;
	}

}
