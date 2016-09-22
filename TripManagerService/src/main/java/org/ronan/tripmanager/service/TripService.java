/**
 * 
 */
package org.ronan.tripmanager.service;

import java.util.List;

import org.ronan.tripmanager.dto.TripDTO;

/**
 * @author Ronan Quintin
 *
 */
public interface TripService {


	public List<TripDTO> listAllTrips();

	public void newTrip(TripDTO tripDTO);

}
