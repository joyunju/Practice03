//Ex15 아래와 설명에 맞는 프로그램을 작성하세요
//숫자를 1개 입력 받아 입력한 수의 약수를 모두 출력하세요

package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");

		int num = sc.nextInt();

		// 약수 구하기 : 나머지가 없이 딱 떨어지는 수
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
