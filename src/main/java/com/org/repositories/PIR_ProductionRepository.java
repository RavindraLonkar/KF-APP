package com.org.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.org.models.PIR_Production;

@Transactional
public interface PIR_ProductionRepository extends CrudRepository<PIR_Production, Long>{
	
}
