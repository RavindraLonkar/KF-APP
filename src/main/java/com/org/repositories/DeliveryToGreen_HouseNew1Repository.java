package com.org.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.org.models.DeliveryToGreen_HouseNew1;

@Transactional
public interface DeliveryToGreen_HouseNew1Repository extends CrudRepository<DeliveryToGreen_HouseNew1, Long>{
	
}
