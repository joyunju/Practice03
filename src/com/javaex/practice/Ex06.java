//1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요
package com.javaex.practice;

public class Ex06 {
	public static void main(String[] args) {

		System.out.println("1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요");

		for (int num = 1; num <= 100; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println("num");
			}
		}
	}
}
