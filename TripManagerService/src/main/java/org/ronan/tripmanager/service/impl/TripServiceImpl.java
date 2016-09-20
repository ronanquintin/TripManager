/**
 * 
 */
package org.ronan.tripmanager.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.ronan.tripmanager.dto.TripDTO;
import org.ronan.tripmanager.entity.TripEntity;
import org.ronan.tripmanager.mapper.TripMapper;
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
	TripRepository tripRepository;

	TripMapper mapper;

	@PostConstruct
	public void init() {
		this.mapper = Selma.builder(TripMapper.class).build();
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

}
