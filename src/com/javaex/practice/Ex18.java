//숫자 하나를 입력받아 아래와 같이 * 가 출력되도록 프로그램을 작성하세요.

package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");

		int num = sc.nextInt();

		// for문 2번
		for (int i = num; i >= 1; i--) {
			// i>=0; --> 으로 작성시 공백이 생김
			// 생기는 이유? --> 디버깅 ( 3 2 1 0
			//i=0 일때
			//j=1  1<=0 이라서 바로 for문 종료 --> 그래서 그아래 프린트ln만 출력으로 공백이 생김 
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			// 별 줄 바꿈
			System.out.println("");
		}

		for (int i = 2; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();
	}
}
