
public class Membership {

	private String type;

	private double discountRate;

	public Membership(String typeMembership) {
		switch (typeMembership) {
			case "ELITE": {
				this.type = "ELITE";
				this.discountRate = 0.2;
				break;
			}
			case "PLATINUM": {
				this.type = "PLATINUM";
				this.discountRate = 0.15;
				break;
			}
			case "GOLD": {
				this.type = "GOLD";
				this.discountRate = 0.1;
				break;
			}
			case "SILVER": {
				this.type = "SILVER";
				this.discountRate = 0.05;
				break;
			}
		}
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
}
