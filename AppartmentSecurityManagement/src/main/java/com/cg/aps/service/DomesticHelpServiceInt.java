package com.cg.aps.service;

import java.util.List;

import com.cg.aps.entities.DomesticHelpEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;



public interface DomesticHelpServiceInt {

	public long add(DomesticHelpEntity bean) throws DuplicateRecordException;
	
	public void update(DomesticHelpEntity bean) throws RecordNotFoundException;
	
	public void delete(DomesticHelpEntity bean) throws RecordNotFoundException;
	
	public DomesticHelpEntity findByName(String name) throws RecordNotFoundException;
	
	public DomesticHelpEntity findByPk(Integer id) throws RecordNotFoundException;
	
	public List<DomesticHelpEntity> search(DomesticHelpEntity bean, long pageNo, int pageSize);
	
	public List<DomesticHelpEntity> search(DomesticHelpEntity bean);
	
	
}
