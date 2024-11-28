package priority;

import org.testng.annotations.Test;

import net.bytebuddy.implementation.bind.annotation.BindingPriority;

public class Class1 {

	@Test   (priority=0)
	public void y1() {
		System.out.println("y1");
	}
	@Test   (priority=-1, invocationCount=2, groups="smoke")
	public void x1() {
		System.out.println("x1");
	}

}
