package com.org.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.org.models.PGR_ReturnNew;

@Transactional
public interface PGR_ReturnNewRepository extends CrudRepository<PGR_ReturnNew, Long>{
	
}
