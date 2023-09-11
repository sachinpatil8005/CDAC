
public class CountWord {
 public static void main(String[] args) {
	String string="i am sachin patil";
	 String []word=string.split("\s");
	 System.out.println("total word lenght "+word.length);
	 
	 for(int i=0;i<word.length;i++)
	 {    int no=word[i].length();
	 
		 System.out.println("This "+word[i]+" word have total number of count is "+no);
		 
	 }
	  
			
}
}
