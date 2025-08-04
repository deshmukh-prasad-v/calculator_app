package com.hsbc.simple_app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	@Test
	public void testAdd() {
		App app=new App();
		assertEquals(100,app.add(50, 50));
		assertEquals(100,app.add(60, 40));
		assertEquals(100,app.add(30, 70));
		assertEquals(100,app.add(-100, 200));
		assertEquals(100,app.subtract(150, 250));
	}
	
	@Test
	public void testSubtract() {
		App app=new App();
		assertEquals(100,app.subtract(150, 250));
	}
}