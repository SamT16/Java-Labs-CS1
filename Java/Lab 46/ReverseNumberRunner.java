//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ReverseNumberRunner
{
	public static void main( String args[] )
	{
		ReverseNumber test = new ReverseNumber(234);
		System.out.println(test);
		
		

		test.setNumber(10000);
		System.out.println(test); 

		test.setNumber(111);
		System.out.println(test); 
		
		test.setNumber(9005);
		System.out.println(test); 
		
		test.setNumber(84645);
		System.out.println(test); 
		
		test.setNumber(8547);
		System.out.println(test); 
		
		test.setNumber(123456789);
		System.out.println(test); 
	}
}