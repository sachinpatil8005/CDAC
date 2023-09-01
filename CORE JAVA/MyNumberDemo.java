package OOP;

public class MyNumberDemo {
public static void main(String []args){
		
		MyNumber n1 = new MyNumber();
		MyNumber n2 = new MyNumber(9);
		
		if(n2.isNegative())
			System.out.println("Negative");
		else
			System.out.println("Not Negative");

		if(n2.isPositive())
			System.out.println("Positive");
		else
			System.out.println("Not Positive");
		
		n1.isZero();
		n1.isOdd();
		n1.isEven();
		System.out.println(" ");
		n2.isNegative();
		n2.isPositive();
		n2.isZero();
		n2.isOdd();
		n2.isEven();
		
		
	}
	

}
