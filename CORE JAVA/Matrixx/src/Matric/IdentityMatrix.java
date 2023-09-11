package Matric;

public class IdentityMatrix {
   public static void main(String[] args) {
	  int a[][]=new int[][] {{1,0,0},{0,1,0},{0,0,1}};
	  
	  int row=a.length;
	  int col=a[0].length;
	  
	  boolean flag=true;
	  if(row!=col)
		  System.out.println("matrix should square");
	  else {
		  for(int i=0;i<row;i++)
		  {
			  for(int j=0;j<col;j++)
			  {
				  if(i==j && a[i][j]!=1)
				  {
					  flag=false;
					  break;
				  }
				  if(i!=j && a[i][j]!=0)
				  {
					  flag=false;
					  break;
				  }
			  }
		  }
	}
	  if(flag)
		  System.out.println("indetity matrix");
	  else {
		System.out.println("not identity matrix");
	}
	 
}
}
