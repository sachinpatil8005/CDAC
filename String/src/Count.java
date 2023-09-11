
public class Count {
     public static void main(String[] args) {
		String s="hii i am sachin";
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);
	}
}
