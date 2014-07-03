package CalculatePlanetyStuff;

public class Functions {
	private static final double G=6.67*Math.pow(10,-11);
	
	public static double weightVD(double volume,double density){
		return volume*density;
	}
	
	public static double force(double m1,double m2, double deltaD){
		
		return G*(double)(m1*m2)/Math.pow(deltaD,2);
	}
	
	public static double volume(double radius){
		return (4.0/3.0)*Math.PI*Math.pow(radius,3);
	}
}
