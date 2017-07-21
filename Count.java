package Guvi;
import java.util.*;
public class Count 
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	String str=s.nextLine();
	String[] a=str.split(" ");
	int[] c=new int[str.length()];
	String value="";
	for(int i=0;i<a.length;i++)
	{
		value=a[i];
	
		for(int j=0;j<a.length;j++)
		{
			if(a[i].equals(a[j]))
			{
				c[i]++;
			}
		}
	}
		for(int i=0;i<a.length;i++)
		{

			for(int j=0;j<a.length;j++)
			{
				if(a[i].equals(a[j]))
				{
					if(i!=j)
					{
						a[i]="";
					}
				}
		}
	}
		
	for(int i=0;i<a.length;i++)
	{
		if(a[i]!="")
		{
		System.out.println(a[i]+"->"+c[i]);
		}
	}
	
}
}

