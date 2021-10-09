package state;

public class BackPackState implements State {

	@Override
	public void buildBackPack() {


		System.out.println("Building a backkpacks ");
		
	}

	@Override
	public void addZip() {
		System.out.println("Adding a zip to  a backkpacks ");
		
	}

	@Override
	public void addColor() {
		System.out.println("Adding a Color to  a backkpacks ");
		
	}

	@Override
	public void loadThings() {
		 
		System.out.println("loading into some items ");
		
	}

	@Override
	public void emptyBag() {

		System.out.println("removing the items from bag");
		
	}

}
