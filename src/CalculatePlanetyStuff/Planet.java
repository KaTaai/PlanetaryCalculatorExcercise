package CalculatePlanetyStuff;

public class Planet {
	private String name;
	private double radius;
	private double avgDensity;
	
	Planet(String name, double radius, double avgDensity){
		this.name=name;
		this.radius=radius;
		this.avgDensity=avgDensity;
	}
	
	public String getName(){return name;}
	
	public double getRadius(){return radius;}
	
	public double getAvgDensity(){return avgDensity;}
	
}
