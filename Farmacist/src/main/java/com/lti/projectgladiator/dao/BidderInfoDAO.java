package com.lti.projectgladiator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.lti.projectgladiator.entity.BidderInfo;
import com.lti.projectgladiator.entity.BidderRequest;
import com.lti.projectgladiator.entity.SetBid;

@Repository
public class BidderInfoDAO {
	
	@PersistenceContext
	 EntityManager em;
	
	@Transactional
	public int addBidder(BidderInfo info) {
		System.out.println("dao");
		 BidderInfo bidder=em.merge(info);
		 return bidder.getBid();
	}
	
	public SetBid display(int cropId) {
		
		System.out.println("dao");
		Query q= em.createQuery("select  c from SetBid as c where c.id=:br");
		q.setParameter("br", cropId);
		return (SetBid) q.getSingleResult();
		
	}
	
	
	
	/*
	 * @Transactional public void addBidderReq(BidderRequest req) { em.merge(req); }
	 */
	 
}
