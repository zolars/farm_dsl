import uk.ac.kcl.farm.library.*

public class TestFarm {

	public static void main (String[] args) {
		FarmFrame tf = new FarmFrame();
		
		Farm t = new Farm(tf) {
			@Override
			protected void run() {
				
				for (int i0 = 0; i0 < (10 + 3) * 7; i0++) {
					
					moveForward(10);
					rotate(-90.0);
					moveBackward(10);
					rotate(20.0);
				}
			}
		};
		
		t.run();
	}
}
