public class vektor extends rechenobjekt{
	private double xRichtung;
	private double yRichtung;
	private double zRichtung;
	private String name;
	public vektor(double xKoord, double yKoord, double zKoord) {
		super();
		this.xRichtung = xKoord;
		this.yRichtung = yKoord;
		this.zRichtung = zKoord;
	}
	
	public void setValue(double pxKoord, double pyKoord, double pzKoord){
		pxKoord = xRichtung;
		pyKoord = yRichtung;
		pzKoord = zRichtung;
	}
	
	public vektor addiere(vektor v2){
		double x, y, z;
		x = getxRichtung() + v2.getxRichtung();
		y = getyRichtung() + v2.getyRichtung();
		z = getzRichtung() + v2.getzRichtung();
		vektor ergebniss = new vektor(x,y,z);
		return ergebniss;
	}
	
	public vektor multipliziere(double t){
		double x,y,z;
		vektor ergebniss;
		
		x = getxRichtung() * t;
		y = getyRichtung() * t;
		z = getzRichtung() * t;
		
		ergebniss = new vektor(x,y,z);
		return ergebniss;
	}
	
	public double multipliziere(vektor v2){
		double Skalarprodukt =  getxRichtung()*v2.getxRichtung()
								+ getyRichtung()*v2.getyRichtung() 
								+ getzRichtung()*v2.getzRichtung();
		return Skalarprodukt;	
	}
	
	public double laenge(){
		double laenge = getxRichtung()*getxRichtung() + getyRichtung()*getyRichtung()+getzRichtung()*getzRichtung();
		laenge=  Math.sqrt(laenge);
		return laenge;
	}
	
	
	public punkt convertToPunkt(){
		punkt newPunkt = new punkt(getxRichtung(), getyRichtung(), getzRichtung());
		return newPunkt;
	}
	
	public boolean vergleiche(vektor p1){
		if(getxRichtung() == p1.getxRichtung() && getyRichtung() == p1.getyRichtung() && getzRichtung() == p1.getzRichtung()){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean vielfache(vektor v1){
		double r1 = getxRichtung()/v1.getxRichtung();
		double r2 = getyRichtung()/v1.getyRichtung();
		double r3 = getzRichtung()/v1.getzRichtung();
		
		if(getxRichtung()!= 0){
			if(getyRichtung()!= 0){
				if(getzRichtung() != 0){
					if(r1 == r2 && r2==r3){
						return true;
					}else{
						return false;
					}
				}else{
					if(r1 == r2){
						if(v1.getzRichtung()== 0){
							return true;
						}else{
							return false;
						}
					}else{
						return false;
					}
				}
			}else{
				if(getzRichtung() != 0){
					if(r1==r3){
						if(v1.getyRichtung()== 0){
							return true;
						}else{
							return false;
						}
					}else{
						return false;
					}
				}else{
					if(v1.getyRichtung() == 0 && v1.getyRichtung() == 0){
						return true;
					}else{
						return false;
					}
				}
			}
		}else{
			if(getyRichtung() != 0){
				if(getzRichtung() != 0){
					if(r2== r3){
						if(v1.getxRichtung()== 0){
							return true;
						}else{
							return false;
						}
					}else{
						return false;
					}
				}else{
					if(vergleiche(v1)){
						return true;
					}else{
						return false;
					}
				}
			}else{
				if(getzRichtung()!= 0){
					if(v1.getxRichtung() == 0 && v1.getyRichtung() == 0){
						return true;
					}else{
						return false;
					}
				}else{
					if(vergleiche(v1)){
						return true;
						//alles ist 0!
					}else{
						return false;
					}
				}
			}
		}
		
	}
	
	public double getxRichtung() {
		return xRichtung;
	}
	public double getyRichtung() {
		return yRichtung;
	}
	public double getzRichtung() {
		return zRichtung;
	}
	public String getName(){
		return name;
	}
	
	public String toString(){
		
		return getxRichtung() + "\n" + getyRichtung() +  "\n" + getzRichtung(); 
				
		
	}
}