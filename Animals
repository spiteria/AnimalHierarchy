package AnimalHierarchy;

public class Animals extends Census{
	public static void main(String[] args){
		Animal[] animals = new Animal[] {new AmericanRobin(), new AmericanRobin(), new DomesticCanary(), new SockeyeSalmon(), new RainbowTrout(), new RainbowTrout()}; 
		for (int i = 0; i < animals.length; ++i){
			System.out.println(animals[i]);
			animals[i].eat();
			animals[i].move();
			update(animals[i].getID());
		}
		for(int i = 0; i < SIZE; ++i){
			System.out.println(get(i));
		}
	}
}
