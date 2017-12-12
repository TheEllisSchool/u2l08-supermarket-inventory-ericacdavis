
public class produce extends Item{
	//attributes
	private String expiration;
	private double weight;
	
	//constructor
	public produce(double up, int q, String n, String exp,double w) {
		super(up,q,n);
		
	//do all the things this constructor needs to do
	setExpiration(exp);
	setWeight(w);
	}
	public void setExpiration(String exp) {
		expiration = exp;
	}
	public void setWeight(double w) {
		if (w>= 0) {
			weight = w;
		}
		else {
			System.out.println("That is not a possible weight");
		}
	}
	public String getExpiration() {
		return expiration;
	}
	public double getWeight() {
		return weight;
	}
}
