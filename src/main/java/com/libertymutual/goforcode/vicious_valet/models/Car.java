package com.libertymutual.goforcode.vicious_valet.models;

public class Car {

	private String make;
	private String model;
	private String license;
	private String state;
	private String color;

	public Car(String model, String license, String state, String color, String make) {
		this.make = make;
		this.model = model;
		this.license = license;
		this.state = state;
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getLicense() {
		return license;
	}

	public String getState() {
		return state;
	}

	public String getColor() {
		return color;
	}

}
