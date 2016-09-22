/**
 * 
 */
package org.ronan.tripmanager.dto;

import java.time.ZonedDateTime;

/**
 * @author Ronan Quintin
 *
 */
public class TripDTO {

	private Long id;

	private String name;

	private ZonedDateTime departureDateTime;

	public ZonedDateTime getDepartureDateTime() {
		return departureDateTime;
	}

	public void setDepartureDateTime(ZonedDateTime departureDateTime) {
		this.departureDateTime = departureDateTime;
	}

	public ZonedDateTime getReturnDateTime() {
		return returnDateTime;
	}

	public void setReturnDateTime(ZonedDateTime returnDateTime) {
		this.returnDateTime = returnDateTime;
	}

	private ZonedDateTime returnDateTime;

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
