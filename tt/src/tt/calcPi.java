package tt;
/*
 * numThrowsInsideCircle/numThrowsTotal = area of circle/area of square = pi*r*r/(2*r*2*r) = pi/4
pi = 4.0*numThrowsInsideCircle/numThrowsTotal


int nThrows = 100000000;
int nInsideCircle=0;
start a random # generator (of type Rnd - the class you wrote!)
loop for nThrows:
  x = -1..1 randomly
  y = -1..1 randomly
  IF the throw (x,y) lands inside the circle (of radius=1) 
  [if distance between 0,0 and x,y is less than 1],
    increment nInsideCircle
next
pi = 4*....
print pi
 */
public class calcPi {
	
	public final int nThrows = 1000000;
	public static int nInsideCircle = 0;
	
	
	public double PositiveOrNegative(double PON){
		Rnd pon = new Rnd();
		if(pon.random()>0.5)
			return PON;
		else
			return (-1)*PON;
	}
	
	public double calc(){
		double pi=0;
		double x;
		double y;
		Rnd rnd = new Rnd();
		for(int i=0;i<nThrows;i++){
			
			x=rnd.random();
			x=PositiveOrNegative(x);
			y=rnd.random();
			y=PositiveOrNegative(y);
			
			if(Math.sqrt((Math.pow(x,2)+Math.pow(y,2)))<1)
				nInsideCircle++;	
			
		}
		
		pi = 4.0*nInsideCircle/nThrows;
		System.out.println("Pi is " + pi);
		return pi;
	}

}
