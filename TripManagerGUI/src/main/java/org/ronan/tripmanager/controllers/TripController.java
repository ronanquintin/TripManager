package org.ronan.tripmanager.controllers;

import java.util.List;

import org.ronan.tripmanager.dto.TripDTO;
import org.ronan.tripmanager.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TripController {

	private static final String TRIPS_ATTRIBUTE = "trips";
	private static final String TRIPS_JSP = "trips";

	@Autowired
	public TripService tripService;

	@RequestMapping("/trips")
	public ModelAndView trips() {

		ModelAndView modelAndView = new ModelAndView();

		List<TripDTO> trips = tripService.listAllTrips();
		
		modelAndView.addObject(TRIPS_ATTRIBUTE, trips);
		modelAndView.setViewName(TRIPS_JSP);
		
		return modelAndView;
	}

}
