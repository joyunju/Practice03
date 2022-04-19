// for문 
// Ex10 정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
// 문제 풀이 : 숫자 입력 --> for문 (숫자 입력)  --> 최대값 출력
package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		// 최대값
		int max = 0;

		for (int i = 1; i <= 5; i++) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			
			//숫자 비교 -> 최대값 변경
			if (num >= max) {
				max = num;
			}
		}
		System.out.println("최대값은 " + max + "입니다.");

		sc.close();
	}
}

//숫자를 입력해라
//==for문===
//숫자 입력
//=======
//최대값 출력

// 숫자 비교는 어떻게 할까?
// 새로 입력한 숫자랑 기존에 최대값으로 정해져 있던 숫자랑 비교 후,
// 새로 입력하는 숫자가 최대값보다 크면 최대값을 교체! 