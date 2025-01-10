import java.util.*;
public class line 
{
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	String m=s.nextLine();
	int COUNT=0; 
	int ca=0;
	for(int i=0;i<m.length();i++)
	{
		char c=m.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u' || c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			{
				COUNT++;
				
			}

			else 
			{
				ca++;
				
			}
		}
		System.out.println("Vowels:"+COUNT);
		System.out.println("consonants"+ca);
	}
}
