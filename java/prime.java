import java.util.*;
public class prime
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter value of n:");
		int n=s.nextInt();
		// System.out.println("Enter value of counter");
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("it is prime number");
		}
		else 
		{
			System.out.println("it is not prime number");
		}
	}
}