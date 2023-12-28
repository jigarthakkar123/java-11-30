import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		double a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter A : ");
		a=sc.nextDouble();
		System.out.print("Enter B : ");
		b=sc.nextDouble();
		c=a+b;
		System.out.println("Addition : "+c);
		c=a-b;
		System.out.println("Subtraction : "+c);
		c=a*b;
		System.out.println("Multiplication : "+c);
		c=a/b;
		System.out.println("Division : "+c);
	}
}
