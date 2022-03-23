package Constructor;
 class Student{
	 
	 // Default variable
	 int studentrollno;
	 String studentName;
	 double marks;
	 
	 //Default Constructor
	 Student(){
		 studentrollno=25;
		 studentName="yaswanth";
		 marks=76;
		 System.out.println(studentrollno);
		 System.out.println(studentName);
		 System.out.println(marks);
		
		 }
}
public class StudentMain 
{
   	

	public static void main(String[] args) {
		Student s=new Student ();
		
		
	}

}
