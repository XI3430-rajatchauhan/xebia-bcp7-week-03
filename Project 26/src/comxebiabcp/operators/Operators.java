/**
 * 
 */
package comxebiabcp.operators;

/**
 * @author Rajat.Chauhan
 *
 */
public class Operators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Arithmatic Operators
		
		int a=15, b=45;
		int addition=a+b;
		System.out.println(addition);
		int subtraction=b-a;
		System.out.println(subtraction);
		int multiplication=a*b;
		System.out.println(multiplication);
		int division=b/a;
		System.out.println(division);
		
		// Assignment Operators
		
		int rollNo=34;
		System.out.println(rollNo);
		int d=43;
		d+=4;
		System.out.println(d);
		d-=7;
		System.out.println(d);
		d*=3;
		System.out.println(d);
		d/=6;
		System.out.println(d);
		
		// Relational Operator
		
		int num1=23, num2=43;
		if (num1>num2) {
			System.out.println(num1 +  "is greater than" + num2);
		}
		else {
			System.out.println(num2 + " " +  "is greater than" + " " + num1);
		}
		
		// Logical Operator
		
		System.out.println(34>21 && 67>43);
		System.out.println(45>21 || 43>56);
		
		// Unary Operator
		
		int num=67;
		int c=++num;
		System.out.println(c);

	}

}
