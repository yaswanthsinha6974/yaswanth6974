package Constructor;

public class Rectangle 
{
	Rectangle(int length,int width)
	{
		System.out.println("length is"+length);
		System.out.println("width is"+width);
		int area=length*width;
		System.out.println("area is"+area);
		}
	    Rectangle(int a )
	    {
	    	System.out.println("value of A is " +a);
	    
	    }
	

	public static void main(String[] args) 
	{
		Rectangle obj =new Rectangle (20,15);
		Rectangle obj1=new Rectangle (300);
	
		
	}

}
