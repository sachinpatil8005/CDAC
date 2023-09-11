package Matric;

public class FreqOddEven {
      public static void main(String[] args) {
  		int matrix[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
         
  		int Oddcount=0,Evencount=0;
  		for(int i=0;i<3;i++)
  		{
  			for(int j=0;j<3;j++)
  				
  			{
  				if(matrix[i][j]%2==0)
  					Evencount++;
  				else {
					Oddcount++;
				}
  			}
  		}
  		System.out.println(Evencount);
  		System.out.println(Oddcount);
	}
}
