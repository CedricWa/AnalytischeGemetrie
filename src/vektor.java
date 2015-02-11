
public class vektor extends rechenobjekt{
	
	private double xKoord;
	private double yKoord;
	private double zKoord;
	
	
	public vektor(double xKoord, double yKoord, double zKoord) {
		super();
		this.xKoord = xKoord;
		this.yKoord = yKoord;
		this.zKoord = zKoord;
	}
	
	public void setValue(double pxKoord, double pyKoord, double pzKoord){
		pxKoord = xKoord;
		pyKoord = yKoord;
		pzKoord = zKoord;
	}
	


	public double getxKoord() {
		return xKoord;
	}

	public double getyKoord() {
		return yKoord;
	}

	public double getzKoord() {
		return zKoord;
	}
	
	
	
	
}
