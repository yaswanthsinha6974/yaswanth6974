package Strings;


public class Split {

	public static void main(String[] args) {
		String s="Thank you for your information";
		String str[]=s.split("");
		
		for(int i=0;i<str.length;i++) 
		{
			System.out.println(str[i]);
		}
	}

}
