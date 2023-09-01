package OOP;


public class Person {
	private String name;
	private Date d;
	
	// constructors
	public Person(){
		name = " ";
		d = new Date();
	}
	public Person(String name, int dd, int mm, int yy){
		this.name = name;
		this.d = new Date(dd,mm,yy);
	}

	// methods
	public void display(){
		System.out.println(name);
		d.showDate();
		System.out.println(" ");
	}

}
