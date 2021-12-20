package com.cg.aps.service;

import java.util.List;

import com.cg.aps.entities.VehicleEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;



public interface VehicleServiceInt {

	public long add(VehicleEntity bean) throws DuplicateRecordException;
	
	public void update(VehicleEntity bean) throws RecordNotFoundException;
	
	public void delete(VehicleEntity bean) throws RecordNotFoundException;
	
	public VehicleEntity findByName(String name) throws RecordNotFoundException;
	
//	public VehicleEntity findByPk(Integer id) throws RecordNotFoundException;
	
	public VehicleEntity findByPk(String id) throws RecordNotFoundException;
	
	public List<VehicleEntity> search(VehicleEntity bean, long pageNo, int pageSize);
	
	public List<VehicleEntity> search(VehicleEntity bean);
	
	
}
