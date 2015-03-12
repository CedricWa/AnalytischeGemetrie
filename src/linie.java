
public class linie {
	private vektor meinoV;
	private vektor meinrV;

	public linie(punkt pMeinPunkt, vektor pMeinVektor){
		meinoV = pMeinPunkt.convertToVektor();
		meinrV = pMeinVektor;
	}

	public punkt parameter(double k){
		vektor ergebniss;
		ergebniss = getMeinoV().addiere(getMeinrV().multipliziere(k));
		return ergebniss.convertToPunkt();
	}



	public boolean istAufLinie(punkt p1){
		double x,y,z;
		x= p1.getxKoord();
		y= p1.getyKoord();
		z= p1.getzKoord();

		double r1,r2,r3;

		r1 = (x - getMeinoV().getxRichtung()) / getMeinrV().getxRichtung();
		r2 = (y - getMeinoV().getyRichtung()) / getMeinrV().getyRichtung();
		r3 = (z - getMeinoV().getzRichtung()) / getMeinrV().getzRichtung();
		if(getMeinrV().getxRichtung()!= 0){
			if(getMeinrV().getyRichtung()!= 0){
				if(getMeinrV().getzRichtung() != 0){
					if(r1 == r2 && r2==r3){
						return true;
					}else{
						return false;
					}
				}else{
					if(r1 == r2){
						if(getMeinoV().getzRichtung()== z){
							return true;
						}else{
							return false;
						}
					}else{
						return false;
					}
				}
			}else{
				if(getMeinrV().getzRichtung() != 0){
					if(r1==r3){
						if(getMeinoV().getyRichtung()== y){
							return true;
						}else{
							return false;
						}
					}else{
						return false;
					}
				}else{
					if(parameter(r1).vergleiche(p1)){
						return true;
					}else{
						return false;
					}
				}
			}
		}else{
			if(getMeinrV().getyRichtung() != 0){
				if(getMeinrV().getzRichtung() != 0){
					if(r2== r3){
						if(getMeinoV().getxRichtung()== x){
							return true;
						}else{
							return false;
						}
					}else{
						return false;
					}
				}else{
					if(parameter(r2).vergleiche(p1)){
						return true;
					}else{
						return false;
					}
				}
			}else{
				if(getMeinrV().getzRichtung()!= 0){
					if(parameter(r3).vergleiche(p1)){
						return true;
					}else{
						return false;
					}
				}else{
					if(p1.vergleiche(getMeinoV().convertToPunkt())){
						return true;
					}else{
						return false;
					}
				}
			}
		}
	}


	public double gibParameter(punkt p1){
		double x,y,z;
		x= p1.getxKoord();
		y= p1.getyKoord();
		z= p1.getzKoord();

		double r1,r2,r3;

		r1 = (x - getMeinoV().getxRichtung()) / getMeinrV().getxRichtung();
		r2 = (y - getMeinoV().getyRichtung()) / getMeinrV().getyRichtung();
		r3 = (z - getMeinoV().getzRichtung()) / getMeinrV().getzRichtung();
		if(getMeinrV().getxRichtung()!= 0){
			if(getMeinrV().getyRichtung()!= 0){
				if(getMeinrV().getzRichtung() != 0){
					if(r1 == r2 && r2==r3){
						return r1;
					}else{
						return (Double) null;
					}
				}else{
					if(r1 == r2){
						if(getMeinoV().getzRichtung()== z){
							return r1;
						}else{
							return (Double) null;
						}
					}else{
						return (Double) null;
					}
				}
			}else{
				if(getMeinrV().getzRichtung() != 0){
					if(r1==r3){
						if(getMeinoV().getyRichtung()== y){
							return r1;
						}else{
							return (Double) null;
						}
					}else{
						return (Double) null;
					}
				}else{
					if(parameter(r1).vergleiche(p1)){
						return r1;
					}else{
						return (Double) null;
					}
				}
			}
		}else{
			if(getMeinrV().getyRichtung() != 0){
				if(getMeinrV().getzRichtung() != 0){
					if(r2== r3){
						if(getMeinoV().getxRichtung()== x){
							return r2;
						}else{
							return (Double) null;
						}
					}else{
						return (Double) null;
					}
				}else{
					if(parameter(r2).vergleiche(p1)){
						return r2;
					}else{
						return (Double) null;
					}
				}
			}else{
				if(getMeinrV().getzRichtung()!= 0){
					if(parameter(r3).vergleiche(p1)){
						return r3;
					}else{
						return (Double) null;
					}
				}else{
					if(p1.vergleiche(getMeinoV().convertToPunkt())){
						return 0;
					}else{
						return (Double) null;
					}
				}
			}
		}
	}


	public String toString(){
		return meinoV.getxRichtung() + "\t" + "\t" + meinrV.getxRichtung() + "\n" +
				meinoV.getyRichtung() + "\t" + "* " + "k" + "\t" + meinrV.getyRichtung() + "\n" + 
				meinoV.getzRichtung() + "\t" + "\t" + meinrV.getzRichtung();
	}


	public vektor getMeinoV() {
		return meinoV;
	}


	public vektor getMeinrV() {
		return meinrV;
	}

	//Lagebeziehungen
	public boolean identisch(linie l1){
		boolean oV = false;
		if(istAufLinie(l1.getMeinoV().convertToPunkt())){
			oV = true;
		}

		if(oV && parallel(l1)){
			return true;
		}else{
			return false;
		}
	}

	public boolean parallel(linie l1){	
		if(getMeinrV().vielfache(l1.getMeinrV())){
			return true;
		}else{
			return false;
		}
	}





	public punkt schnittpunkt(linie l1){
		if(!parallel(l1) && !identisch(l1)){
			matrix m1 = new matrix(getMeinrV().getxRichtung(), -l1.getMeinrV().getxRichtung(),l1.getMeinoV().getxRichtung()-getMeinoV().getxRichtung(),
					getMeinrV().getyRichtung(), -l1.getMeinrV().getyRichtung(),l1.getMeinoV().getyRichtung()-getMeinoV().getyRichtung(),
					getMeinrV().getzRichtung(), -l1.getMeinrV().getzRichtung(),l1.getMeinoV().getzRichtung()-getMeinoV().getzRichtung());
			
			m1.gauss();
			double parameter1=0;
			double parameter2=0;
			
			if(m1.getA()!= 0){
				parameter1 = m1.getC();
			}
			if(m1.getD()!= 0){
				parameter1 = m1.getF();
			}
			if(m1.getG()!= 0){
				parameter1 = m1.getI();
			}
			if(m1.getB()!= 0){
				parameter2 = m1.getC();
			}
			if(m1.getE()!= 0){
				parameter2 = m1.getF();
			}
			if(m1.getH()!= 0){
				parameter2 = m1.getI();
			}
			
			return parameter(parameter1);
		}
		return null;
		
	}





}
