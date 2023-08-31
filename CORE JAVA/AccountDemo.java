package OOP;

public class AccountDemo {
public static void main(String []args){
		
		Account a1 = new Account(123, 120000);
		a1.display();
		Account.updateRate(2);
		a1.display();
	}

}
