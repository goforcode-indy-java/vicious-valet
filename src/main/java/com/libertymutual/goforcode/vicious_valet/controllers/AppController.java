package com.libertymutual.goforcode.vicious_valet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.vicious_valet.models.Car;
import com.libertymutual.goforcode.vicious_valet.models.Lot;

@Controller
public class AppController {
	
	private Lot vehicleBucket;
	
	public AppController() {
		vehicleBucket = new Lot(5);
	}
	
	@RequestMapping("/remove")
	public ModelAndView removeCar(int carIndex) {
		vehicleBucket.removeCarFromLot(carIndex);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", vehicleBucket);
		return mv;
	}

	@RequestMapping("/")
	public ModelAndView showApp(String license, String state, String make, String model, String color) {
		// if license is not null and the length of license is greater than 0
			// create a new instance of the car class from the values submitted 
		if (license != null && license.length() > 0) {
			Car car;
			car = new Car(model, license, state, color, make);
			
			// park the car in the lot
			// (QUESTION: how do we do this?)
			// (ANSWER: we need to add a method to the Lot class and call that method)
			vehicleBucket.driveCarOnto(car);
		}
		
		
		ModelAndView mv;
		mv = new ModelAndView();
		mv.setViewName("app");
		
		// Add the carLot so that I can see the list
		// of cars in the view
		mv.addObject("lot", vehicleBucket);
		
		return mv;
	}
	
}







