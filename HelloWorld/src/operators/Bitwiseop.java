package operators;

public class Bitwiseop {

	public static void main(String[] args) {
		        int a = 9;
		        int b = 7;
		       // AND 11 1 10 01 00 0
		       // OR 01 10 11 1 00 0
		       // XOR 11 00 0 10 01 1
		        
		        System.out.println("a&b = "+ (a & b)); //1001 0111 0001 1
		        System.out.println("a|b = "+ (a | b)); // 1001 0111 1111 15
		        System.out.println("a^b = "+ (a ^ b)); // 1001 0111 1110 14
		        System.out.println("~a = "+ ~a ); // 1001 0110 1010 -10
		        a &= b;
		        System.out.println("a= "+ a);
		        
		        
		        }

}
