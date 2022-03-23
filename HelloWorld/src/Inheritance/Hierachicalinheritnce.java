package Inheritance;

class Teacher
{
 String name="Bindu";
 String surname="Gotukula";
 
 void teacherinfo() {
	 System.out.println("Teachr Name:"+name);
	 System.out.println("Teacher surname:"+surname);
 }
}

class Child1 extends Teacher
{
String name="Prameela";

void child1info() {
	System.out.println("Child 1 Name:"+name);
	System.out.println("Child 1 surame:"+surname);
}

}
class Child2 extends Teacher
{
	String name="kavya";
	
	void child2info() {
		System.out.println("Child 2 Name:"+name);
		System.out.println("Child 2 surname:"+surname);
	}
}
public class Hierachicalinheritnce {

	public static void main(String[] args) {
		Child1 c1=new Child1();
		Child2 c2=new Child2();
		
		System.out.println(".............Teacher and Child1 Details.......");
		c1.teacherinfo();
		c1.child1info();
		
		System.out.println(".............Teacher and Child2 Details.......");
		c2.teacherinfo();
		c2.child2info();
	}

}
