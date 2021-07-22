public class TechnicalEmployee extends Employee {
	public int checkins;

	public TechnicalEmployee(String name) {
		// Has a default base salary of 75000
		super(name, 75000.00);
		checkins = 0;
	}

	@Override
	public String employeeStatus() {
		
		return super.toString() + " has " + checkins + " successful check ins";
	}

	public void setCheckin() {
		checkins++;
	}

}
