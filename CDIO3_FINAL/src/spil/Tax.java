package spil;

public class Tax extends Field{
	
	int taxAmount;
	int taxRate = 1;
	
	public Tax(String name, int taxAmount) {
		this.taxAmount = taxAmount;
	}
	
}
