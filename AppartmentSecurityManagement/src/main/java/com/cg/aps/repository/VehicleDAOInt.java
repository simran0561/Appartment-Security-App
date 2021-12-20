package com.cg.aps.repository;

import java.util.List;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.VehicleEntity;


@Repository
public interface VehicleDAOInt extends CrudRepository<VehicleEntity, String> {

	public long add(VehicleEntity bean);
	
	public void update(VehicleEntity bean);
	
	public void delete(VehicleEntity bean);
	
	public VehicleEntity findByName(String name);
	
//	public VehicleEntity findByPk(Integer id);
	
	public VehicleEntity findByPk(String id);
	
	public List<VehicleEntity> search(VehicleEntity bean, long pageNo, int pageSize);
	
	public List<VehicleEntity> search(VehicleEntity bean);
	
	
}
