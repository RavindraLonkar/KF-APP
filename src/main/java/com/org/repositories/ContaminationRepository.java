package com.org.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.org.models.Contamination;

@Transactional
public interface ContaminationRepository extends CrudRepository<Contamination, Long>{
	
}
