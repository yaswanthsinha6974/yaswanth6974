package Polymorphism;
class Addition{
	
	void add(int x,int y) 
	{
		int result=x+y;
		System.out.println("Addition of two numbers:"+result);
		}
	
	void add(int x,int y,int z) 
	{
		int result=x+y+z;
		System.out.println("Addition of three numbers:"+result);
		
	}
}

public class MethodofOverloading {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(250, 251);
		a.add(301, 921,231);
		

	}

}
