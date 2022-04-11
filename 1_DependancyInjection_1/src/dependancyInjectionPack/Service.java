package dependancyInjectionPack;

public interface Service {
	void write(String message);
}

class ServiceA implements Service {

	@Override
	public void write(String message) {
		System.out.println("Hello world");
	}
	
}

