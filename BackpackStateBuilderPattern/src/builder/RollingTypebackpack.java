package builder;

public class RollingTypebackpack extends BackPackBuilder {
	
	
	BackPackBuilder b = null;
	

	@Override
	public BackPackBuilder addFabric() {

		  b = new RollingTypebackpack();

		b.addFabric();

		System.out.println("Adding fabric to the bag");

		return b;
	}

	@Override
	public BackPackBuilder addZips() {
		  b = new RollingTypebackpack();

		b.addZips();

		System.out.println("Adding zips to the bag");
		return b;
	}

	@Override
	public BackPackBuilder addColor() {
		  b = new RollingTypebackpack();

		b.addColor();

		System.out.println("Adding color to the bag");
		return b;
	}

}
