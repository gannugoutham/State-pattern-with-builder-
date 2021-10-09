package builder;

import state.BackPackState;
import state.State;

public class BackPackDirector {

	public static void main(String[] args) {
		
		
		State backpackState =  new BackPackState();
		
		backpackState.buildBackPack();
		
		backpackState.addZip();
		
		backpackState.addColor();
		
		backpackState.loadThings();
		
		backpackState.emptyBag();
		 

	}

}
