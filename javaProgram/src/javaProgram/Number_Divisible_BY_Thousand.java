package javaProgram;

public class Number_Divisible_BY_Thousand {

	public static void main(String[] args) {
		
		// i wanted to see numbers which is divisible by 1 to 1000
		int num=10;
		for(int i=0;i<1000;i++) {
			
			if(i%10==0){
				System.out.println(i);
			}
		}

	}

}
