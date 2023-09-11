package Matric;

public class Transpose {
        public static void main(String[] args) {
			int a[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
			int t[][]=new int [3][3];
			System.out.println("original matrix");
			for(int i=0;i<3;i++)
	        {
			  for(int j=0;j<3;j++)
			  {
					System.out.print(a[i][j]);

			  }
			  System.out.println();
			  
	        }
			System.out.println("new traspose matrix");
			for(int i=0;i<3;i++)
	        {
			  for(int j=0;j<3;j++)
			  {
				  t[i][j]=a[j][i];
				  System.out.print(t[i][j]);
			  }
			  System.out.println();
			  
	        }
}
}
