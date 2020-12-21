package prioriydemo;

import org.testng.annotations.Test;

public class TestNGPriorityDemo {

	@Test(priority = 1)
	public void test1() {
		System.out.println("I am at Test1");
	}

	@Test(priority = 2)
	public void test2() {
		System.out.println("I am at Test2");
	}

	@Test(priority = 2)
	public void test3() {
		System.out.println("I am at Test3");
	}

	@Test(priority = -2)
	public void test4() {
		System.out.println("I am at Test4");
	}
}
