package tt;

public class psvm {
	public static void main(String[] args) {
//		Rnd rng = new Rnd();
//	    for(int i=0; i<100; i++)
//	    {
//	        System.out.println(rng.random());
//	    }
//	    System.out.println("Count: "+rng.getCount());
//	
//	    rng.reset();
//	
//	    for(int i=0; i<105; i++)
//	    {
//	        System.out.println(rng.random());
//	    }
//	    System.out.println("Count: "+rng.getCount());
//	    
//	    calcPi cp = new calcPi();
//	    cp.calc();
	    
		voxelGrid vg = new voxelGrid(20,20,20);
		vg.fillLattice();
		vg.outputWRL("/Users/mm/Desktop/test.wrl");
	    
	}
     // default seed of 0.1 gets set 


}
