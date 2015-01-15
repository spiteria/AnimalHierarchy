package AnimalHierarchy;

public abstract class Fish extends Animal{
	public Fish(String kind, String appearance){
		super(kind, appearance);
	}
	@Override
	public void eat(){
		System.out.println("It eats krill, algae, and insects.");
	};
	@Override
	public void move(){
		System.out.println("It swims through the water.");
	};
}
