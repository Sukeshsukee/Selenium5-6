package javaProgram;

public class Sum_Array {

	public static void main(String[] args) {
		int num[]= {2,3,5};
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		System.out.println(sum);

	}

}
