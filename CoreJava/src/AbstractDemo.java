abstract class Abs1
{
	void meth1()
	{
		System.out.println("Meth1");
	}
	abstract void meth2();
}
class Abs2 extends Abs1
{
	void meth2() {
		System.out.println("Meth2");
	}
	
}
class Abs3 extends Abs1
{
	void meth2() {
		System.out.println("Meth2 Defined In Abs3");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		Abs2 a=new Abs2();
		a.meth1();
		a.meth2();
		Abs3 a1=new Abs3();
		a1.meth1();
		a1.meth2();
	}
}
