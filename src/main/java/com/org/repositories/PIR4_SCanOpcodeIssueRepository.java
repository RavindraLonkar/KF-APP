package com.org.repositories;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.org.models.PIR4_SCanOpcodeIssue;

@Transactional
public abstract interface PIR4_SCanOpcodeIssueRepository extends CrudRepository<PIR4_SCanOpcodeIssue, Long> {

}
