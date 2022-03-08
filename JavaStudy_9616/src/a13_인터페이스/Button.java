package a13_인터페이스;

public interface Button {
	public void onClick();
	public default void onPress() { // 추천하지않음 인터페이스의 약속을 깨는것임
		
	}

}
