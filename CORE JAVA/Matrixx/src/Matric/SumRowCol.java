package Matric;

public class SumRowCol {
    public static void main(String[] args) {
           int a[][]=new int [][] {{1,2,3},{4,5,6},{7,8,9}};
           
           int sumRow=0,sumCol=0;
           for(int i=0;i<3;i++)
           {
        	   for(int j=0;j<3;j++)
        	   {
        		   sumRow+=a[i][j];
        	   }
        	   System.out.println("sum of"+ i+1 +" st row is"+sumRow);
        	   sumRow=0;
           }
           for(int i=0;i<3;i++)
           {
        	   for(int j=0;j<3;j++)
        	   {
        		   sumCol+=a[j][i];
            	  
        	   }
        	   System.out.println("sum of"+i+1+" st col is"+sumCol);
        	   sumCol=0;
           }
           
	}
}
