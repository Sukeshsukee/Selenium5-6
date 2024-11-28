package javaProgram;

public class Consecutive_Char_IN_String {

	public static void main(String[] args) {
        String str="tester";
		
		int alpat = str.replaceAll("[t]", "").length();
		int alpae =str.replaceAll("[e]", "").length();
		int alpas =str.replaceAll("[s]", "").length();
		int alpar =str.replaceAll("[r]", "").length();
		System.out.println("t = "+(str.length()-alpat));
		System.out.println("e = "+(str.length()-alpae));
		System.out.println("s = "+(str.length()-alpas));
		System.out.println("r = "+(str.length()-alpar));
	}


	

}
