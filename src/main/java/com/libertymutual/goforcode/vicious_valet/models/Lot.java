package com.libertymutual.goforcode.vicious_valet.models;

import java.util.ArrayList;

public class Lot {
	
	private ArrayList<Car> carList; // declare (now it's available)
	private int capacity;
	
	public Lot(int capacity) {
		this.capacity = capacity;
		carList = new ArrayList<Car>(); // set it to an initial value
	}
	
	public void driveCarOnto(Car car) {
		//add car to lot if it has the capacity
		if(isLotFull() == false) {
			carList.add(car);
		}
		
	}
	
	public boolean isLotFull() {
		if(carList.size() < capacity) {
			return false;
		}else {
			return true;
		}
	}
	
	
	
	
	
	
	
	
	
	
	

	public ArrayList<Car> getCarList() {
		return carList;
	}
	
	

}
