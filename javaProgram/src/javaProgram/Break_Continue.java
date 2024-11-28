package javaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Break_Continue {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int num=s.nextInt();   //10
		
		/*
		for(int i=0;i<=num;i++) {
			
			if(i==5) {
				
				System.out.println("5th index is Broken");
				continue;
			}
			System.out.println(i);
		}}}
*/
		for(int i=0;i<=num;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
	}}

//Break will break the entire loop 
//continue will break only particluar number based on your condition 




