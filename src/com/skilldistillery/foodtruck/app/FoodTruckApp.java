package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private static FoodTruck[] fleet = new FoodTruck[5];
	private static int foodTruckCount = 0;

	public void run() {

		Scanner userinput = new Scanner(System.in);

		for (int indexOfArrays = 0; indexOfArrays < 5; indexOfArrays++) {
			System.out.println(" Please Enter a Food Truck name ");
			String name = userinput.nextLine();
			if (name.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.println(" Please Enter Rating 1 to 5 ");
			double rating = userinput.nextDouble();
			System.out.println(" Please Enter Food Type ");
			String foodType = userinput.nextLine();
			userinput.nextLine();

			FoodTruck foodTruck = new FoodTruck(name, foodType, rating);
			fleet[indexOfArrays] = foodTruck;
			foodTruckCount++;

		}
		while (true) {
			System.out.println("1: List all existing food trucks.\n" + "2: See the average rating of food trucks.\n"
					+ "3: Display the highest-rated food truck.\n" + "4: Quit the program." + " Choose a Numebr ");
			int userChoice = userinput.nextInt();
			if (userChoice == 1) {
				listingFoodTruck();
//				
			} else if (userChoice == 2) {
				System.out.println(averageRating());

			} else if (userChoice == 3) {
				System.out.println(highestRating());

			} else if (userChoice == 4) {
				System.out.println("Program Has Ended");
				break;
			}
		}

	}

	private void listingFoodTruck() {
		for (int i = 0; i < foodTruckCount; i++) {
			System.out.println(fleet[i]);
		}

	}

	private double averageRating() {
		double sum = 0;
		for (int i = 0; i < foodTruckCount; i++) {
			sum += fleet[i].getRating();

		}
		return sum / foodTruckCount;
	}

	private FoodTruck highestRating() {
		FoodTruck highestRatingFoodTruck = fleet[0];
		for(int i = 0; i < foodTruckCount; i++){
			if (highestRatingFoodTruck.getRating() < fleet[i].getRating()) {
				highestRatingFoodTruck = fleet[i];
				
			}
			
		}
		return highestRatingFoodTruck;

	}

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

}
