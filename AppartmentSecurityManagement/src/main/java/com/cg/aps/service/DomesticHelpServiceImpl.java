package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.cg.aps.entities.DomesticHelpEntity;
import com.cg.aps.entities.UserEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.DomesticHelpDAOInt;

public class DomesticHelpServiceImpl implements DomesticHelpServiceInt {
	@Autowired
	DomesticHelpDAOInt DomesticHelpDao;
	
	@Override
	public long add(DomesticHelpEntity bean) throws DuplicateRecordException {
		try
		{
			DomesticHelpDao.save(bean);
			return 0;
			
		}
		catch(DataAccessException e)
		{
			throw new DuplicateRecordException(e.getMessage());
		}
		catch(Exception e)
		{
			throw new DuplicateRecordException(e.getMessage());
		}
	}

	@Override
	public void update(DomesticHelpEntity bean)throws RecordNotFoundException {
		
		try 
		{
			DomesticHelpDao.save(bean);
		}
		catch(DataAccessException e)
		{
			throw new RecordNotFoundException(e.getMessage());
		}
		catch(Exception e)
		{
			throw new RecordNotFoundException(e.getMessage());
		}

	}

	@Override
	public void delete(DomesticHelpEntity bean)throws RecordNotFoundException {
		try
		{
			DomesticHelpDao.delete(bean);
		}
		catch(DataAccessException e)
		{
			throw new RecordNotFoundException(e.getMessage());
		}
		catch(Exception e)
		{
			throw new RecordNotFoundException(e.getMessage());
		}

	}

	@Override
	public DomesticHelpEntity findByName(String name) throws RecordNotFoundException {
		try {
			return DomesticHelpDao.findByName(name);
		}
		catch (DataAccessException e) {
			throw new RecordNotFoundException(e.getMessage());
		}
		catch (Exception e) {
			throw new RecordNotFoundException(e.getMessage());
		}
	}

	@Override
	public DomesticHelpEntity findByPk(Integer id) throws RecordNotFoundException {
		try
		{
			Optional<DomesticHelpEntity> optional=DomesticHelpDao.findById(id);
			if(optional.isPresent())
			{
				return optional.get();
			}
			else
			{
				throw new Exception("Invalid Id");
			}
		}
		 catch(DataAccessException e)
		{
			 throw new RecordNotFoundException(e.getMessage());
		}
		catch(Exception e)
		{
			throw new RecordNotFoundException(e.getMessage());
		}
		//return null;
	}

	@Override
	public List<DomesticHelpEntity> search(DomesticHelpEntity bean, long pageNo, int pageSize) {
		
		
		return null;
	}

	@Override
	public List<DomesticHelpEntity> search(DomesticHelpEntity bean) {
		// TODO Auto-generated method stub
		
		return null;
	}

}
