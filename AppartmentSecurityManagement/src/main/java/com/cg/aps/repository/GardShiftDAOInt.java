package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.GardShiftEntity;


@Repository
public interface GardShiftDAOInt extends CrudRepository<GardShiftEntity, Integer> {

	public long add(GardShiftEntity bean);
	
	public void update(GardShiftEntity bean);
	
	public void delete(GardShiftEntity bean);
	
	public GardShiftEntity findByName(String name);
	
	public GardShiftEntity findByPk(long id);
	
	public List<GardShiftEntity> search(GardShiftEntity bean, long pageNo, int pageSize);
	
	public List<GardShiftEntity> search(GardShiftEntity bean);
	
	
}
