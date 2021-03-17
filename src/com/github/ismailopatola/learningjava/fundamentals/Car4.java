package com.github.ismailopatola.learningjava.fundamentals;

public class Car4 {
	
	private String make;
	private String model;
	private int year;
	
	/** 
	 * constructor
	 * @param make
	 * @param model
	 * @param year
	 */
	Car4(String make, String model, int year) {

		// this.make = make;
		// this.model = model;
		// this.year = year;
		
		this.setMake(make);
		this.setModel(model);
		this.setYear(year);
	}
	
	/**
	 *  Overloading constructor - copy
	 * @param car
	 */
	Car4(Car4 car) {
		this.copy(car);
	}
	
	/**
	 * Getters
	 */
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}


	/**
	 * Setters
	 */
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * Copy car object
	 * @param car
	 */
	public void copy(Car4 car) {
		this.setMake(car.getMake());
		this.setModel(car.getModel());
		this.setYear(car.getYear());
	}
}
