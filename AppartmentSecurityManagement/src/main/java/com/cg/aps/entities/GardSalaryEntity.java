package com.cg.aps.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
//
//@Entity
//@Table(name="Gard_Salary_aps")

public class GardSalaryEntity extends BaseEntity {

	private String name;
	private String userId;
	private long amount;
	private String status;
	private Date date;
	
	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
