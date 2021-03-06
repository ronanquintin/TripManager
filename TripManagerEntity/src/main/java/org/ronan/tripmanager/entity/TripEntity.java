/**
 * 
 */
package org.ronan.tripmanager.entity;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Ronan Quintin
 *
 */
@Entity
@Table(name = "TRIP")
public class TripEntity {

	@Id
	@Column(name = "ID")
	@GeneratedValue
	private Long id;

	@Column(name = "NAME")
	private String name;


	@Column(name = "DEPARTURE_DATE_TIME")
	private ZonedDateTime departureDateTime;

	@Column(name = "RETURN_DATE_TIME")
	private ZonedDateTime returnDateTime;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

}
