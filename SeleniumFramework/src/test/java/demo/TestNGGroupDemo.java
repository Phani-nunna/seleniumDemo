package demo;

import org.testng.annotations.Test;


@Test (groups = {"Kanth"})
public class TestNGGroupDemo {
	
	
	@Test(groups = {"sanity"})
	public void test1() {
		System.out.println("Test1 is running");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test2() {
		System.out.println("Test2 is running");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void test3() {
		System.out.println("Test3 is running");
	}
	
	@Test(groups = {"sanity","windows.regression"})
	public void test4() {
		System.out.println("Test4 is running");
	}
	
	@Test(groups = {"phani"})
	public void test5() {
		System.out.println("Test5 is running");
	}

}
