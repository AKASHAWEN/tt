package tt;

class Rnd {
	 
	  private  double last=0.1; // latest # in our sequence
	  private  double seed=0.1; // a seed value, between 0.0 and 1.0
	  private  double mpyer=309.0, adder=0.203125; // for our LCG formula
	  private  int count=0; // how many nums served so far

	  public Rnd(){
	    }
	  
	  public Rnd(double s){
	        seed = s;
	        last = s;
	    }// Rnd

	  // Rnd

	   public double random() {
	        last = mpyer*last + adder;
	        last -= (double)((int)last); // same as last %= 1.0;
	        count++;
	        return last;
	    }// random

	   public int getCount() {
	        return count;
	    }// getCount()

	   public void reset() {
	        last = seed;
	        count = 0;
	    }// reset
	}// class Rnd
