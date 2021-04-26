package com.cg.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.dto.FeedbackDto;
import com.cg.entities.BusOperator;
import com.cg.entities.FeedBack;

@Service
public interface IFeedBackService {
	
	public FeedBack addFeedback(FeedbackDto feedback);
	public List<FeedBack> viewAllFeedBacks(String routeName);
	public List<FeedBack> viewAllFeedBacks(BusOperator busoperator);
	
	
}
