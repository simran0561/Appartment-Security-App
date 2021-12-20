package com.cg.aps.entities;

import javax.persistence.Entity;
import javax.persistence.Table;
//
//@Entity
//@Table(name="Domestics_help")

public class DomesticHelpEntity extends BaseEntity {

	private String flatNo;
	private String ownerName;
	private String name;
	private String helpType;
	private String arrivalTime;
	private String departureTime;
	private String date;
	
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
