package Guvi;
import java.util.*;
public class Power 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int count=0;
	int k=0;
	System.out.println("Enter the number");
	int n=s.nextInt();
	int a=n;
	int g=1;
	while(n!=0)
	{
		k=n%10;
		n=n/10;
		count++;
	}
	int arr[]=new int[count];
	for(int i=count-1;i>=0;i--)
	{
		arr[i]=a%10;
		a=a/10;

	
	}
	int sum=0;
	int[] b=new int[count];
	for(int i=0;i<arr.length;i++)
	{
		g=1;
	for(int j=0;j<count;j++)
	{
			g=g*arr[i];
	}
	b[i]=g;
	sum+=b[i];
	}
	System.out.println("power"+sum);

	

}
}
