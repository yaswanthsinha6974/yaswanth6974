package Inheritance;
interface A
{
	void show();//public+abstract
	
}
interface B
{
	void Disp ();//public+abstract
	
}
class Multiple implements A,B
{
public void show()
{
	System.out.println("Interface A& B");
}
public void Disp() {
	System.out.println("Interface B");
}

	public static void main(String[] args) {
		Multiple m=new Multiple();
		m.show();
		m.Disp();
		
		
		
	}

}
