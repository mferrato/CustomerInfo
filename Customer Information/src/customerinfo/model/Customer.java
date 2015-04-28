package customerinfo.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer {
	private StringProperty firstName;
	private StringProperty middleInitial;
	private StringProperty lastName;
	private StringProperty postalCode;
	private StringProperty address;
	private StringProperty city;
	private StringProperty state;
	private StringProperty gender;

	public Customer() {
		this(null, null, null, null, null, null, null, null);
	}

	public Customer(String lastName, String firstName, String middleInitial,
			String address, String postalCode, String city,
			String gender, String state) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		this.middleInitial = new SimpleStringProperty(middleInitial);
		this.city = new SimpleStringProperty(city);
		this.address = new SimpleStringProperty(address);
		this.postalCode = new SimpleStringProperty(postalCode);
		this.state = new SimpleStringProperty(state);
		this.gender = new SimpleStringProperty(gender);
	}

	public StringProperty getFirstName() {
		return firstName;
	}

	public void setFirstName(StringProperty firstName) {
		this.firstName = firstName;
	}

	public StringProperty getMiddleInitial() {
		return middleInitial;
	}

	public void setMiddleInitial(StringProperty middleInitial) {
		this.middleInitial = middleInitial;
	}

	public StringProperty getLastName() {
		return lastName;
	}

	public void setLastName(StringProperty lastName) {
		this.lastName = lastName;
	}

	public StringProperty getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(StringProperty postalCode) {
		this.postalCode = postalCode;
	}

	public StringProperty getAddress() {
		return address;
	}

	public void setAddress(StringProperty address) {
		this.address = address;
	}

	public StringProperty getCity() {
		return city;
	}

	public void setCity(StringProperty city) {
		this.city = city;
	}

	public StringProperty getState() {
		return state;
	}

	public void setState(StringProperty state) {
		this.state = state;
	}

	public StringProperty getGender() {
		return gender;
	}

	public void setGender(StringProperty gender) {
		this.gender = gender;
	}

}
