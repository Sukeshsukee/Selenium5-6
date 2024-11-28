package javaProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Uniqueno_Array {

	public static void main(String[] args) {
		
		        int[] num = {1, 2, 3, 4, 5, 3, 2, 6, 7, 8, 5};
		        LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();

		        for (int ss : num) {
		            lh.add(ss); // Adds only unique numbers
		        }

		        System.out.println("Unique numbers in the array are: " + lh);
		    }
		

	}


