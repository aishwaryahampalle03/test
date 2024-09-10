package com.example.test.pratice;

public class MethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Im Calling new Method");
		MethodExample me = new MethodExample();
		System.out.println(me.firstMethod());
		
	}
	
	public String firstMethod() {
		return "im first method calling";
	}

}
