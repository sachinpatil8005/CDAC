package OOP;

public class DateDemo {
public static void main(String []args){
		
		Date obj1 = new Date(1,1,2000);

		Date obj2 = new Date(31,12,1999);
		
		obj1.showDate('-');
		obj2.showDate();
		
		Date d1 = new Date(12,12,2000);
		boolean flag = d1.isLeap();
		System.out.println(flag);
	}



}
