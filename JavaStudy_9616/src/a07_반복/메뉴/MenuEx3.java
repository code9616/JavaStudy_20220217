package a07_반복.메뉴;

import java.util.Scanner;

public class MenuEx3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char select = ' ';
		
		while(true) {
			System.out.println("[사용자 폴더");
			System.out.println("1. 바탕화면");
			System.out.println("2. 문서");
			System.out.println("q. 프로그램 종료");
			System.out.println("==========================");
			System.out.print("명령 선택: ");
			select = scanner.next().charAt(0);
			
			if(select == '1') {
			}else if(select == '2') {
				
			}else if(select == 'q') {
				System.out.println("프로그램 종료중...");
				break;
			}else {
				System.out.println("해당 폴더는 존재하지 않습니다.");
			}System.out.println("--------------------------");
		}
	}

}
