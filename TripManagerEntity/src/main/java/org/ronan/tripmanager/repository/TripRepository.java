/**
 * 
 */
package org.ronan.tripmanager.repository;

import java.math.BigInteger;

import org.ronan.tripmanager.entity.TripEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Ronan Quintin
 *
 */
@Repository
public interface TripRepository extends JpaRepository<TripEntity, BigInteger> {

}
