import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		int a,b,c,d,choice;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.print("Enter A : ");
			a=sc.nextInt();
			System.out.print("Enter B : ");
			b=sc.nextInt();
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("\nEnter Your Choice : ");
			d=sc.nextInt();
			switch(d)
			{
				case 1:
					c=a+b;
					System.out.println("Addition : "+c);
					break;
				case 2:
					c=a-b;
					System.out.println("Substraction : "+c);
					break;
				case 3:
					c=a*b;
					System.out.println("Multiplication : "+c);
					break;
				case 4:
					c=a/b;
					System.out.println("Division : "+c);
					break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
			System.out.print("Do You Want To Continue : (1/0) : ");
			choice=sc.nextInt();
			if(choice==1)
			{
				continue;
			}
			else
			{
				break;
			}
		}
	}
}
