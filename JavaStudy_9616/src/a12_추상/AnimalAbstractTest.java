package a12_추상;

public class AnimalAbstractTest {

	public static void main(String[] args) {
		Animal human = new Human();
		Animal Tiger = new Tiger();
		Animal Eagle = new Eagle();
		
		human.move();
		Tiger.move();
		Eagle.move();

	}

}
