class Student
{
	static String sname;
	static int rno;
	public Student() {
		System.out.println("Student's Default Constructor");
	}
	public Student(String sname,int rno) {
		this();
		this.rno=rno;
		this.sname=sname;
	}
	static void show()
	{
		System.out.println("Roll No : "+rno);
		System.out.println("Student Name : "+sname);
	}
}
public class ThisKeyword {

	public static void main(String[] args) {
		Student s1=new Student("Jigar", 1);
		Student.show();
	}
}
