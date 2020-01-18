package main;

import java.util.Scanner;

public class VirtualPet2App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("** Welcome to Virtual Pet Edition 2!! **\n");
		System.out.println("What would you like to name your pet?\n");
		String name = input.next();
		System.out.println("How would describe your pet?");
		String description = input.next();
		
		VirtualPet2 virtualPet = new VirtualPet2(name,description);
		
		System.out.println("This is your pet:\n");
		System.out.println(virtualPet.getName()+ "" + virtualPet.getDescription());
		
		
		int userOptions = 0;
		
		
		while(userOptions !=4) {
			System.out.println("What would you like to do with your pet?\n");
			userOptions = input.nextInt();
		}
		

	}

}
