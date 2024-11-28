package javaProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_duplicate_Char {

	
	public static void main(String[]args) {
		
		String str="sukesh";
		
		Set<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {
			
			set.add(str.charAt(i));
		}
		for(Character st:set) {
			
			System.out.print(st);
		}
	}

}
