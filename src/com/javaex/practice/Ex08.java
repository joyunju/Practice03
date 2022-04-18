// 아래와 같이 구구단을 출력하세요 
package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		
		for(int y=1; y<=9; y++) {
			for(int x=2; x<=9; x++) {
				System.out.print(x + "*" + y + "=" + (y*x));
				System.out.print('\t'); // 하나씩 탭으로 띄기
			}
			//줄바꿈 
			System.out.println("");
		}
	}
}
