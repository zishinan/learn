package com.test.ouyang;

import org.junit.Before;
import org.junit.Test;

import com.ouyang.util.PropertiesUtil;


public class RmiPropertyTest {

	@Before
	public void beforeTest() {
		PropertiesUtil.load("rmi.properties");
	}
	
	@Test
	public void testProperty() throws Exception {
		System.out.println();
		String ip = PropertiesUtil.getProperty("rmi.ip");
		System.out.println(ip);
		String port = PropertiesUtil.getProperty("rmi.port");
		System.out.println(port);
	}
	
}
