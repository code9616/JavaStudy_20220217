package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * 자연수 N이 주어졌을때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		 * 반대로 출력
		 */
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.print("반복 횟수 입력");
		num = scanner.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.println(num - i);
		}
		
	}

}
