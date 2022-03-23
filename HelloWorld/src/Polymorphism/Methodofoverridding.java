package Polymorphism;

class Animal
{
	static void run1() 
	{
		System.out.println("h....animal is running");
	}


	void run2() 
	{
		
		System.out.println("o...animal is running");
		
	}
}
class  dog extends Animal
{
	static void run1() {
	System.out.println("h...dog runs fastly");
	}
	 void run2() {
		
	System.out.println("o....dog runs fastly");
	}
	 }
	
	
public class Methodofoverridding {

	public static void main (String[] args) 
	{
		Animal a=new dog();
		a.run1();
		a.run2();
	
	}
		

	}


