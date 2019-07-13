package com.lti.projectgladiator.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.projectgladiator.dto.BidderInfoDTO;
import com.lti.projectgladiator.entity.BidderInfo;
import com.lti.projectgladiator.service.RegisterService;

@RestController
public class BidderInfoController {
	
	@Autowired
	private RegisterService service;
		
		@RequestMapping(path="/Register" ,method =RequestMethod.POST)
		public String register(@RequestBody BidderInfoDTO bidderDTO) {
			
			service.addBidder(bidderDTO);
		    return "hello.html";
		}
		
}
