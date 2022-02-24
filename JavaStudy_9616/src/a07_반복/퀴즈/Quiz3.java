package a07_반복.퀴즈;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = 0;
		
		System.out.println("반복 입력 횟수 ");
		num= scanner.nextInt();
		
		for(int i = 1; i < num; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.println("*");
			}
			System.out.println();
		}

	}

}
