package OOP;

public class Point {
	int x;
	int y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public Point(){
		x=0;
		y=0;
	}
	
	
		

	public void display() {
		
		System.out.print("["+x+","+y+"]");
		
	}

}
