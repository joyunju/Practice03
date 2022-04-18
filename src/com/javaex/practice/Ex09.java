//Ex09 다음과 같이 출력하세요 (간격은 탭(\t) 사용)

package com.javaex.practice;

public class Ex09 {
	public static void main(String[] args) {

		// y는 1이 초기값; 10까지 1씩 증가하기
		// 이 for문이 한번 돌때 한줄 생성 
		for (int y = 1; y <= 10; y++) {

			// x는 y의 값이 초기값; x+10까지 1씩 증가
			for (int x = y; x < y + 10; x++) {
				System.out.print(x);
				System.out.print('\t'); // 하나씩 탭으로 띄기
			}
			// 줄바꿈
			System.out.println("");

		}
	}
}
