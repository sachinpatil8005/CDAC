package OOP;

public class Line {
	Point start;
	Point end;

	public Line(){
		start = new Point();
		end = new Point();
	}
	public Line(Point start, Point end){
		this.start = new Point(start.x, start.y);
		this.end = new Point(end.x, end.y);
	}
	public void display(){
		if((end.x >= start.x) && (end.y >= start.x)){
			System.out.println("start: "+ (end.x - start.x));
			System.out.println("end: "+ (end.y - start.y));
		}else
			System.out.println("Only enter End point greater that of Start point");
	}

}
