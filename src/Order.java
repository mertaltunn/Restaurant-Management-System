
public class Order {
	
	private Customer customer;
	private Meal meal;
	
	public Order(Customer customer, Meal meal) {
		super();
		this.customer = customer;
		this.meal = meal;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Meal getMeal() {
		return meal;
	}
	public void setMeal(Meal meal) {
		this.meal = meal;
	}
	
	
}
