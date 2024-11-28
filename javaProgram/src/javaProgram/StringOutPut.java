package javaProgram;

public class StringOutPut {

	public static void main(String[] args) {
		String s1="Welcome";
		String s2="Welcome";
		
		boolean ss=(s1.equals("Welcome"));  //it is possible (2 String) result true
		boolean s9=s1==s2;
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		boolean ss2=(s3.equals(s4));        //it is possible (possible 2 string object)
		
		boolean ss3=(s3==s4);              //it is possible (possible 2 string object) but the result is false because
		                                    // "it checks whether two variables refer to the same object in memory"
		
		
		//what will be the output ?         
		
		System.out.println(s1==s3);
		
		/* 
		 * String s1 = “Welcome”;
String s2 = “Welcome”;
String s3 = new String(“Welcome”);
String s4 = new String(“Welcome”);
 
 
what will be the output ?
System.Out.Println(s1 == s2)
System.Out.Println(s2 == s3)
System.Out.Println(s1 == s3)
System.Out.Println(s3==s4)
		 */
		
		

	}

}
