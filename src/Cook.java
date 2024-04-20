
public class Cook extends Employee implements EmployeeInterface {

    private boolean isAvailable;

    public Cook() {
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

	@Override
	public double calculateSalary(double mealPrice) {
		return mealPrice * 0.1;
	}

	@Override
	public double calculateSalary(double mealPrice, Membership membership) {
		return mealPrice * (0.1 + membership.getDiscountRate());
	}
}
