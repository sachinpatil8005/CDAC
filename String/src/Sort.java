import java.util.Scanner;

public class Sort {
	 
	public static void sort(String s)
	{
	char[] ch=s.toCharArray();
	 int n=ch.length;
	 char temp;
	 for(int i=0;i<n-1;i++)
	 {
		 for(int j=0;j<n-1-i;j++)
		 {
			 if(ch[j]>ch[j+1])
			 {
				  temp=ch[j];
				 ch[j]=ch[j+1];
				 ch[j+1]=temp;
			 }
		 }
	 }
	 String string=new String(ch);
	 System.out.println(string);
		
	}
	
     public static void main(String[] args) {
		System.out.println("enter the string to sort");
		Scanner scanner=new Scanner(System.in);
		String s=scanner.nextLine();
		System.out.println(s);
		sort(s);
	}
}
