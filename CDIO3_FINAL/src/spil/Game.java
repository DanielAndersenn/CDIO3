package spil;

import java.util.Scanner;

public class Game {

	
	//Fields
	int iPlayer_Amount;
	static Scanner scanner = new Scanner(System.in);
	static Gameboard board;
	static Dice dice;
	static int DR;
	TurnController TC;
	
	//States: "antal spillere" , "spiller navne" , "play" , "vinder"
	public enum State {Player_Amount , Player_Names , Play_State , Winner_State};
	private State state = State.Player_Amount;
	
	
	
	
	public Game() {
		
		dice = new Dice();
		
		// TODO Hvad fanden skal der stå her ???
		
	}	
	
	//State controller
	public void run(){
		while(true){
			switch(state){
			case Player_Amount: playerAmount();
			break;
			case Player_Names: playerNames();
			break;
			case Play_State: playState();
			break;
			case Winner_State: winnerState();
			
			}
		}
		
	}

	private void playerAmount() {
		boolean bPlayerAmount = true;
		
		
		System.out.println("Welcome to Monopoly! \n You can play this as 2-6 players \n Type in the wanted amount of players:");
		
		while(bPlayerAmount){
			try {
				String sPlayer_Amount = scanner.nextLine();
				iPlayer_Amount = Integer.parseInt(sPlayer_Amount);
				
				if(iPlayer_Amount >= 2 && iPlayer_Amount <= 6){
					bPlayerAmount = false;
				}else{
					System.out.println("Amount of players must be between 2 and 6");
				}
				
			} catch (NumberFormatException a) {
				System.out.println("Invalid Input, try again.");
			}
			
		}
		board = new Gameboard();
		
		state = State.Player_Names;
	}
	
	private void playerNames() {
		System.out.println("Now type in the wanted names for your players:");
		
			int i = 1;
			while(i <= iPlayer_Amount){
				String sPlayerInput = scanner.nextLine();
				Player player = new Player(sPlayerInput, i);
				board.addPlayer(player);
				System.out.println(player.getUserName() + " added!");
				i++;
			}
			board.setActivePlayer(board.getSpecificPlayer(0));
			System.out.println("All users added. Game has started. " + board.getActivePlayer().getUserName() + " goes first! \nPress Enter to roll");
			TC = new TurnController(iPlayer_Amount);
			state = State.Play_State;
		
	}
	
	private void playState() {
		Field curField;
		
		String scanEnter = scanner.nextLine();
		if(scanEnter.equals("")) {
			DR = 3; //dice.rollDice();
			System.out.println("You rolled "+ DR);
			board.movePlayer(DR, board.getActivePlayer());
			curField = board.getField(board.getActivePlayer().getBoardPos());
			curField.landOnField(board.getActivePlayer());
		}
		
		
		
		//Dette skifter tur!
		board.setActivePlayer(board.getSpecificPlayer(TC.nextTurn()));;		
	}
	
	private void winnerState() {
		// TODO Auto-generated method stub
		
	}
		


}
