
public class AnimalFactory {

	public Animal getAnimalType(String animalType) {
		if(animalType == null)
			return null;
		
		if(animalType.equalsIgnoreCase("TIGER"))
			return new Tiger();
		else if(animalType.equalsIgnoreCase("DUCK"))
			return new Duck();
		
		return null;
	}
	
}
