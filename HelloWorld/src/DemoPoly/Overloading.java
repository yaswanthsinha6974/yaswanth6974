package DemoPoly;

class Addition
{
	void add (int x, int y)
	{
		int result=x+y;
		
		System.out.println("Addition of Two Numbers:"+result);
	}
	
	

	 void add (int x,int y,int z)
	 {
	 int result=x+y+z;
	 
	 System.out.println("Addition of three Numbers:"+result);
	}
	
	
}

public class Overloading {

	public static void main(String[] args) {
		Addition a=new Addition();
		a.add(50,60);
		a.add(12,50, 84);

	}

}
