package com.cg.aps.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;



@Entity
@Table(name = "users_aps")

public class UserEntity extends BaseEntity {
	@Id
	private String loginId;
	private String firstName;
	private String lastName;
	private String password;
	private String mobileNo;
	private String emailId;
	private long roleId;

	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return String.valueOf(id);
	}


	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return firstName+" "+lastName;
	}

}
