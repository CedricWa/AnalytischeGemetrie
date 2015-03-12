
public class matrix {
	double [][] meineMatrix;
	public matrix(double a, double b, double c, double d, double e, double f, double g, double h, double i){
		meineMatrix = new double [3][3];

		meineMatrix[0][0] = a;
		meineMatrix[0][1] = b;
		meineMatrix[0][2] = c;
		meineMatrix[1][0] = d;
		meineMatrix[1][1] = e;
		meineMatrix[1][2] = f;
		meineMatrix[2][0] = g;
		meineMatrix[2][1] = h;
		meineMatrix[2][2] = i;
	}

	/*Matrix hat die Form:
	 *a b c 
	 *d e f
	 *g h j  
	 */	
	

	public boolean gauss(){
		int zeile = -1;

		//a,d,g ungleich 0?
		int temp = 0;
		while(zeile == -1){		
			if(meineMatrix[temp][0] != 0){
				zeile = temp;
			}
			temp++;
		}

		//0. Spalte von "Zeile" auf 1 bringen, durch dividieren aller drei Spalten durch die 1. Spalte
		meineMatrix[zeile][1]= meineMatrix[zeile][1]/meineMatrix[zeile][0];
		meineMatrix[zeile][2]= meineMatrix[zeile][2]/meineMatrix[zeile][0];
		meineMatrix[zeile][0]= meineMatrix[zeile][0]/meineMatrix[zeile][0];

		//Die Ÿbrigen beiden Zeilen auf 0 bringen.
		
		//FŸr den Fall das die 1. Zeile auf 1 gebracht wurde werden die 2. und 3. Zeile auf 0 gebracht:
		if(zeile == 0){
			if(meineMatrix[1][0] >= 0){
				double zahl;
				zahl = meineMatrix[1][0];
				meineMatrix[1][0] = meineMatrix[1][0]-(zahl*meineMatrix[zeile][0]);
				meineMatrix[1][1] = meineMatrix[1][1]-(zahl*meineMatrix[zeile][1]);
				meineMatrix[1][2] = meineMatrix[1][2]-(zahl*meineMatrix[zeile][2]);
			}
			if(meineMatrix[1][0] < 0){
				double zahl;
				zahl = meineMatrix[1][0] * -1;
				meineMatrix[1][0] = meineMatrix[1][0]+(zahl*meineMatrix[zeile][0]);
				meineMatrix[1][1] = meineMatrix[1][1]+(zahl*meineMatrix[zeile][1]);
				meineMatrix[1][2] = meineMatrix[1][2]+(zahl*meineMatrix[zeile][2]);
			}
			
			if(meineMatrix[2][0] >= 0){
				double zahl;
				zahl = meineMatrix[2][0];
				meineMatrix[2][0] = meineMatrix[2][0]-(zahl*meineMatrix[zeile][0]);
				meineMatrix[2][1] = meineMatrix[2][1]-(zahl*meineMatrix[zeile][1]);
				meineMatrix[2][2] = meineMatrix[2][2]-(zahl*meineMatrix[zeile][2]);
			}
			if(meineMatrix[2][0] < 0){
				double zahl;
				zahl = meineMatrix[2][0] * -1;
				meineMatrix[2][0] = meineMatrix[2][0]+(zahl*meineMatrix[zeile][0]);
				meineMatrix[2][1] = meineMatrix[2][1]+(zahl*meineMatrix[zeile][1]);
				meineMatrix[2][2] = meineMatrix[2][2]+(zahl*meineMatrix[zeile][2]);
			}
		}
		
		//FŸr den Fall das die 2. Zeile auf 1 gebracht wurde werden die 1. und 3. Zeile auf 0 gebracht:
		if(zeile == 1){
			if(meineMatrix[0][0] >= 0){
				double zahl;
				zahl = meineMatrix[0][0];
				meineMatrix[0][0] = meineMatrix[0][0]-(zahl*meineMatrix[zeile][0]);
				meineMatrix[0][1] = meineMatrix[0][1]-(zahl*meineMatrix[zeile][1]);
				meineMatrix[0][2] = meineMatrix[0][2]-(zahl*meineMatrix[zeile][2]);
			}
			if(meineMatrix[0][0] < 0){
				double zahl;
				zahl = meineMatrix[0][0] * -1;
				meineMatrix[0][0] = meineMatrix[0][0]+(zahl*meineMatrix[zeile][0]);
				meineMatrix[0][1] = meineMatrix[0][1]+(zahl*meineMatrix[zeile][1]);
				meineMatrix[0][2] = meineMatrix[0][2]+(zahl*meineMatrix[zeile][2]);
			}
			
			if(meineMatrix[2][0] >= 0){
				double zahl;
				zahl = meineMatrix[2][0];
				meineMatrix[2][0] = meineMatrix[2][0]-(zahl*meineMatrix[zeile][0]);
				meineMatrix[2][1] = meineMatrix[2][1]-(zahl*meineMatrix[zeile][1]);
				meineMatrix[2][2] = meineMatrix[2][2]-(zahl*meineMatrix[zeile][2]);
			}
			if(meineMatrix[2][0] < 0){
				double zahl;
				zahl = meineMatrix[2][0] * -1;
				meineMatrix[2][0] = meineMatrix[2][0]+(zahl*meineMatrix[zeile][0]);
				meineMatrix[2][1] = meineMatrix[2][1]+(zahl*meineMatrix[zeile][1]);
				meineMatrix[2][2] = meineMatrix[2][2]+(zahl*meineMatrix[zeile][2]);
			}
		}
		
		//FŸr den Fall das die 3. Zeile auf 1 gebracht wurde muss nichts gemacht werden, 
		//da dies nur passiert wenn die 1. &2. Zeile bereits 0 sind.

		
		temp = 0;
		int zeile2 = -1;
		while(zeile2 == -1){
			if(meineMatrix[temp][1] != 0 && temp!= zeile){
				zeile2 = temp;
				
			}
			temp++;
		}
		
		
		
		meineMatrix[zeile2][2]= meineMatrix[zeile2][2]/meineMatrix[zeile2][1];
		meineMatrix[zeile2][1]= meineMatrix[zeile2][1]/meineMatrix[zeile2][1];
		
		
		if(zeile2 == 0){
			if(meineMatrix[1][1] >= 0){
				double zahl;
				zahl = meineMatrix[1][1];
				meineMatrix[1][1] = meineMatrix[1][1]-(zahl*meineMatrix[zeile2][1]);
				meineMatrix[1][2] = meineMatrix[1][2]-(zahl*meineMatrix[zeile2][2]);
			}
			if(meineMatrix[1][1] < 0){
				double zahl;
				zahl = meineMatrix[1][1]*-1;
				meineMatrix[1][1] = meineMatrix[1][1]+(zahl*meineMatrix[zeile2][1]);
				meineMatrix[1][2] = meineMatrix[1][2]+(zahl*meineMatrix[zeile2][2]);
			}
			if(meineMatrix[2][1] >= 0){
				double zahl;
				zahl = meineMatrix[2][1];
				meineMatrix[2][1] = meineMatrix[2][1]-(zahl*meineMatrix[zeile2][1]);
				meineMatrix[2][2] = meineMatrix[2][2]-(zahl*meineMatrix[zeile2][2]);
			}
			if(meineMatrix[2][1] < 0){
				double zahl;
				zahl = meineMatrix[2][1]*-1;
				meineMatrix[2][1] = meineMatrix[2][1]+(zahl*meineMatrix[zeile2][1]);
				meineMatrix[2][2] = meineMatrix[2][2]+(zahl*meineMatrix[zeile2][2]);
			}
		}
		
		if(zeile2 == 1){
			if(meineMatrix[0][1] >= 0){
				double zahl;
				zahl = meineMatrix[0][1];
				meineMatrix[0][1] = meineMatrix[0][1]-(zahl*meineMatrix[zeile2][1]);
				meineMatrix[0][2] = meineMatrix[0][2]-(zahl*meineMatrix[zeile2][2]);
			}
			if(meineMatrix[0][1] < 0){
				double zahl;
				zahl = meineMatrix[0][1]*-1;
				meineMatrix[0][1] = meineMatrix[0][1]+(zahl*meineMatrix[zeile2][1]);
				meineMatrix[0][2] = meineMatrix[0][2]+(zahl*meineMatrix[zeile2][2]);
			}
			if(meineMatrix[2][1] >= 0){
				double zahl;
				zahl = meineMatrix[2][1];
				meineMatrix[2][1] = meineMatrix[2][1]-(zahl*meineMatrix[zeile2][1]);
				meineMatrix[2][2] = meineMatrix[2][2]-(zahl*meineMatrix[zeile2][2]);
			}
			if(meineMatrix[2][1] < 0){
				double zahl;
				zahl = meineMatrix[2][1]*-1;
				meineMatrix[2][1] = meineMatrix[2][1]+(zahl*meineMatrix[zeile2][1]);
				meineMatrix[2][2] = meineMatrix[2][2]+(zahl*meineMatrix[zeile2][2]);
			}
		}
		
		for(int i = 0; i<3; i++){
			for(int k = 0; k<3; k++){
				meineMatrix[i][k] = Math.round(meineMatrix[i][k]*100)/100.0; 
			}
		}
		
		for(int i= 0; i<3; i++){
			if(meineMatrix[i][0] == 0 && meineMatrix[i][1] == 0 && meineMatrix[i][2] != 0){
				return false;
			}
		}
		return true;
	}
	
	
	
	
	public double getA() {
		return meineMatrix[0][0];
	}
	public double getB() {
		return meineMatrix[0][1];
	}
	public double getC() {
		return meineMatrix[0][2];
	}
	public double getD() {
		return meineMatrix[1][0];
	}
	public double getE() {
		return meineMatrix[1][1];
	}
	public double getF() {
		return meineMatrix[1][2];
	}
	public double getG() {
		return meineMatrix[2][0];
	}
	public double getH() {
		return meineMatrix[2][1];
	}
	public double getI() {
		return meineMatrix[2][2];
	}
	public String toString(){
		return meineMatrix[0][0] + " " + meineMatrix[0][1] + " " + meineMatrix[0][2] + "\n" +
			   meineMatrix[1][0] + " " + meineMatrix[1][1] + " " + meineMatrix[1][2] + "\n" +
			   meineMatrix[2][0] + " " + meineMatrix[2][1] + " " + meineMatrix[2][2];
	}

}
