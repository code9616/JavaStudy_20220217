package a06_조건;

import java.util.Scanner;

public class IfElseEx3 {

	public static void main(String[] args) {
		/*
		 * 하나의 수를 입력받아 그 수가 홀수인지 짝수인지를 판별
		 * 하지만 0은 0입니다로 출력
		 * 
		 * 수를 입력해주세요: 3
		 * 
		 * 홀수입니다.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		int result = 0;
		
		System.out.print("수를 입력해주세요: ");
		x = scanner.nextInt();
		
		if(x==0) {
			result = 0;
			System.out.println("0입니다.");
		}else {
			if(x % 2 == 0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}

	}

}
