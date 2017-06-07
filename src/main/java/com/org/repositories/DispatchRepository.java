package com.org.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.org.models.Dispatch;

@Transactional
public interface DispatchRepository extends CrudRepository<Dispatch, Long>{
	
}
