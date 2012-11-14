package tusday1st;

import java.util.List;

public class Person {
private String firstName;
private String lastName;
private String Address;
private String City;
private int zipcode;
private int phoneNumber;
private String Email;
private List<Vehicle>vic;
//private Vehicle vic;

public Person(String fName, String lName, String Address, String city, int zipcode, int phone, String Email, List<Vehicle> vic){
	this.firstName=fName;
	this.lastName=lName;
	this.Address=Address;
	this.City=city;
	this.zipcode=zipcode;
	this.Email=Email;
	this.vic=vic;
}
public Person(){
	
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public List<Vehicle> getVicls() {
	return vic;
}
/*public void Print(){
	County coun=new County();
	coun.print();
}*/
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public List<Vehicle> getVic() {
	return vic;
}
public void setVic(List<Vehicle> vic) {
	this.vic = vic;
}

/*public void setVicls(List<Vehicle> vicls) {
	this.vicls = vicls;
}*/
}
