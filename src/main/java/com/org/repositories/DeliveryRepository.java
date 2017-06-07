package com.org.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.org.models.Delivery;

@Transactional
public interface DeliveryRepository extends CrudRepository<Delivery, Long>{
	
}
