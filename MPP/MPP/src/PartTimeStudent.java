
public class PartTimeStudent extends underGradStudent {

	private int creditHour;
	

	public PartTimeStudent(String fname, String lname, double pg, int xCreditHour) {
		super(fname, lname, pg);		
		this.creditHour = xCreditHour;
	}


	@Override
	public String studentInfo() {
		
		return "part time under grad students ";
	}


	public int getCreditHour() {
		return creditHour;
	}


	public void setCreditHour(int creditHour) {
		this.creditHour = creditHour;
	}
}


