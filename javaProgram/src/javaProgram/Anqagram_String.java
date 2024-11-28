package javaProgram;

import java.util.Arrays;

public class Anqagram_String {

	public static void main(String[] args) {
String str="THEY SEE",str1="THE EYES";
		
		char ch[]=str.toCharArray();
		char ch1[]=str1.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch1);
		String a1 = Arrays.toString(ch);
		String a2 = Arrays.toString(ch1);
		
		if(a1.equals(a2)) {
			System.out.println("anagram");
		}
		else {
			System.out.println("not");
	}

}
}