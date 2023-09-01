package OOP;

public class Customer {
	String emailID;
	Address ad;
	
	// constructor
	public Customer(){
		emailID = "empty";
		ad = new Address();
	}
	public Customer(String emailID, Address ad){
		this.emailID = emailID;
		this.ad = new Address(ad.area, ad.city, ad.pin);
	}
	
	// methods
	public void display(){
		System.out.println("DETAILS WITH ADDRESS");
		System.out.println("Email : " + emailID);
		this.ad.display();
		System.out.println(" ");
	}

}
