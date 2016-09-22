package org.ronan.tripmanager.mapper;

import org.ronan.tripmanager.dto.TripDTO;
import org.ronan.tripmanager.model.TripModel;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;

@Mapper(withIgnoreMissing = IgnoreMissing.ALL)
public interface TripModel2DTOMapper {

	TripDTO asTripDTO(TripModel in);
}
