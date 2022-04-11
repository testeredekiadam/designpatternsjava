package interfaceSegregationPack;

public class Cube implements ShapeInterface, SolidShapeInterface, ManageShapeInterface {

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 1.0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 1.0;
	}

	@Override
	public double calculate() {
		// TODO Auto-generated method stub
		return this.area() + this.volume();
	}

}
