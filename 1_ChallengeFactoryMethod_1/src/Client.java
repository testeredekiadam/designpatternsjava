
public class Client {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		
		Animal tiger = animalFactory.getAnimalType("tiger");
		tiger.eat();
		tiger.walk();
		System.out.println();
		Animal duck = animalFactory.getAnimalType("duck");
		duck.eat();
		duck.walk();
	}
}
