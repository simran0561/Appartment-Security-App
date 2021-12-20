package com.cg.aps.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

import com.cg.aps.entities.GardSalaryEntity;
import com.cg.aps.entities.UserEntity;
import com.cg.aps.entities.VisitorEntity;
import com.cg.aps.exception.DuplicateRecordException;
import com.cg.aps.exception.RecordNotFoundException;
import com.cg.aps.repository.GardSalaryDAOInt;

public class GardSalaryServiceImpl implements GardSalaryServiceInt {
	@Autowired
	GardSalaryDAOInt GardSalaryDao;
	
	@Override
	public long add(GardSalaryEntity bean)throws DuplicateRecordException{
		// TODO Auto-generated method stub
		try
		{
			GardSalaryDao.save(bean);
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
	public void update(GardSalaryEntity bean)throws RecordNotFoundException {
		// TODO Auto-generated method stub
		try 
		{
			GardSalaryDao.save(bean);
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
	public void delete(GardSalaryEntity bean)throws RecordNotFoundException {
		try
		{
			GardSalaryDao.delete(bean);
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
	public GardSalaryEntity findByName(String name)throws RecordNotFoundException {
		try {
			return GardSalaryDao.findByName(name);
		}
		catch (DataAccessException e) {
			throw new RecordNotFoundException(e.getMessage());
		}
		catch (Exception e) {
			throw new RecordNotFoundException(e.getMessage());
		}
	}

	@Override
	public GardSalaryEntity findByPk(Integer id)throws RecordNotFoundException {
		try
		{
			Optional<GardSalaryEntity> optional=GardSalaryDao.findById(id);
			if(optional.isPresent())
			{
				return optional.get();
			}
			else
			{
				throw new Exception("InvalidId");
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
	public List<GardSalaryEntity> search(GardSalaryEntity bean, long pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GardSalaryEntity> search(GardSalaryEntity bean) {
		// TODO Auto-generated method stub
		return null;
	}

}
