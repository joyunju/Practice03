//정수 다섯개를 입력받아 가장 큰 수를 출력하세요.

package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		// 입력을 받기 위해 Scanner 클래스 사용
		System.out.print("숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("숫자 : ");
		int num2 = sc.nextInt();
		System.out.print("숫자 : ");
		int num3 = sc.nextInt();
		System.out.print("숫자 : ");
		int num4 = sc.nextInt();
		System.out.print("숫자 : ");
		int num5 = sc.nextInt();
		
		//최대값을 저장할 변수 설정 
		int max;

		if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
			max = num1;
		} else if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {
			max = num2;
		} else if (num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5) {
			max = num3;
		} else if (num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5) {
			max = num4;
		} else {
			max = num5;
		}
		
		//최대값 출력 
		System.out.println("최대값은 " + max + "입니다.");

		sc.close();
	}
}
