package builder;

public class LaptopTypeBackpack extends BackPackBuilder {
	
	
	BackPackBuilder b = null;
	

	@Override
	public BackPackBuilder addFabric() {

		  b = new LaptopTypeBackpack();

		b.addFabric();

		System.out.println("Adding fabric to the bag");

		return b;
	}

	@Override
	public BackPackBuilder addZips() {
		  b = new LaptopTypeBackpack();

		b.addZips();

		System.out.println("Adding zips to the bag");
		return b;
	}

	@Override
	public BackPackBuilder addColor() {
		  b = new LaptopTypeBackpack();

		b.addColor();

		System.out.println("Adding color to the bag");
		return b;
	}

}
