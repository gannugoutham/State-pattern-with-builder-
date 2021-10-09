package builder;

public abstract class BackPackBuilder {
	
	String builderName;
	 BackPackType backPackType ;
	 Backpack backpack = new Backpack();
 
	// Each method in the Builder returns the Builder so we can use the Fluent Interface Pattern
	public abstract BackPackBuilder addFabric();
	public abstract BackPackBuilder addZips();
	public abstract BackPackBuilder addColor();

	public Backpack build() {
		System.out.println("Build the backpack!");
		// Very simple build -- just return the house!
		// We've added all the parts... 
		// In a real build, we'd have to nail and screw everything together of course.
		// And add wiring and so on.
		return backpack;
	}
	public String getBuilderName() {
		return builderName;
	}
	public void setBuilderName(String builderName) {
		this.builderName = builderName;
	}
	public BackPackType getBackPackType() {
		return backPackType;
	}
	public void setBackPackType(BackPackType backPackType) {
		this.backPackType = backPackType;
	}

}
