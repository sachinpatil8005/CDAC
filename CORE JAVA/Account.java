package OOP;

public class Account {
	private int id;
	private double bal;
	static float rate;
	
	static{
		rate = 4.5f;
	}
	public static void updateRate(float f){
		rate = f;
	}
	
	public Account(){
		id = 0;
		bal = 0;
	}
	public Account(int id, double bal){
		this.id = id;
		this.bal = bal;
	}
	
	public void display(){
		System.out.println("Account balance of "+ id +" is "+ bal*rate);
	}

}
