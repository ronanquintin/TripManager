package org.ronan.tripmanager.mapper;

import org.ronan.tripmanager.dto.TripDTO;
import org.ronan.tripmanager.entity.TripEntity;

import fr.xebia.extras.selma.Mapper;

@Mapper
public interface TripMapper {

	TripDTO asTripDTO(TripEntity in);


}
