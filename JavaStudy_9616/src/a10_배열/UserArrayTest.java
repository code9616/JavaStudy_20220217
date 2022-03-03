package a10_배열;

public class UserArrayTest {

	public static void main(String[] args) {
		User[] users = new User[5];
		
		users[0] = new User("jihun", "1234");
		users[1] = new User("jihun1", "12341");
		users[2] = new User("jihun2", "12342");
		users[3] = new User("jihun3", "12343");
		users[4] = new User("jihun4", "12344");
		
		for(int i = 0; i < users.length; i++) {
//			if(users[i] !=null) {
//			users[i].showInfo();
			if(users[i] ==null){
				continue;
		}
			users[i].showInfo();
	}
		
		System.out.println("=============================");

		int[] numbers = new int[5];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(users[i]);
		}
	}

}
