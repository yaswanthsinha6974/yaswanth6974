package Inheritance;
class Officer
{
	String FirstName="Alphonse";
	String SurName="Gotukula";
	
	void Singerinfo() {
		System.out.println("First Name of officer:"+FirstName);
		System.out.println("Surname of officer:"+SurName);
	}
	}
class Student extends Officer
{
	String firstName="Sinha";
	
	void studentinfo() {
		System.out.println("First Name of student:"+firstName);
		System.out.println("SurName of student:"+Surname);
	}
}

public class Singleinheritance {

	public static void main(String[] args) {
		Student s=new Student();
		s.officerinfo();
		s.studentinfo();
	
	}

}
