package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entities.BusOperator;
import com.cg.entities.FeedBack;

@Repository
public interface FeedbackDao extends JpaRepository<FeedBack, Integer> {
	
	public boolean existsByRouteName(String routeName); 
	
	public List<FeedBack> findByRouteName(String routeName);
	
	@Query("select fb from FeedBack fb "
			+ "where fb.busoperator=:busoperator")
	public List<FeedBack> findByBusOperator(@Param("busoperator") BusOperator busoperator);
	//public FeedBack addFeedback(FeedBack feedback);
	//public List<FeedBack> viewAllFeedBacks(String routeName,BusOperator operator);
	//public List<FeedBack> viewAllFeedBacks(BusOperator operator);
	
	
}
