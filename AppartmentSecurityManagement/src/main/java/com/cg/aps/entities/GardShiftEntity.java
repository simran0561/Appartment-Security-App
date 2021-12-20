package com.cg.aps.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
//
//@Entity
//@Table(name = "guard_shift_aps")

public class GardShiftEntity extends BaseEntity {

	private long userId;
	private String name;
	private String time;
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
