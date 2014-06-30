package CalculatePlanetyStuff;

import java.util.Scanner;

public class massCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Give the name of the planet followed by its radius followed by the average density of the planet separated by spaces");
		Planet aarde=new Planet(keyboard.next(), keyboard.nextLong(), keyboard.nextLong());
		System.out.println(aarde.getName());
	}

}
