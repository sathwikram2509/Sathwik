package com.edubridge.main;

public class Final {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int a = 10 / 2; 
			int[] ab = {10, 20, 30};
			System.out.println(ab[0]);
			System.out.println(ab[1]);
			System.out.println(ab[2]);		
			System.out.println(ab[3]);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic handle " + e);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Handle " + e);
		} catch (Exception e) {
			System.out.println("General Exception Handle " + e);
		} finally {
			System.out.println("Finally block executed.");
		}
		System.out.println("end");
	}
}
