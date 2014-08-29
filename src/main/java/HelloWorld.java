package com.sap.jni;

public class HelloWorld {
	
	static{
		System.loadLibrary("goodluck"); 
	}
	
	public native static int get(); 
	
	public native static void set(int i); 

	public static void main(String[] args) {
		HelloWorld.set(10);
		System.out.println(HelloWorld.get());
	}
}
