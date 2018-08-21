package cerritos;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class TestArrays {

	
	/*
	 * The i= 6, in the array is 0 to 5 
	 */
	 
	static Integer d;
	static int x = 0;
	
	@SuppressWarnings("null")
	public static void main (String args[]) {
		
		int []a = {1,2,3,4,5,6};
		
		int i= a.length - 1; 
		
		while (i >= 1) {
			System.out.println(a[i]);
			i--;
		}
		
		// 
		int b[] = {};
		
		System.out.println(b instanceof Object);
		
		
		//
		try {
			System.out.println (d.compareTo(0));
		} catch (ArithmeticException | NullPointerException e) {
			System.out.println("Exception");
		}
		
		// 053 es octal convertido a decimal es 43
		
		int a1[] = {1,5,053,4};
		int b1[][] = {{1,2,4},{2,2,1},{0,43,2}};
		
		System.out.println(a1[3] == b1[0][2]);
		System.out.println(" "+ (a1[2] == b1[2][1]));
		
		String _8_="";
		String $testVariable="";
		
		new TestArrays().print ();
		
		String xJson="{\"sasas\"}";
		
		arrayStaticValue(x);
		
		String s= "Java";
		
		s.concat("SE 8");
		s.replaceAll("7", "");
		
		System.out.println(s);
		
		int [] in = {1,2,3};
		
		for (int r=0; ++r<3; r++) 
			System.out.println(in[r]);
		
		//
		
		int xSwitch= 0;
		final int j;
		j= 2;
		
		switch (xSwitch) {
			case 0: {System.out.println("A");}
				  
			case 1: System.out.println("B");
					break;
			case 2: System.out.println("C");
			default:
				break;
		}
		
		
		//
		
		//int xString = Integer.parseInt(args[0]);
		
		int xV2 = 10;
		int yV2 = xV2 > 10 ? 1 : xV2 < 10 ? -1 : 0;
		
		System.out.println(yV2);
		
		// Lambda
		//Predicate<String> filter = () -> {return c.indexOf("a")>0;};
		
		
		//
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		Instant start = Instant.now();
		
		list.forEach( (S) -> System.out.println(S) );
		
		Instant end = Instant.now();
		
		long duration = Duration.between(start, end).toMillis();
		
		System.out.println(duration);
		
		
		// 
		
		List lst = new ArrayList(1);
		
		lst.add (5);
		lst.add ("A");
		lst.add (new Integer(5));
		
		System.out.println(lst);
		
		// codigo ascci 64 A
		  float fg= 1.3F; 
		  char cha='a'; 
		  boolean ba= true; 
		  int ya = 2;
		  char ca=65; 
		  
		  System.out.println(ca);
	}
	

	public void print () {
		int value = 8;
		
		System.out.println(value);
	}
	
	private static void arrayStaticValue(int value) {
	
		for (int x=0; x<5; x++) {
			System.out.println(value);
		}
		
	}	
		
	static int min(double [] in) {
		return 0;
	}
	
}
