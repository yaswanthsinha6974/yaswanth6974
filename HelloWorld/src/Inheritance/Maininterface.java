package Inheritance;
interface Employee
{
	void employeeinfo1();
	void employeeinfo2();
	
	
}
class Admin implements Employee
{
	public void employeeinfo1() {
		System.out.println("Employee info method 1");
		
	}
	public void employeeinfo2() {
		System.out.println("Employee info method 2");
		
	}
}

public class Maininterface {

	public static void main(String[] args) {
		
		Admin a=new Admin();
		a.employeeinfo1();
		a.employeeinfo2();
		
	}

}
