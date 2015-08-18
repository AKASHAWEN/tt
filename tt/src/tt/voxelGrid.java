package tt;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class voxelGrid {
	  public static int xRes=10, yRes=10, zRes=10;
	  public static double[][][] lattice ; // a 3D array 
	  Rnd rng = new Rnd();
	  
	  public voxelGrid(){
		  lattice = new double[xRes][yRes][zRes];
	  }
	  public voxelGrid(int x, int y, int z){
		  xRes = x;
		  yRes = y;
		  zRes = z;
		  lattice = new double [x][y][z];		  
	  }
	  
	  public void fillLattice(){
		  for(int i=0;i<xRes;i++){
			  for(int j=0;j<yRes;j++){
				  for(int k=0;k<zRes;k++){
					  
					  lattice[i][j][k]=rng.random();
				  }
			  }
		  }
	  }
	  
	  public void outputWRL(String location){
		  FileWriter fw;
		  try{
			  fw = new FileWriter(new File(location));
			  fw.write(xRes);
			  fw.write(yRes);
			  fw.write(zRes);
			  for(int i=0;i<xRes;i++){
				  for(int j=0;j<yRes;j++){
					  for(int k=0;k<zRes;k++){
						  
						  fw.write(Double.toString(lattice[i][j][k]));
					  }
				  }
			  }
			  
		  }catch(IOException ex){
			  ex.printStackTrace();
		  }
		  System.out.println("writing down");
	  }
}
