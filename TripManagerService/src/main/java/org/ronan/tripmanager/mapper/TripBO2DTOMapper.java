package org.ronan.tripmanager.mapper;

import org.ronan.tripmanager.dto.TripDTO;
import org.ronan.tripmanager.entity.TripEntity;

import fr.xebia.extras.selma.Mapper;

@Mapper
public interface TripBO2DTOMapper {

	TripDTO asTripDTO(TripEntity in);

	TripEntity asTripEntity(TripDTO in);


}
