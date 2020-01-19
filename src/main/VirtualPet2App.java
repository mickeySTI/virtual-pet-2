package main;

import java.util.Scanner;

public class VirtualPet2App {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("** Welcome to Virtual Pet Edition 2!! **\n");
		System.out.println("What would you like to name your pet?\n");
		String petName = input.nextLine();
		System.out.println("How would describe your pet?\n");
		String description = input.nextLine();

		VirtualPet2 virtualPet = new VirtualPet2(petName, description);

		System.out.println("This is your pet:\n");
		System.out.println(virtualPet.getName() + " " + virtualPet.getDescription());

		int userOptions = 0;

		System.out.println("Please choose between 0-5\n");
		showOptions(petName);
		System.out.println();

		while (userOptions != 5) {
			System.out.println("What would you like to do with your pet?\n");
			userOptions = input.nextInt();

			switch (userOptions) {
			case 0:
				showStatus(virtualPet);
				break;
			case 1:
				System.out.println("You fed " + petName + ".");
				virtualPet.feed();
				break;

			case 2:
				System.out.println("You gave " + petName + " water to drink.");
				virtualPet.drink();
				break;
			case 3:
				virtualPet.play();
				break;
			case 4:
				showOptions(petName);
				break;
			default:
				System.out.println("Incorrection option");
				System.out.println();
				System.out.println("Please choose between 0-5\n");
				System.out.println();
				showOptions(petName);

			}

			virtualPet.tick();
		}
		System.out.println("Thank your playing Virtual Pet Edition 2!");
		input.close();
	}

	/**
	 * This method displays the VirtualPet attributes
	 * 
	 * @param pet
	 */

	private static void showStatus(VirtualPet2 pet) {
		System.out.println("1. Hunger: " + pet.getHunger());
		System.out.println("1. Thirst: " + pet.getThirst());
		System.out.println("1. Boredom: " + pet.getBoredom());
		System.out.println();

	}

	// This method displays the user options to the console.

	private static void showOptions(String name) {

		System.out.println("What do you want to do?");
		System.out.println("0. Show Status");
		System.out.println("1. Feed " + name);
		System.out.println("1. Water " + name);
		System.out.println("1. Play with " + name);
		System.out.println("4. Display options");
		System.out.println("5. Quit");

	}

}
