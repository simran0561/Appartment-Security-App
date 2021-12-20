
package com.cg.aps.service;

import java.util.List;

import com.cg.aps.entities.GardSalaryEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;



public interface GardSalaryServiceInt {

	public long add(GardSalaryEntity bean) throws DuplicateRecordException;
	
	public void update(GardSalaryEntity bean)throws RecordNotFoundException;
	
	public void delete(GardSalaryEntity bean)throws RecordNotFoundException;
	
	public GardSalaryEntity findByName(String name)throws RecordNotFoundException;
	
	public GardSalaryEntity findByPk(Integer id)throws RecordNotFoundException;
	
	public List<GardSalaryEntity> search(GardSalaryEntity bean, long pageNo, int pageSize);
	
	public List<GardSalaryEntity> search(GardSalaryEntity bean);
	
	
}