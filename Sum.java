package Guvi;
import java.util.*;
public class Sum {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=s.nextInt();
		int k=0,count=0;
		int n=a;
		while(a!=0)
		{
			k=a%10;
			a=a/10;
			count++;
			}
		int[] arr=new int[count];
		int sum=0;

		for(int i=count-1;i>=0;i--)
		{
			arr[i]=n%10;
			n=n/10;

			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<=i;j++)
			{
		
				sum=sum+arr[j];
			}
			
		}
		System.out.println("The sum of the given number is "+sum);
		
		
	
	}

}
