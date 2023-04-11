package springexamples;

public class Address {
	
	int dno;
	String street;
	String city;
	public Address() {
		
	}
	public Address(int dno, String street, String city) {
		super();
		this.dno = dno;
		this.street = street;
		this.city = city;
	}
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
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
	@Override
	public String toString() {
		return "Address [dno=" + dno + ", street=" + street + ", city=" + city + "]";
	}
	
	public void ShowAddress() {
		System.out.println("Inside the address class");
	}
	public void intmethod() {
		System.out.println("Init phase of address bean is called..");
	}
	public void destroy()
	{
		System.out.println("destroy phase of address bean is called..");
	}

}
