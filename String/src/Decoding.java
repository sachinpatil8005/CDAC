
public class Decoding {
   public static void main(String[] args) {
	String st="dslcoeet";  //doselect;
	int n=st.length()/2;
	String st1="";
	//String st2="";
	for(int i=0;i<n;i++)
	{
		st1=st1+st.charAt(i);
		st1=st1+st.charAt(i+n);
		
	}
	
	System.out.print(st1);

}
}
