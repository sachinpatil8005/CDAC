package OOP;

public class Math {
	int a, b, c;
	float f1, f2;
	double d;
	
	
	public void add(int a, int b){
		this.a = a;
		this.b = b;
		System.out.println(a+b);
	}
	public void add(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a+b+c);
	}
	public void add(float f1, float f2){
		this.f1 = f1;
		this.f2 = f2;
		System.out.println(f1+f2);
	}
	public void add(int a, float f1, double d){
		this.a = a;
		this.f1 = f1;
		this.d = d;
		double ans  = a+f1+d;
		System.out.println(ans);
	}

}
