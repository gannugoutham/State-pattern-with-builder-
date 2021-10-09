package builder;

public class Fabric {
	

	String name;
	String material;
	
	public Fabric(String material) {
		this.name = "Fabric made out of " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}

}
