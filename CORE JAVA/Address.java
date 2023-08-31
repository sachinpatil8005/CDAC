package OOP;

public class Address {
	 String area;
	 String city;
	 String pin;
	
	
	public Address(){
		area = "empty";
		city = "empty";
		pin = "empty";
	}
	public Address(String area, String city, String pin){
		this.area = area;
		this.city = city;
		this.pin = pin;
	}
	
	
	public void display(){
		System.out.println("ADDRESS");
		System.out.println("Area: "+area);
		System.out.println("City: "+city);
		System.out.println("pin: "+pin);
		System.out.println(" ");
	}

}
