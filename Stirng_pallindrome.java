import java.util.Scanner;
public class Stirng_pallindrome 
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);           // String pallindrome program
		System.out.println("Enter the string");
		String str=scan.nextLine();
		String cpy="";
		int j=str.length()-1;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==(str.charAt(j)))
			{
				cpy+=str.charAt(i);
				j--;
			}
			else 
			{
				System.out.println("Not pallindrome");
				break;
			}
		}
		if(cpy.equals(str))
		{
			System.out.println("Pallindrome");
		}
	}
}
