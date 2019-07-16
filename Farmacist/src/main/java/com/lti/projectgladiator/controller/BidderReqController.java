package com.lti.projectgladiator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.projectgladiator.dao.BidderInfoDAO;
import com.lti.projectgladiator.dto.BidderRequestDTO;
import com.lti.projectgladiator.entity.BidderRequest;
import com.lti.projectgladiator.entity.SetBid;
import com.lti.projectgladiator.service.RegisterService;

@Controller
public class BidderReqController {

	@Autowired
	private RegisterService service;
	
	@RequestMapping(path="/Request" ,method =RequestMethod.POST)
	public SetBid add(@RequestBody BidderRequestDTO dto) {
		System.out.println("controller");
		SetBid reqq=service.fetch(dto);
		return reqq;
	}
}
