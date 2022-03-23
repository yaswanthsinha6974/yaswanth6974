package Inheritance;
class GrandParent{

	String name="Prasad";
	String surname="Gotukula";

	
	void grandParentinfo() 
	{
		System.out.println("..........GrandParent Details........");
	System.out.println("Name of the Grand Parent:"+name);
	System.out.println("surname Name of Grand Parent:"+surname);
	}
}
 class Parent extends GrandParent
 {
	 String name="Alphonse";
   
   void parentinfo() {
	   System.out.println(".............Parent Details..........");
	   System.out.println(" Name of the Parent:"+name);
	   System.out.println("surname of the Parent :"+surname);
   }
	
}
class Child extends Parent
{
	String name="Sinha";
	
	void childinfo() {
		System.out.println("...........Child Details............");
		System.out.println("Name of the Child:"+name);
		System.out.println("surname of the Child :"+surname);
		
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.grandParentinfo();
		c.parentinfo();
		c.childinfo();
		}
}


