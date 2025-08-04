package com.hsbc.simple_app;

public class App {
    public static void main( String[] args ){
        System.out.println(new App().greet("Prasad"));
    }
    
    public String greet(String name) {
    	return String.format("Hello %s",name);
    }
}
