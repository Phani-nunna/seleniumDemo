package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {
	
	@Parameters({"MyName"})
	@Test
	public void test(@Optional("Phani") String name) {
		System.out.println(" My Name is "+name);
	}

}
