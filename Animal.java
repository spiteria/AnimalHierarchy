package AnimalHierarchy;

abstract public class Animal implements Countable {
	private String kind, appearance;
	public Animal(String kind, String appearance){
		this.kind = kind;
		this.appearance = appearance;
	}
	public abstract void eat();
	public abstract void move();
	@Override
	public	String toString(){
		return "This animal is a "+kind+". "+appearance+".";
	}
	@Override
	public String getID(){
		return kind;
	}
}
