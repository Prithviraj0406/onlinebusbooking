package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.BusOperator;
import com.cg.entities.FeedBack;

@Repository
public interface IFeedBackRepository extends JpaRepository<FeedBack, Integer> {
	
	//public FeedBack addFeedback(FeedBack feedback);
	//public List<FeedBack> viewAllFeedBacks(String routeName,BusOperator operator);
	//public List<FeedBack> viewAllFeedBacks(BusOperator operator);
	
	
}
