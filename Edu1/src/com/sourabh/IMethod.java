package com.sourabh;

class Adder{
	static double add(int a, double b) {
		return a+b;
	}
	static double add(double a, int b) {
		return a+b;
	}
}

public class IMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Adder.add(10, 20.5));
		System.out.println(Adder.add(10.5, 20));
	}

}
