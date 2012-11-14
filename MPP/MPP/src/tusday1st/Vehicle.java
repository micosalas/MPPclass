package tusday1st;

public class Vehicle {
private String vinNumber;
private String model;
private int year;
private double estimatValue;

public Vehicle(String vinNumber, String model, int year, double estVal){
	this.vinNumber=vinNumber;
	this.model=model;
	this.year=year;
	this.estimatValue=estVal;
}

public Vehicle(){
	
}

public String getVinNumber() {
	return vinNumber;
}
public void setVinNumber(String vinNumber) {
	this.vinNumber = vinNumber;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public double getEstimatValue() {
	return estimatValue;
}
public void setEstimatValue(double estimatValue) {
	this.estimatValue = estimatValue;
}
public double computeTax(){
	double tax=0;
	
	tax=estimatValue*3%+120;
	
	return tax;
}
}
