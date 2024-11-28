package javaProgram;

public class Consecutive_char {

	public static void main(String[] args) {
		 String str = "sukesh";
	        String result = "";  // Initialize result as an empty string
	        
	        int count = 1;

	        // Loop through the string until the second last character
	        for (int i = 0; i < str.length()-1; i++) {
	            // Check if the current character is the same as the next one
	            if (str.charAt(i) == str.charAt(i + 1)) {
	                count++;
	            }
	            else {
	                // Add the character and count to the result, then reset count
	                result= result+str.charAt(i) + "=" + count + ",";
	                count = 1;
	            }
	        }
	        
	        // Add the last character and its count
	        result= result+ str.charAt(str.length() -1) + "=" + count;
                                                                                                        
	        // Print the result
	        System.out.println(result);
	    
	    }
	

	

}
