package Arrays;

public class TwoDArray {

	public static void main(String[] args) 
	{
		String[][] cities=new String[3][3];
		cities[0][0]="TS";
		cities[0][1]="HYD";
	    cities[0][2]="GHMC";
	    cities[1][0]="AP";
	    cities[1][1]="ELU";
	    cities[1][2]="EMC";
	    cities[2][0]="KER";
	    cities[2][1]="TRIS";
	    cities[2][2]="MCT";
	    for(int row=0;row<cities.length;row++) {
	    	System.out.println();
	    	for(int col=0;col<cities[row].length;col++) {
	    		System.out.print(cities[row][col]+"\t");
	    	}
	    }
	    												
				
	}


}
