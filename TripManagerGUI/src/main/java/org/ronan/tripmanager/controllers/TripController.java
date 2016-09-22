package org.ronan.tripmanager.controllers;

import java.util.List;

import javax.annotation.PostConstruct;

import org.ronan.tripmanager.dto.TripDTO;
import org.ronan.tripmanager.mapper.TripModel2DTOMapper;
import org.ronan.tripmanager.model.TripModel;
import org.ronan.tripmanager.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.xebia.extras.selma.Selma;

@Controller
@RequestMapping("/trips")
public class TripController {

	private static final String TRIPS_ATTRIBUTE = "trips";
	private static final String TRIPS_JSP = "trips";
	private static final String NEW_TRIP_JSP = "newTrip";
	private static final String TRIP_MODEL_ATTRIBUTE = "tripModel";

	@Autowired
	private TripService tripService;

	private TripModel2DTOMapper mapper;

	@PostConstruct
	public void init() {
		this.mapper = Selma.builder(TripModel2DTOMapper.class).build();
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView trips() {

		ModelAndView modelAndView = new ModelAndView();

		List<TripDTO> trips = tripService.listAllTrips();

		modelAndView.addObject(TRIPS_ATTRIBUTE, trips);
		modelAndView.setViewName(TRIPS_JSP);

		return modelAndView;
	}

	@RequestMapping("/new")
	public String getNewTrip(Model model) {
		model.addAttribute(TRIP_MODEL_ATTRIBUTE, new TripModel());
		return NEW_TRIP_JSP;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String add(TripModel tripModel, BindingResult result) {
		if (result.hasErrors()) {
			return "trips/new";
		}
		TripDTO tripDTO = this.mapper.asTripDTO(tripModel);
		this.tripService.newTrip(tripDTO);
		return "redirect:/trips";
	}

}
