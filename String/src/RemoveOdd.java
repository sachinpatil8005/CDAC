
public class RemoveOdd {
     public static void main(String[] args) {
		String s1="sachin";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);
	}
}
