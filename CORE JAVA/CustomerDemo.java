package OOP;

public class CustomerDemo {
public static void main(String []args){
		
		Address a1 = new Address();
		Address a2 = new Address("Gavbhag", "Ichalkaranji", "416115");
		
		Customer c1 = new Customer("pranav@gmail.com", a2);
		Customer c2 = new Customer();
		
		//a1.display();
		//a2.display();
		c1.display();
		c2.display();

	}
	

}
