package builder;

public class Zip {
	
	String name;
	String material;
	
	public Zip(String material) {
		this.name = "Zip made out of " + material;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return this.name;
	}

}
