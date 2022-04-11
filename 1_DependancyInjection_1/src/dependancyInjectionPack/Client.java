package dependancyInjectionPack;

class Client {
	private Service myService;
	
	//injects via the constructor
	
	public Client(Service service) {
		this.myService = service;
	}
	
	public void doSomething() {
		myService.write("This is a message");
	}
	
	public void setService(Service service) {
		this.myService = service;
	}
	
	public static void main(String[] args) {
		Service service = new ServiceA(); // the injector
		Client client = new Client(service); // inject via constructor
		client.doSomething();
		
		client.setService(service);
	}
	
}