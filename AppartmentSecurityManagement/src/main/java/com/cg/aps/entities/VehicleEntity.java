package com.cg.aps.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;


//@Entity
//@Table(name = "vehicles_aps")

public class VehicleEntity extends BaseEntity {

	private String name;
	private String parkingNo;
	private String arrivalTime;
	private String departureTime;
	private Date date;
	private String vehicleNo;
	private String vehicleType;

	
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
