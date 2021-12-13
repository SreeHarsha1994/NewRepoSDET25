package com.crm.SDET2526Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTest {
	@Test
	public void sample() {
		System.out.println("failing the test");
		Assert.fail();
	}
}
