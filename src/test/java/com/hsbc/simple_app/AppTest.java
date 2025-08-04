package com.hsbc.simple_app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	@Test
	public void testGreet() {
		App app=new App();
		assertEquals(app.greet("Prasad"), "Hello Prasad");
	}
}