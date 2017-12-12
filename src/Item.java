
public class Item {
//attributes
	private double unitPrice;
	private int quantity;
	private String name;
	
	//methods
	//constructor
	public Item (double up, int q, String n) {
		//change this to setters //setUnitPrice(up);
		setUnitPrice(up);
		setQuantity(q);
		name= n;
		
	}
	//setters
	public void setUnitPrice(double up) {
		if (up>=0) {
			unitPrice = up;
		}
		else {
			System.out.println("That price is not possible");
		}
	}
	public void setQuantity(int q) {
		if (q >= 0) {
			quantity= q;
		}
		else {
			System.out.println("You cannot have a negative quanity");
		}
	}
	
	//getters
	public double getUnitPrice() {
		return unitPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getName() {
		return name;
	}
	
	public String toString (){
		return name + "\nUnit Price: " + unitPrice + "\nQuantity: " + quantity;
	}
}
