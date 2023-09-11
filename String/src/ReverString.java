
public class ReverString {
	  public static void main(String[] args)
	  {
	     String string="sachin";
	     char[] ch=string.toCharArray();
	     int left=0,right=string.length()-1;
	     while(left<right)
	     {
	    	 char temp=ch[left];
	    	 ch[left]=ch[right];
	    	 ch[right]=temp;
	    	 left++;
	    	 right--;
	     }
	     
	     String st=new String(ch);
	     System.out.println(st);
	      
	     printReverse();
	  }
	  public static void printReverse()
	  {
		  String st="patil";
		  for(int i=st.length()-1;i>=0;i--)
		  {
			  System.out.print(st.charAt(i));
		  }
	  }
}
