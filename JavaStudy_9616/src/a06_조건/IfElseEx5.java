package a06_조건;

import java.util.Scanner;

public class IfElseEx5 {

	public static void main(String[] args) {
		/*
		 * 점수를 입력받아서 해당 점수가 몇등급인지 출력하는 문제
		 * 
		 * 점수를 입력해주세요:85
		 * 
		 * 학생의 평점은 B학점입니다.
		 * 
		 * 점수는 0 ~ 100사이만 입력이 가능
		 * 그외의 값이 들어왔을 때는
		 * 점수는 0 ~ 100사이만 입력이 가능합니다. 출력
		 * 
		 * 90 ~ 100 A
		 * 80 ~ 89 B
		 * 70 ~ 79 C
		 * 60 ~ 69 D
		 * 0 ~ 59 F
		 */
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		String grade = null;

		System.out.println("점수를 입력해주세요: ");
		score = scanner.nextInt();
		
		if(0 > score || 100 < score){
			System.out.println("점수는 0 ~ 100사이만 입력이 가능합니다.");
		}else if(89 < score){
			grade = "A";
		}else if(79 < score){
			
			grade = "B";
		}else if(69 < score){
			
			grade = "C";
		}else if(59 < score){
			
			grade = "D";
		}else {
			grade = "F";
				}
			System.out.println("학생의 평점은 "+ grade + "학점입니다.");
		}

	}


