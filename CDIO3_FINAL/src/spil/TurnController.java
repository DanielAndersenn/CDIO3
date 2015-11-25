package spil;

import java.util.Arrays;

public class TurnController {

	static int i = 1;
	boolean[] BannedPlayers;
	int iPA;
	
	
	
	public TurnController(int iPlayerAmount) {
		BannedPlayers = new boolean[iPlayerAmount+1];
		Arrays.fill(BannedPlayers, Boolean.FALSE);
		this.iPA = iPlayerAmount;
	}
	
	
	public int nextTurn() {
		
		if(i == iPA){
			i = 1;
		}else {
			i++;	
		}
		
		while(BannedPlayers[i]==true){
		
			if(i == iPA){
				i = 1;
			}else {
				i++;	
			}
		}
		
	return i-1;
		
	}
	
	
	public void setBannedPlayer(int k){
		BannedPlayers[k] = true;
	}

}
