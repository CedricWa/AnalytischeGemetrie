
public class punkt extends rechenobjekt{
	private double xKoord;
	private double yKoord;
	private double zKoord;
	public punkt(double xKoord, double yKoord, double zKoord) {
		this.xKoord = xKoord;
		this.yKoord = yKoord;
		this.zKoord = zKoord;
	}
	
	public void setValue(double pxKoord, double pyKoord, double pzKoord){
		pxKoord = xKoord;
		pyKoord = yKoord;
		pzKoord = zKoord;
	}
	
	public double getyKoord() {
		return yKoord;
	}
	
	public double getzKoord() {
		return zKoord;
	}
	
	public double getxKoord() {
		return xKoord;
	}
	
	public void getKoord(){
		System.out.println();
	}
	
	public String toString(){
		return getxKoord()+"/" + getyKoord() + "/" + getzKoord();
		
	}
	
	public boolean vergleiche(punkt p1){
		if(getxKoord() == p1.getxKoord() && getyKoord() == p1.getyKoord() && getzKoord() == p1.getzKoord()){
			return true;
		}else{
			return false;
		}
	}
	
	public vektor convertToVektor(){
		vektor newVektor = new vektor(getxKoord(), getyKoord(), getzKoord());
		return newVektor;
	}
	
}
