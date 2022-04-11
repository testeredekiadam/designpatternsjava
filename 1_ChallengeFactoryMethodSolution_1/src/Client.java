
public class Client {
	public static void main(String[] args) throws Exception {
	AnimalFactory animalFactory = new ConcreteFactory();
	
	Animal animal1 = animalFactory.getAnimalType("Duck");
	
	
	animal1.speak();
	
	Animal animal2 = animalFactory.getAnimalType("Not Duck");
	animal2.speak();
	}
}
