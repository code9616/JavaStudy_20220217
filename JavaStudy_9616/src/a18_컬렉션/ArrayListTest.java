package a18_컬렉션;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		ArrayList<String> strList = new ArrayList<String>(); 
		
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		strList.add("a");
		strList.add("b");
		strList.add("c");
		strList.add("d");
		strList.add("e");
		strList.add("f");

		
		System.out.println(intList.size());
		System.out.println(strList.size());
		System.out.println();
		
		for(int i = 0; i < intList.size(); i++) {
			System.out.println(intList.get(i));
		}
		System.out.println();
		for(int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println();
		for(int num : intList) {
			System.out.println(num);
		}
		System.out.println();
		for(String i : strList) {
			System.out.println(i);
		}
		strList.set(2, "q");
		strList.set(3, "q");
		strList.set(4, "q");
		
		System.out.println();
		for(String i : strList) {
			System.out.println(i);
		}
		
		//리스트가 비어있지 않으면 계속 반복하며 가장 뒤에 있는 값을 삭제
//		while(!strList.isEmpty()) {
//		strList.remove(strList.size()-1);
//		System.out.println();
//		System.out.println(strList);
//		
//		}
		//리스트에 q가 존재하면 해당 위치의 값을 삭제
		while(strList.contains("q")) {
			System.out.println(strList.remove("q"));
		}
		System.out.println(strList);
		
		if(!strList.isEmpty()) {
			strList.clear();
		}
		System.out.println(strList);

	}

}
/*
 * 자료구조: 데이터를 (저장,쓰기,읽기)하는 방법
 * 알고리즘: 데이터를 처리하는 방식, 코드를 의미 - 공식설계
 * 
 * 컬렉션 프레임워크는 자바 인터페이스를 이용하여 구현
 * 
 * 1. list : 순서가 있는 데이터 집합, 데이터 중복 허용
 * 순서가 있는 캐비넷(지정된 위치가 있다)
 * 2. set : 순서가 없는 데이터 집합, 데이터 중복 x
 * 트럼프카드(섞일수 있지만, 카드가 유일하게 한장 있어야함)
 * 3. map : 키와 값의 한쌍으로 이루어지는 데이터의 집합으로, 순서가 없음
 *  키는 중복을 허용 x 값은 중복허용 
 *  맛집(값), 기계(값)
 * 
 * list, set 컬렉션 인터페이스 상속, 컬렉션에 들어있는 메소드, 필드 내용을 상속
 * map 별도로 존재, 컬렉션과 다를 수도 있다.
 * 
 * 스레드: 동시에 처리할 수 있는 능력
 * 클럭: 데이터를 처리하는 주파수(속도)
 */


