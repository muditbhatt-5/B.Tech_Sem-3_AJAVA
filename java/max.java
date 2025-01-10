import java.util.*;
public class max
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of a:");
		int a=s.nextInt();
		System.out.println("enter value of b:");
		int b=s.nextInt();
		System.out.println("enter value of c:");
		int c=s.nextInt();
		if(a>b)
		{
			System.out.println("a is maximum");
		
		if(a>c)
		{
			System.out.println("a is maximum");
		}
	}
		else
		{
			if(b>c)
			{
				System.out.println("b is maximum");
			}
			else 
			{
				System.out.println("c is maximum");
			}
		} 
	}
}