package com.cg.aps.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
//
//@Entity
//@Table(name="Gards_Tranning_aps")

public class GardsTranningEntity extends BaseEntity {

	private long userId;
	private String name;
	private String mobileNo;
	private String status;
	private String timeing;
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
