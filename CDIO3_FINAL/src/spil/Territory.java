package spil;

public class Territory extends Ownable{
	
	int rent;
	
	public Territory(String name, int rent, int price) {
		this.rent = rent;
		this.name = name;
		this.price = price;
	}

}
