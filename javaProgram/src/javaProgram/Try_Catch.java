package javaProgram;



public class Try_Catch {
	
	
	public static void main(String[] args) {
	
		try {
			
			int div=10/0;
			System.out.println(div);
		}
		catch(ArithmeticException e) {
			
			System.out.println("cannot divide by 0 "+e);
		}
		finally{
			System.out.println("Thanks for visiting web");
			//System.exit(0);  //remaming is not executing 
		}
		System.out.println("executed after exception");
	}
	
}
/*
try{
int a = 2/0;
}catch (ArithmeticException e){
System.out.println("ArithmeticException ");
} catch (Exception e){
System.out.println("Exception");
} catch (NullPointerException e){
System.out.println("NullPointerException");
}
*/
//Initialise list and map