import java.util.Scanner;

public class Ass1 {
	public static void display(int arr[])
	{
		System.out.println(" **********  Array Is ********** ");
		System.out.println();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
		
			System.out.print("  "+arr[i]);
		}
		System.out.println();
		
	}
	public static int[] findUnionAll(int a[],int b[])
	{
		int res[]=new int[a.length+b.length];
		int k=0;
		for(int i=0;i<a.length;i++)
			res[k++]=a[i];
		for(int i=0;i<b.length;i++)
			res[k++]=b[i];
		return res;
			
		
	}
	public static int [] findUnion(int a[],int b[])
	{
		int res[]=new int[a.length+b.length];
		int k=0;
		// copy all elements from dirst array
		for(int i=0;i<a.length;i++)
			res[k++]=a[i];
		// Copy non unique elements
		boolean flag=true;
		for(int i=0;i<b.length;i++)
		{
			flag=true;
			for(int j=0;j<a.length;j++)
			{
				if(b[i]==a[j])
				{
					flag=false;
					break;
				}
				
			}
			if(flag==true)
				res[k++]=b[i];
		}
		return res;
		
		
	}
	
	public static void accept(int arr[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter "+arr.length+  " Elements ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		
	}
	public static void main(String[] args)
	{
		//int arr1[],arr2[];
		int asize,bsize;
		Scanner sc=new Scanner(System.in);
		int res[];
		/*System.out.println(" Enter Size Of Arra1 and Arra2 ");
		 
		asize=sc.nextInt();
		bsize=sc.nextInt();
		arr1=new int[asize];
		arr2=new int[bsize];
		
		accept(arr1);
		accept(arr2);*/
		int arr1[]= {4,5,7,9};
		int arr2[]= {2,4,5,7,8,9};
		int choice=1;
		display(arr1);
		display(arr2);
		do
		{
			System.out.println("1. Union");
			System.out.println("2. Intersection");
			System.out.println("3. Union All");
			System.out.println("0. Exit");
			System.out.println("Enter Your choice ");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 3:
				res=findUnionAll(arr1, arr2);
				display(res);
				break;
			case 1:
				res=findUnion(arr1, arr2);
				display(res);
				break;
			}
			
			
		}while(choice!=0);
		
		
		
	}

}
