package Matric;

public class equalOrNot {
      
	public static void equalOrNot(int matrix[][],int matrix1[][])
	{
	     int row=matrix.length;
	     int col=matrix[0].length;
	     
	     int row1=matrix1.length;
	     int col1=matrix1[0].length;
	     
	     boolean flag=true;
	     if(row!=row1 ||col!=col1)
	    	 System.out.println("not equal");
	     else 
	     {
		    for(int i=0;i<row1;i++)
		    {
		    	for(int j=0;j<col;j++)
		    	{
		    		if(matrix[i][j]!=matrix1[i][j])
		    		{
		    			flag=false;
		    			break;
		    		}
		    		
		    	}
		    }
		    
		 }
	     if(flag)
		      System.out.println("yes...it is equal");
		    else 
				System.out.println("Not equal");
			
	 	
	}
	
	 public static void main(String[] args) {
     	int matrix[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
    	int matrix1[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
           
    	equalOrNot(matrix, matrix1);
	}
}
