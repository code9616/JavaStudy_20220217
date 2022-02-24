package a07_반복;

import java.util.Scanner;

public class GugudanInput {

	public static void main(String[] args) {
		/*
		 * 1. 몇 단 부터 몇 단 까지 출력할것인지 입력
		 * start index : 5
		 * end index : 8
		 * 
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int startindex = 0;
		int endindex = 0;
		
		System.out.println("시작 단: ");
		startindex = scanner.nextInt();
		System.out.println("마지막 단: ");
		endindex = scanner.nextInt();
/*
		for(int i = startindex; i < (endindex + 1); i++) {
			System.out.println(i + "단");
			for(int j = 0; j < 9;) {
				System.out.println(i + "X" + (++j) + "=" + (i * j));
				}
			System.out.println();
		}
		*/
		int i = startindex;
		
		while(i < endindex + 1) {
			System.out.println(i + "단");			
			
			int j = 0;
			
			while(j < 9) {
				System.out.println(i + "X" + (++j) + "=" + (i * j));
			}
			System.out.println();
			i++;
		}
	}

}
