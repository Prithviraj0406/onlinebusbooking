package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.FeedbackDao;
import com.cg.entities.BusOperator;
import com.cg.entities.FeedBack;

@Service
public class FeedbackServiceImpl implements IFeedBackService{
	
	@Autowired
	FeedbackDao feedbackdao;

	@Override
	public FeedBack addFeedback(FeedBack feedback) {
		return feedbackdao.save(feedback);
	}

	@Override
	public List<FeedBack> viewAllFeedBacks(String routeName, BusOperator operator) {
		return null;
	}

	@Override
	public List<FeedBack> viewAllFeedBacks(BusOperator operator) {
		return null;	
		}

}
