package com.hsbc.calculator_app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main( String[] args ){
    	App app=new App();
    	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
    	try {
    		System.out.println("Enter numbers");
    		int a=Integer.parseInt(bufferedReader.readLine());
    		int b=Integer.parseInt(bufferedReader.readLine());
    		System.out.printf("sum: %s",app.add(a, b));
    		System.out.printf("difference: %s",app.subtract(a, b));
    	}catch(IOException e) {
    		System.out.println(e);
    	}
    }
    
    public double add(double a, double b) {
    	return a+b;
    }
    
    public double subtract(double a, double b) {
    	return a-b;
    }
}
