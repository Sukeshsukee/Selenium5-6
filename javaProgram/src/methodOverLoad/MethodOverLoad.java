package methodOverLoad;

public class MethodOverLoad {

	public static void main(String[] args) {
		MethodOverLoad m=new MethodOverLoad();
		m.method(10);

	}
	public void method(int a, int b) {
		a=10; b=60;
		System.out.println(a+b);
	}
	public void method(int a) {
		
		System.out.println(a+100);
	}

}
