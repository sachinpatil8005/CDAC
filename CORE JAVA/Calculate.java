package OOP;

public class Calculate {
	int n1;
	int n2;
	
	public Calculate (int i, int j){
		n1 = i;
		n2 = j;
	}
	
	void add(){
		System.out.println("The addition is " + (n1+n2));
	}	
	void sub(){
		System.out.println("The subtraction is " + (n1 - n2));
	}
	void multi(){
		System.out.println("The multiplication is " + (n1*n2));
	}
	void div(){
		System.out.println("The division is " + (n1/n2));
	}

}
