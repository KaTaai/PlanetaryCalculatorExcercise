package CalculatePlanetyStuff;

public class Planet {
	private String name;
	private long radius;
	private long avgDensity;
	
	Planet(String name, long radius, long avgDensity){
		this.name=name;
		this.radius=radius;
		this.avgDensity=avgDensity;
	}
	
	public String getName(){return name;}
	
	public long getRadius(){return radius;}
	
	public long getAvgDensity(){return avgDensity;}
	
}
