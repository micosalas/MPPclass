
public class underGradStudent extends Student {
private double gpa;

public underGradStudent(){
	
}
public underGradStudent(String fname, String lname, double pg){
	super(fname, lname);
	this.gpa=pg;
}


public double getGpa(){
	return gpa;
}
public void setGpa(double Gpa){
	gpa=Gpa;
}
@Override
public String studentInfo() {
	// TODO Auto-generated method stub
	return "we are undergrad students";
}
@Override
public String getFirstName() {
	// TODO Auto-generated method stub
	return super.getFirstName();
}
@Override
public String getLastName() {
	// TODO Auto-generated method stub
	return super.getLastName();
}
@Override
public void setFirstName(String fName) {
	// TODO Auto-generated method stub
	super.setFirstName(fName);
}
@Override
public void setLastName(String lName) {
	// TODO Auto-generated method stub
	this.setFirstName(lName);
}
}
