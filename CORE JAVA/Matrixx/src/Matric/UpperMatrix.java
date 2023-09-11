package Matric;

public class UpperMatrix {
         
	public static void main(String[] args) {
		int matrix[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
	
		System.out.println("upper matrix is............");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(j>i)
					System.out.print("0");
				else {
					System.out.print(matrix[i][j]);
				}
			}
			System.out.println();
		}
		
		
		System.out.println("lower matrix is............");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i>j)
					System.out.print("0");
				else {
					System.out.print(matrix[i][j]);
				}
			}
			System.out.println();
		}
		
	}
}
