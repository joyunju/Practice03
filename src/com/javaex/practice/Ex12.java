//Ex12 팩토리얼은 다음과 같이 정의된다. 숫자를 1개 입력받아 팩토리얼 값을 출력하세요.
//5 입력시 1*2*3*4*5 의 값이 출력됩니다.
//7 입력시 1*2*3*4*5*6*7 의 값이 출력됩니다.
//팩토리얼공식 n! = 1 × 2 × 3 × ⋯ × n

package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		//입력값 받기 
		int num = sc.nextInt();
		
		// 결과값을 나타낼 변수 선언 1을 할당
		int factorial = 1;
		
		// for (1부터 입력된 수 num까지 1씩 증가해서 반복하기) 
		for (int i = 1; i <= num; i++) {
			//결과값 = 결과값 * 숫자 -> 계속 반복해서 곱하기 
			factorial = factorial * i;
		}

		System.out.println("결과값 : " + factorial);

		sc.close();

	}

}
