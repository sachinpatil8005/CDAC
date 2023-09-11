package Matric;

public class NinetyDegreeRotation {
	
	  public static void ninetyRotstr(int matrix[][],int n,int m)
	  {
		  
		  
//....................1st method........................//
		  
		//traspose
		  
		  for(int i=0;i<n;i++)
		  {
			  for(int j=i;j<m;j++)
			  {
				  int temp=matrix[i][j];
				  matrix[i][j]=matrix[j][i];
				  matrix[j][i]=temp;
			  }
		  }
		  
		  //actual to 90
		  for(int i=0;i<n;i++)
		  {
			  int low=0,high=n-1;
			  while(low<high)
			  {
				  int temp=matrix[i][low];
				  matrix[i][low]=matrix[i][high];
				  matrix[i][high]=temp;
				  low++;
				  high--;
			  }
		  }
		  
		  //print
		  System.out.println("new matrix is");
		  for(int i=0;i<n;i++)
		  {
			  for(int j=0;j<m;j++)
			  {
				  System.out.print(matrix[i][j]+" ");
			  }
			  System.out.println();
		  }
		  
		  
		  
//.............................2nd easy method..............................//  
/*           System.out.println("new right matrix");
		  for(int i=0;i<3;i++)
		  {
			  for(int j=2;j>=0;j--)
			  {
				  System.out.print(matrix[j][i]+" ");
			  }
			  System.out.println();
		  }                                                                      */
		
		  
//...........................2nd for left rotation..........................//
		  
//		  13 23 33
//		  12 22 32
//		  11 21 31
		  
		  
//		  System.out.println("left array");
//		  for(int i=2;i>=0;i--)
//		  {
//			  for(int j=0;j<3;j++)
//			  {
//				  System.out.print(matrix[j][i]+" ");
//			  }
//			  System.out.println();
//		  }
		  
		  
	  }
	
	
        public static void main(String[] args) {
			int n=3,m=3;
        	int matrix[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
        	
        	System.out.println("original matix is..");
        	for(int i=0;i<3;i++)
        	{
        		for(int j=0;j<3;j++)
        		{
        			System.out.print(matrix[i][j]+" ");
        		}
        		System.out.println();
        	}
        	ninetyRotstr(matrix,n,m) ;       	
		}
}
