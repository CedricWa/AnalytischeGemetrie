
public class ausfuehrenTest {

	public static void main(String[] args) {
	
		punkt p1 = new punkt(1, 1, 1);
		punkt p2 = new punkt(2,4,4);
		vektor v1 = new vektor(3,2,1);
		vektor v2 = new vektor(-2,1,2);
		linie l1 = new linie(p1, v1);
		linie l2 = new linie(p2, v2);
		
		
		System.out.println(l1.schnittpunkt(l2));

			

	}
}
