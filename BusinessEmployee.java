public class BusinessEmployee extends Employee {

	public BusinessEmployee(String name) {
		
		super(name, 50000.00);
	}

	public double getBonusBudget() {
		
		return bonusBudget;
	}

	public void setBonusBudget(double bonusBudget) {
		this.bonusBudget = bonusBudget;
	}

	@Override
	public String employeeStatus() {
		
		String s = String.format("%.2f", bonusBudget);
		return this.toString() + " with a budget of " + s;
	}
}
