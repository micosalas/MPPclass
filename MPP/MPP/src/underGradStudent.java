
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
	return null;
}
}
