package Assignment1;

import java.util.Scanner;

public class Avgofelm {

	public static void main(String[] args) 
	{
		int a[]=new int[6];int sum=0;double avg;
		Scanner r=new Scanner(System.in);
		System.out.print("Enter array elements");
		for(int i=0;i<6;i++) 
		{
			a[i]=r.nextInt();
		}
		
		System.out.print("Array Elements");
		for(int i=0;i<6;i++)
		{
			sum=a[i]+sum;
			
			
		}
		avg=sum/6.0;
		System.out.print(sum+"average "+avg);
		
		
	}

}
