package com.cg.aps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.aps.entities.SecurityEntity;
import com.cg.aps.service.SecurityServiceInt;

@RestController
@RequestMapping("/gard")
public class GardController {
	@Autowired 
	SecurityServiceInt security;
	
	@PostMapping("/add")
	public long add(SecurityEntity bean) {
		return security.add(bean);
	}

}
