package AccessModifiers;
class A
{
	int a,b;
 void input( )
	{
		a=53;
		b=78;
	}
	 void output()
	{
		System.out.println("value of a is"+a);
		System.out.println("value of b is"+b);
	}
}

 public class Private 
 {
	
	public static void main(String[] args) 
	{
		A c=new A();
		c.input();
		c.output();
	}

}
