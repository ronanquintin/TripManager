package org.ronan.tripmanager.model;

import java.time.ZonedDateTime;

public class TripModel {

	private Long id;

	private String name;

	private ZonedDateTime departureDate;




	public ZonedDateTime getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(ZonedDateTime departureDate) {
		this.departureDate = departureDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
