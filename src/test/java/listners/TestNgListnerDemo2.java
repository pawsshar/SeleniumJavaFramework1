package listners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestNgListnerDemo2 {

	@Test
	public void test4() {
		System.out.println("I am inside test 4");
	}
	@Test
	public void test5() {
		System.out.println("I am inside test 5");
		//this is to fail the test case self by assert text
		
	}
	@Test
	public void test6() {
		System.out.println("I am inside test 6");
		//this is to skipp the test case
		throw new SkipException("The test case is skipped");
	}

}
