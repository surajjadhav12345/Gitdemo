package paramerised_constructor;

public class PuBg {
public static void main(String[] args) {
	Guns g = new Guns("AK47",10);
	g.shoot();
	System.out.println("1st shoot is done");
	
	Guns g1= new Guns("Pistol",6);
	g1.shoot();
	System.out.println("second shot is done");
	
	Guns g2 = new Guns("Machine gun",40);
	g2.shoot();
	System.out.println("third shoot is done");
}

}