import java.util.Scanner;

public class divideIntoPart {
        public static void main(String[] args) {
        	Scanner sc=new Scanner(System.in);
			String string="aaaabbbbcccc";
			int le=string.length();
			System.out.println("you can dividen this string into equal part by choice this number-");
			for(int i=1;i<=le;i++)
			{
				if(le%i==0)
				{
					System.out.print(i+" ");
				}
			}
			int n=sc.nextInt();
			int nn=le%3;
			if(nn!=0)
			{
				System.out.println("can not convert into equals part");
				
			}
			else 
			{
				for(int i=0;i<string.length();i=i+n)
				{
					String st=string.substring(i,i+n);
					System.out.println("\n"+st);
				}
				

			}
		}
}
