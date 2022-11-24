import java.util.Scanner;
public class studentdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
stud stu= new stud();
stu.enterdetails("Shrija",22,1,'P');
stu.printdetails();
stu.printdetailsall();
	}

}
class stud
{
	String name;
	int age;
	int id;
	char att;
	void enterdetails(String name,int age,int id,char atte)
	{
		this.name=name;
		this.id=id;
		this.age=age;
		this.att=atte;
	}
	void printdetails()
	{
		System.out.println("the name of student"+name);
		System.out.println("the age of student"+age);
	}
	void printdetailsall()
	{
		System.out.println("the name of student"+name);
		System.out.println("the age of student"+age);
		System.out.println("the id of student"+id);
		//System.out.println("the name of student"+name);
		System.out.println("attendance"+att);
		
	}
}
