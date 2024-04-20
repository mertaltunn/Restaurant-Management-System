import java.util.List;
import java.util.Queue;

public final class Restaurant {

	private static Restaurant INSTANCE;

	private int capacity;

	private Manager manager;

	private List<Cook> cookList;

	private List<Order> orderList;

	private Queue<Customer> table;

	private Menu menu;

	private double profit;

	private Restaurant() {
	}

	public static Restaurant getInstance() {

		// create object if it's not already created
		if (INSTANCE == null) {
			INSTANCE = new Restaurant();
		}

		// returns the singleton object
		return INSTANCE;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	public List<Cook> getCookList() {
		return cookList;
	}

	public void setCookList(List<Cook> cookList) {
		this.cookList = cookList;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	public Queue<Customer> getTable() {
		return table;
	}

	public void setTable(Queue<Customer> table) {
		this.table = table;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	public double getProfit() {
		return profit;
	}

	public void setProfit(double profit) {
		this.profit = profit;
	}

}
