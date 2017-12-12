
public class Flowers extends Item{
	//attributes
		private String color;
		private String variety;
		
		//constructor
		public Flowers(double up, int q, String n, String c, String v) {
			super(up,q,n);
			
		//do all the things this constructor needs to do
		setColor(c);
		setVariety(v);
		
		}
		public void setColor(String c) {
			color = c;
		}
		public void setVariety(String v) {
			variety = v;
		}
		public String getColor() {
			return color;
		}
		public String getVariety() {
			return variety;
		}
	}


