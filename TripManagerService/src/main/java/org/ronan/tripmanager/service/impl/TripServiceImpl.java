/**
 * 
 */
package org.ronan.tripmanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.ronan.tripmanager.dto.TripDTO;
import org.ronan.tripmanager.entity.TripEntity;
import org.ronan.tripmanager.mapper.TripBO2DTOMapper;
import org.ronan.tripmanager.repository.TripRepository;
import org.ronan.tripmanager.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.xebia.extras.selma.Selma;

/**
 * @author Ronan Quintin
 *
 */
@Service
public class TripServiceImpl implements TripService {

	@Autowired
	private TripRepository tripRepository;

	private TripBO2DTOMapper mapper;

	@PostConstruct
	public void init() {
		this.mapper = Selma.builder(TripBO2DTOMapper.class).build();
	}

	@Override
	public List<TripDTO> listAllTrips() {
			
		List<TripEntity> tripEntities = this.tripRepository.findAll();
		List<TripDTO> tripDTOs = new ArrayList<TripDTO>();
		for (TripEntity tripEntity : tripEntities) {
			TripDTO tripDTO = this.mapper.asTripDTO(tripEntity);
			tripDTOs.add(tripDTO);
		}
		
		return tripDTOs;
	}

	@Override
	public void newTrip(TripDTO tripDTO) {
		TripEntity entity = this.mapper.asTripEntity(tripDTO);
		this.tripRepository.save(entity);


	}

}
