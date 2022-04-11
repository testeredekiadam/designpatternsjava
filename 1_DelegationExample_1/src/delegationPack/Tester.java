package delegationPack;


class RealPrinter {
	//the delagate
	
	void print() {
		System.out.println("The Delegate");
	}
}


class Printer {
	//the delagator
	RealPrinter p = new RealPrinter();
	
	//create the delegate
	void print() {
		p.print(); // delegation 
	}
}

class Tester {
	//To the outside world it looks like Printer actually prints
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print();
	}
}

