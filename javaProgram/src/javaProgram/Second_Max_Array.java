package javaProgram;

import java.util.Arrays;

public class Second_Max_Array {

	public static void main(String[] args) {
		int a[]= {2,1,4,7,9,8,5,2,93,6,99,98,8,5};
		
		Arrays.sort(a);
		String ch = Arrays.toString(a);
		System.out.println(Arrays.toString(a));
		for(int i=0;i<=ch.length();i++){
			if(i==12) {
				System.out.println(a[i]);
			}
		}
	}}
