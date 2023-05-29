package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String name;
	private int id;
	private String foodType;
	private double rating;
	private static int nextTruckId = 10011;

	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.id = nextTruckId++;
	}

	@Override
	public String toString() {
		return "FoodTruck id = " + id + "rating" + rating + "name" + name 
				+ "FoodType" + foodType;

	}
	
	
	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	} 

}
