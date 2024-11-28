package javaProgram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Practice {

	public static void main(String[] args) {
		/*		
		String str="sukesh is java";	
		StringBuffer sb=new StringBuffer(str);
		String[] st = str.split(" ");
		
		for(String ss:st) {
			
			if(Character.isLowerCase(str.charAt('h'))) {
				sb.setCharAt('h', Character.toUpperCase(str.charAt('h')));
				System.out.println(sb);
			}
		}
	
		
		String s1="Welcome";
		String s2="Welcome";
		
		boolean ss=(s1.equals("Welcome"));
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		
		//what will be the output ?
		
		System.out.println(ss);
		System.out.println(s3);
		
		*/
		try {
		    // Some code that can throw multiple exceptions
		    int a = 2 / 0;
		    String str=null;
		    
		     System.out.println(str.length());
		      // NullPointerException
		} catch (NullPointerException e) {
		    System.out.println("null");
		} catch (ArithmeticException  e) {
		    System.out.println("NullPointerException");
		} catch (ArrayIndexOutOfBoundsException e) {
		    System.out.println("ArrayIndexOutOfBoundsException");
		} catch (Exception e) {
		    System.out.println("Some other exception");
		}
		finally {
			System.out.println("thankyou");
		}


		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}}