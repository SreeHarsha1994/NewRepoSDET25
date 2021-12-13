package com.crm.SDET2526Practice;

import org.testng.annotations.Test;

public class ReadDataFromCmdTest {
	@Test
	public void read() {
		System.out.println("reading data from cmd line");
		String URL = System.getProperty("url");
		String Browser = System.getProperty("browser");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println("URL");
		System.out.println("BROWSER");
		System.out.println("USERNAME");
		System.out.println("PASSWORD");
	}

}
