package listners;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;


public class TestNgListnerDemo {

	@Test
	public void test1() {
		System.out.println("I am inside test 1");
	}
	@Test
	public void test2() {
		System.out.println("I am inside test 2");
		//this is to fail the test case self by assert text
		Assert.assertTrue(false);
	}
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
		//this is to skipp the test case
		throw new SkipException("The test case is skipped");
	}

}
