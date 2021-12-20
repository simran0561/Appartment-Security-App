package com.cg.aps.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table (name="Visitors_aps")

public class VisitorEntity extends BaseEntity {
	@Id
	private String flatNo;
	private String name;
	private String ownerName;
	private Data date;
	private String arrivalTime;
	private String departureTime;
	
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