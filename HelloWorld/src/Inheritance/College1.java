package Inheritance;
class College1
{
	public College1()
	{
		System.out.println("College1 constructor");
		}
	int ece,eee,cse;
	void input() 
	{
		ece=180;
		eee=60;
		cse=120;
	}
	public void output()
	{
		System.out.println("Total num of students in college1 \n\n");
		System.out.println("num of students in ece"+ece);
		System.out.println(" num of students in eee"+eee);
		System.out.println(" num of students in cse"+cse);
		
		System.out.println("...................................\n\n");
		
	}
}
 class College2 extends College1
 {
	 public College2()
	 {
		 System.out.println("College2 constructor");
		 }
	 int bcom,ba,bzc;
		void input() 
		{
			bcom=65;
			ba=70;
			bzc=40;
		}
		public void output()
		{
			System.out.println("Total num of students in college2 \n\n");
			System.out.println("num of students in bcom"+bcom);
			System.out.println(" num of students in ba"+ba);
			System.out.println(" num of students in bzc"+cse);
			
			System.out.println("...................................\n\n");
			
		}
	
       {
    	   College2 c=new College2();
    	   c.input();
    	   c.output();
    	   
    	   
    	   
    	   
       }
	 
	 
 
 



}
