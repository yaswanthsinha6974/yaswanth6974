package Strings;

public class PublicBooleanEquals {

	public static void main(String[] args) {
		String str1="Hai Bro!";
		String str2="Hai Bro!";
		String str3= new String("Hai Bro!");
		
		if(str1.equals(str2))
		{
			System.out.println("str1 and str2 refer to identical strings .");
			
		}
		else 
		{
			System.out.println("str1 and str2 refer to non identical strings .");
		}
		if(str1==str2) 
		{
			System.out.println("str1 and str2 refer to the same string .");
		}
		else 
		{
			System.out.println("str1 and str2 refer to different strings .");
		}
		if(str1.equals(str3)) 
		{
			System.out.println("str1 and str3 refer to identical strings .");	
		}
		else
		{
			System.out.println("str1 and str3 refer to non identical strings .");	
		}
		if(str1==str3) 
		{
			System.out.println("str1 and str3 refer to same strings .");
			
		}
		else 
		{
			System.out.println("str1 and str3 refer to different strings .");
		}
	}
	

}
