package com.edubridge.main;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("Start");
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println("Exception handle");
		}
		System.out.println("End");
	}       
}
