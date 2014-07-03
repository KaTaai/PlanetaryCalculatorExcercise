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
		for(int i=0;i<planets.length;i++){
			planets[i]=new Planet(keyboard.next(), keyboard.nextLong(), keyboard.nextLong());
		}
		
		System.out.println(weightObject);
	}

}
