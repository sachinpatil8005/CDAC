package OOP;

public class LineDemo {
public static void main(String []args){
		
		Point p1 = new Point(5,6);
		Point p2 = new Point(40,50);
		
		Line l1 = new Line(p1, p2);
		
		l1.display();
	}

}
