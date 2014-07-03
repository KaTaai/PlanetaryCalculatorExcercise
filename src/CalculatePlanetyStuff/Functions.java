package CalculatePlanetyStuff;

public class Functions {
	private static final double G=6.67*Math.pow(10,-11);
	
	public static int weightVD(int volume,int density){
		return volume*density;
	}
	
	public static double force(double m1,double m2, double deltaD){
		
		return G*(m1*m2)/Math.pow(deltaD,2);
	}
	
	public static double volume(double radius){
		return (4/3)*Math.PI*Math.pow(radius,3);
	}
}
