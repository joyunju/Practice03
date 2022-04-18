//아래의 출력결과를 예상하여 작성하세요.

package com.javaex.practice;

public class Ex05 {
	public static void main(String[] args) {

		int i = 1;
		boolean flag = true;

		while (flag) {
			if (i >= 5) {
				flag = false;
			}
			System.out.println(i);
			i = i + 1;
		}
	}
}
