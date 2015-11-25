package spil;

public class Ownable extends Field{
	int price;
	Player owner;
	
	public Ownable() {

	}
	
	public int getRent() {
		
		return 2;
	}
	
	public void setOwner(Player player) {
		this.owner = player;
	}
	
	public Player getOwner() {
		return owner;
	}

}
