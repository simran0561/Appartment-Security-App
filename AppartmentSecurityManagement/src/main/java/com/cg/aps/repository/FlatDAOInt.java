package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.FlatEntity;


@Repository
public interface FlatDAOInt extends CrudRepository<FlatEntity, Integer>{

	public long add(FlatEntity bean);
	
	public void update(FlatEntity bean);
	
	public void delete(FlatEntity bean);
	
	public FlatEntity findByName(String name);
	
	public FlatEntity findByPk(long id);
	
	public List<FlatEntity> search(FlatEntity bean, long pageNo, int pageSize);
	
	public List<FlatEntity> search(FlatEntity bean);
	
	
}
