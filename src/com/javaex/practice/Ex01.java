//아래의 출력결과를 예상하여 작성하세요.

package com.javaex.practice;

public class Ex01 {
	public static void main(String[] args) {

		System.out.println("==while문==");

		int index = 0;
		//조건식이 참이 될 때까지 실행
		//while문과 for 반복문 비교 
		
		while (index < 3) {
			System.out.println("index = " + index);
			index++;
		}

		System.out.println("==for문==");

		for (int order = 0; order < 3; order++) {
			System.out.println("order = " + order);
		}
	}
}
