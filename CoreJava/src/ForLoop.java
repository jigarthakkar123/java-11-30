import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		long i,n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter N : ");
		n=sc.nextLong();
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum : "+sum);
	}
}
