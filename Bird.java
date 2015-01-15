package AnimalHierarchy;

public abstract class Bird extends Animal{
	public Bird(String kind, String appearance){
		super(kind, appearance);
	}
	@Override
	public void eat(){
		System.out.println("It eats seeds and insects.");
	};
	@Override
	public void move(){
		System.out.println("It flies through the air.");
	};
}
