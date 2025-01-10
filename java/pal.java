import java.util.*;
public class pal
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter n");
		int n=s.nextInt();
		int rem=0;
		int rev=0;
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=(rev*10)+rem;
			n/=10;
		}
		if(temp==rev)
		{
			System.out.println("It is palinedrome number");
		}
		else 
		{
			System.out.println("it is not palinedrome number");
		}
	}
}