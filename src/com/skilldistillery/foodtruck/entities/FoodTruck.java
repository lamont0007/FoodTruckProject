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
		return "FoodTruck id: " + id + " Rating " + rating + " Name: " + name + " FoodType: " + foodType;

	}

	public double getRating() {
		return rating;
	}

}
