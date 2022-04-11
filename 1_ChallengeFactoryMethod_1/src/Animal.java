interface Animal {
	public void eat();
	public void walk();
}

class Duck implements Animal{

	@Override
	public void eat() {
		System.out.println("Duck eats.");
		
	}

	@Override
	public void walk() {
		System.out.println("Duck walks.");
	}
	
}


class Tiger implements Animal{

	@Override
	public void eat() {
		System.out.println("Tiger eats.");
		
	}

	@Override
	public void walk() {
		System.out.println("Tiger walks.");
	}
	
}