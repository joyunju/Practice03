//숫자를 입력받아 아래와 같이 출력하세요

package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		int num = sc.nextInt();
		
		// y축 세로 반복
		for (int y = 1; y <= num; y++) {
			// x축 세로 반복
			for (int x = 1; x <= y; x++) {
				System.out.print(y);
			}
			// 가로 반복이 끝나면 줄 바꿈
			System.out.println("");
		}

		sc.close();
	}
}