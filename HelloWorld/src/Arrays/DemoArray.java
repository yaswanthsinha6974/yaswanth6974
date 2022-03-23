package Arrays;

public class DemoArray {

	public static void main(String[] args) 
	{
		int[]arr;
		arr=new int[6];
		
		arr[0]=11;
		arr[1]=21;
		arr[2]=31;
		arr[3]=41;
		arr[4]=51;
		arr[5]=61;
		
		for (int i=0;i<arr.length;i++)
			System.out.println("Elements at index "+i+":"+arr[i]);
		

	}

}
