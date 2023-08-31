package OOP;
import java.util.Scanner;

public class BoxDemo {
public static void main(String []args){
		
		Box []arr = new Box[3];
		
		
		
		for(int i=0; i<3; i++){
			int a=0, b=0, c=0;

			System.out.println("Enter the 3 Values");
			Scanner input = new Scanner(System.in);
				
			a = input.nextInt();
			b = input.nextInt();
			c = input.nextInt();
				
			arr[i] = new Box(a,b,c);
		}

		int maxVol =0;
		for(int i=0; i<3; i++){
			int temp = arr[i].Vol();
			if(temp > maxVol)
				maxVol = temp;
		}
		System.out.println("Max vol: "+ maxVol);
	}

}
