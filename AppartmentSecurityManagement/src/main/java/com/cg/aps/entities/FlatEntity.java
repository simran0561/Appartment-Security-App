package com.cg.aps.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
//
//@Entity
//@Table(name = "flat_details_aps")
public class FlatEntity extends BaseEntity {

	private String ownerName;
	private String flatNo;
	private String floorNo;
	private String flatType;
	
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
