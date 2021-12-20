package com.cg.aps.service;

import java.util.List;

import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;



public interface VisitorServiceInt {

	public long add(VisitorEntity bean) throws DuplicateRecordException;
	
	public void update(VisitorEntity bean) throws RecordNotFoundException;
	
	public void delete(VisitorEntity bean) throws RecordNotFoundException;
	
	public VisitorEntity findByName(String name) throws RecordNotFoundException;
	
	public VisitorEntity findByPk(Integer id) throws RecordNotFoundException;
	
	public List<VisitorEntity> search(VisitorEntity bean, int pageNo, int pageSize);
	
	public List<VisitorEntity> search(VisitorEntity bean);
	
	
}
