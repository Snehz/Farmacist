package com.lti.projectgladiator.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.lti.projectgladiator.entity.BidderInfo;

//@Component("bidderdao")
@Component
public class BidderInfoDAO {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	public int addBidder(BidderInfo info) {
		
		 BidderInfo bidder=em.merge(info);
		 return bidder.getBid();
	}
}
