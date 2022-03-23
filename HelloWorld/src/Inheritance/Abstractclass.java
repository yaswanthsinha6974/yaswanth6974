package Inheritance;
abstract class Company
{
	abstract void info1();
	void info2() {
		System.out.println("i am non abstract method");
	}
	
	
}
 class Manager extends Company
 {
	 
	 void info1() {
		 System.out.println("iam abstract method");
		 
	 }
	 
 }

public class Abstractclass {

	public static void main(String[] args) {
		Manager m=new Manager();
		m.info1();
		m.info2();
	}

}
