import java.util.Random;

public class Customer extends Person {

    private int eatingDuration;
    private Membership membership;
    private int arrivalTurnToRestaurant;
    
    public Customer() {
    	this.eatingDuration = new Random().nextInt(3) + 1;
    	String [] memberShipArray = {"ELITE", "PLATINUM", "GOLD", "SILVER"};
    	int randomMembership = new Random().nextInt(memberShipArray.length);
    	this.membership = new Membership(memberShipArray[randomMembership]);
    }
    
    public Customer(int eatingDuration) {
    	this.eatingDuration = eatingDuration;
    	String [] memberShipArray = {"ELITE", "PLATINUM", "GOLD", "SILVER"};
    	int randomMembership = new Random().nextInt(memberShipArray.length);
    	this.membership = new Membership(memberShipArray[randomMembership]);
    }

    public int getEatingDuration() {
        return eatingDuration;
    }

    public void setEatingDuration(int eatingDuration) {
        this.eatingDuration = eatingDuration;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

	public int getArrivalTurnToRestaurant() {
		return arrivalTurnToRestaurant;
	}

	public void setArrivalTurnToRestaurant(int arrivalTurnToRestaurant) {
		this.arrivalTurnToRestaurant = arrivalTurnToRestaurant;
	}
    
}
