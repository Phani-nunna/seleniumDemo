package listeners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(listeners.TestNGListeners.class)
public class TestNGListenerDemo2 {
	
	@Test
	public void test5() {
		System.out.println("I am inside test5 ");
	}
	
	@Test
	public void test6() {
		System.out.println("I am inside test6 ");
	}
	
	@Test
	public void test7() {
		System.out.println("I am inside test7 ");
		//throw new SkipException("This test is skipped");
	}
	
	@Test
	public void test8() {
		System.out.println("I am inside test8");
	}
	

}
