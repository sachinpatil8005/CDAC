package OOP;

public class Complex {
	int real;
	int img;
	
	public Complex(int r, int i){
		real = r;
		img = i;
	}

	public void display(){

		if(img < 0)
			System.out.print(real+"-"+img+"i");
		else
			System.out.print(real+"+"+img+"i");
	}

}
