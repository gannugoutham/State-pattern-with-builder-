package builder;

public class Backpack {
	
	String name;
	
	BackPackType backPackType ;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BackPackType getBackPackType() {
		return backPackType;
	}

	public void setBackPackType(BackPackType backPackType) {
		this.backPackType = backPackType;
	}
	
	public void addFabric(String name,BackPackType backPackType) {
		this.name=name;
		this.backPackType=backPackType;
		
		System.out.println("Adding Fabric to bag");
	}
	
	public void addZip() {
		System.out.println("Adding required zips to the bag");
		
	}

}
