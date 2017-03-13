package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.TeamDao;
import com.example.domain.Team;

@RestController
public class MyController {
	
	@Autowired TeamDao teamDao;
	
	@RequestMapping("/foobar/{name}")
	public Team foo(@PathVariable String name) {
		Team team = teamDao.findByName(name);
		return team;
	}

	
}
