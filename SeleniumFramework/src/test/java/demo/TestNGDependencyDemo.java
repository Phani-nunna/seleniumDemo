package demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	

	@Test(dependsOnGroups = {"lenovo.*"})
	public void test1() {
		System.out.println("I am inside at Test 1");
	}
	
	/*
	 * @Test(dependsOnMethods = {"test2","test3"},priority = 1) public void test1()
	 * { System.out.println("I am inside at Test 1"); }
	 */
	
	
	@Test(groups = {"lenovo"})
	public void test2() {
		System.out.println("I am inside at Test 2");
	}
	
	
	@Test(groups = {"lenovo2"})
	public void test3() {
		System.out.println("I am inside at Test 3");
	}

}
