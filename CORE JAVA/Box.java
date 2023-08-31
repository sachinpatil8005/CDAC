package OOP;

public class Box {
	int height;
	int width;
	int depth;

	public Box(){
		height = 1;
	 	width = 1;
		depth = 1;
	}
	public Box(int h, int w, int d){
		height = h;
	 	width = w;
		depth = d;
	}
	public Box(int i){
		height = i;
	 	width = i;
		depth = i;
	}
	
	public int Vol(){
		//System.out.print("The volume is: " + height*width*depth);
		//System.out.println(" ");
		int vol = height*width*depth;
		return vol;
	}

}
