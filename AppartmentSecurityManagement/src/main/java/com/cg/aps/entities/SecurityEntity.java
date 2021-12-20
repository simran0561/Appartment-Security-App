package com.cg.aps.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
//@Table(name = "security_alerts_aps")
public class SecurityEntity extends BaseEntity {

	private String message;
	private String alert;
	
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
