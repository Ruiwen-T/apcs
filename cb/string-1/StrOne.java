public class StrOne{

	/** Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
	**/
	public static String helloName(String name){
		return "Hello " + name + "!";
	}

	/** Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
	**/
	public static String makeAbba(String a, String b) {
 		return a+b+b+a;
	}

	public static void main(String[] args){
		System.out.println(helloName("Bob")); // → "Hello Bob!"
		System.out.println(helloName("Alice")); // → "Hello Alice!"
		System.out.println(helloName("X")); // → "Hello X!"
	
		System.out.println(makeAbba("Hi", "Bye")); // → "HiByeByeHi"
		System.out.println(makeAbba("Yo", "Alice")); // → "YoAliceAliceYo"
		System.out.println(makeAbba("What", "Up")); // → "WhatUpUpWhat"
	}
}
