package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
    
	
	@Test
	public void test1() {
		System.out.println("I am at Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I am at Test2");
		//int i =1/0;
	}
	
	@Test(retryAnalyzer = listeners.MyRetryListener.class)
	public void test3() {
		System.out.println("I am at Test 3");
		
		//Assert.assertTrue(false);
	}
}
