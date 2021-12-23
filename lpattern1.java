import java.util.Scanner;
public class lpattern1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your choice");
		int n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=n-i;j++)					// v type with triangle pattern check it now
			{
				System.out.print(j);
			}
			for(int star=0;star<i*2;star++)
			{
				System.out.print("*");
			}
			for(int rev=n-i;rev>0;rev--)
			{
				System.out.print(rev);
			}
			System.out.println();
		}
		

	}

}
