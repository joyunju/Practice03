//Ex16 아래와 설명에 맞는 프로그램을 작성하세요
//숫자를 1개 입력 받아 5의 배수의 개수와 합을 출력하는 프로그램을 작성하세요
//예를들어 22을 입력한 경우 5의배수 개수: 4, 5의배수 합: 50 이 출력된다.

package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();

		int count = 0;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			if (i % 5 == 0) {
				count = count + 1;
				sum = sum + i;
			}
		}
		System.out.println("5의 배수의 개수 : " + count);
		System.out.println("5의 배수의 합 : " + sum);

		sc.close();

	}

}
