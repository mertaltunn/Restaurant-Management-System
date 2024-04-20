public class Manager extends Employee implements EmployeeInterface {

	@Override
	public double calculateSalary(double mealPrice) {
		return mealPrice * 0.2;
	}

	@Override
	public double calculateSalary(double mealPrice, Membership membership) {
		return mealPrice * (0.2 + membership.getDiscountRate());
	}
	
	
}
