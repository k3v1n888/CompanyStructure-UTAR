public class Accountant extends BusinessEmployee {
	
	public TechnicalLead teamSupported;

	public Accountant(String name) {
		
		super(name);
		bonusBudget = 0;
	}

	public TechnicalLead getTeamSupported() {
		
		return teamSupported;
	}

	public void supportTeam(TechnicalLead lead) {
		
		this.teamSupported = lead;
		for (SoftwareEngineer element : lead.team) {
			this.bonusBudget += element.getBaseSalary() * 1.1;
		}
	}

	public boolean canApproveBonus(double bonus) {
		
		double requestedBonus = bonus;
		if (requestedBonus <= getBonusBudget()) {
			return true;
		} else {
			System.out.print(" Rejected because Budget not sufficient. ");
			return false;
		}

	}

	@Override
	public String employeeStatus() {
		
		return this.toString() + " with a budget of " + getBonusBudget() + " is supporting " + this.getTeamSupported();
	}

}
