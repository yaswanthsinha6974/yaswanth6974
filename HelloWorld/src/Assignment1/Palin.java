package Assignment1;

import java.util.Scanner;

public class Palin {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n,rev=0,z;
		System.out.println("Enter the Number");
		n=sc.nextInt();
		z=1;
		while(n>0) 
		{
			rev=(rev*10)+n%10;
			n=n/10;
		}
		
		if(rev==z)
			System.out.println("Number is Palindrome");
			System.out.println("Number is not palindrome");

	}

}

