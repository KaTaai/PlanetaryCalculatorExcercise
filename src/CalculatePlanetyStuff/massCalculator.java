package CalculatePlanetyStuff;

import java.util.Scanner;

public class massCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("How many kg does the object weigh?");
		int weightObject=keyboard.nextInt();
		System.out.println("How many planets are there?(>0)");
		int totalPlanets=keyboard.nextInt();
		Planet planets[]=new Planet[totalPlanets];
		System.out.println("Give the name of the planet"+(planets.length>1?"s ":" ")+"followed by its radius followed by the average density of the planet separated by spaces");
		int nameLength=0;
		for(int i=0;i<planets.length;i++){
			String name=keyboard.next();
			planets[i]=new Planet(name, keyboard.nextLong(), keyboard.nextLong());
			nameLength=Math.max(nameLength,name.length());
		}
		
		for (int i=0;i<planets.length;i++){
			double mass=Functions.force(
					weightObject,Functions.weightVD(Functions.volume(planets[i].getRadius()), planets[i].getAvgDensity()));
			System.out.printf("%-"+nameLength+"s %f",planets[i].getName(),mass);
			System.out.println();
		}
	}

}
