package OOP;

public class Book {
	int bookid;
	float price;
	static int count;
	
	static{
		count = 0;
	}
	
	public Book(){
		count++;
		bookid = count;
		price = 0;
	}
	public Book(float price){
		this.price = price;
		count++;
		bookid = count;
		
	}
	
	public void display(){
		System.out.println("The price of book: "+ bookid +" is "+ price);
	}

}
