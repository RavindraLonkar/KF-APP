package com.org.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.org.models.PIR_Issue;

@Transactional
public interface PIR_IssueRepository extends CrudRepository<PIR_Issue, Long>{
	
}
