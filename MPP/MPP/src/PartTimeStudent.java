
public class PartTimeStudent extends underGradStudent {

	private int creditHour;
	

	public PartTimeStudent(String fname, String lname, double pg, int xCreditHour) {
		super(fname, lname, pg);
		// TODO Auto-generated constructor stub
		this.creditHour = xCreditHour;
	}


	@Override
	public String studentInfo() {
		// TODO Auto-generated method stub
		return super.studentInfo();
	}
}


