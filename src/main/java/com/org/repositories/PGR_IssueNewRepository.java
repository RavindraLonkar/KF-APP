package com.org.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.org.models.PGR_IssueNew;

@Transactional
public interface PGR_IssueNewRepository extends CrudRepository<PGR_IssueNew, Long>{
	
	//public PGR_IssueNew findByPi_ID(String id);

	//public void save(List<PGR_IssueNew> dataList);
}
