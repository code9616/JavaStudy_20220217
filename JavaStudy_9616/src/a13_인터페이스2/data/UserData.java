package a13_인터페이스2.data;

import a13_인터페이스2.model.User;

public class UserData {
	private User[] user;
	
	public UserData() {
		// TODO Auto-generated constructor stub
	}

	public UserData(User[] user) {
		super();
		this.user = user;
	}

	public User[] getUser() {
		return user;
	}

	public void setUser(User[] user) {
		this.user = user;
	}

	public void showUsers() {
		for(int i = 0; i < users.length; i++) {
			users[i].showUser();
		}
	}
}
