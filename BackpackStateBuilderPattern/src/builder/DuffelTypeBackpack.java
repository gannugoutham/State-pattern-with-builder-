package builder;

public class DuffelTypeBackpack extends BackPackBuilder {
	
	
	BackPackBuilder b = null;
	

	@Override
	public BackPackBuilder addFabric() {

		  b = new DuffelTypeBackpack();

		b.addFabric();

		System.out.println("Adding fabric to the bag");

		return b;
	}

	@Override
	public BackPackBuilder addZips() {
		  b = new DuffelTypeBackpack();

		b.addZips();

		System.out.println("Adding zips to the bag");
		return b;
	}

	@Override
	public BackPackBuilder addColor() {
		  b = new DuffelTypeBackpack();

		b.addColor();

		System.out.println("Adding color to the bag");
		return b;
	}

}
