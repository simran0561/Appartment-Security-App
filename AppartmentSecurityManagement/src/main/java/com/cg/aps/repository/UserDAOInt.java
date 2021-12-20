package com.cg.aps.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.UserEntity;

@Repository
  public interface UserDAOInt extends CrudRepository<UserEntity,Long> {
	
	public UserEntity findByLogin(String login);
	
	

}
