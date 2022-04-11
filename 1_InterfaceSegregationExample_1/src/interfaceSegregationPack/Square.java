package interfaceSegregationPack;

public class Square implements ShapeInterface, ManageShapeInterface {

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return this.area();
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 2.0;
	}
	
}
