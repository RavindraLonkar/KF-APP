package com.org.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.org.models.Discard;

@Transactional
public interface DiscardRepository extends CrudRepository<Discard, Long>{
	
}
