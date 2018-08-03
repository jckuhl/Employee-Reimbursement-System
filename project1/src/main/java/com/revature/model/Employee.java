package com.revature.model;

public class Employee {

	private int uid;
	private String fname;
	private String lname;
	private String employeeId;
	private Position position;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String email;
	
	private boolean isManager;
	
	/**
	 * 
	 * @param uid
	 * @param fname
	 * @param lname
	 * @param employeeId
	 * @param position
	 * @param street
	 * @param city
	 * @param state
	 * @param zip
	 * @param phone
	 * @param email
	 * @param isManager
	 */
	public Employee(int uid, String fname, String lname, String employeeId, Position position, String street,
			String city, String state, String zip, String phone, String email, int isManager) {
		super();
		this.uid = uid;
		this.fname = fname;
		this.lname = lname;
		this.employeeId = employeeId;
		this.position = position;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
		this.isManager = isManager == 1;	//because Oracle is teh dumz and doesn't support Boolean
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getUid() {
		return uid;
	}

	public boolean isManager() {
		return isManager;
	}

	@Override
	public String toString() {
		return "Employee [uid=" + uid + ", fname=" + fname + ", lname=" + lname + ", employeeId=" + employeeId
				+ ", position=" + position.getPosition() + ", street=" + street + ", city=" + city + ", state=" + state + ", zip="
				+ zip + ", phone=" + phone + ", email=" + email + ", isManager=" + isManager + "]";
	}
	
	
	
}
