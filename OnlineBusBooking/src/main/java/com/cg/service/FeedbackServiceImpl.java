package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.BusOperatorDao;
import com.cg.dao.FeedbackDao;
import com.cg.dao.UserDao;
import com.cg.dto.FeedbackDto;
import com.cg.entities.BusOperator;
import com.cg.entities.FeedBack;
import com.cg.entities.User;
import com.cg.exception.InvalidBusOperatorException;
import com.cg.exception.InvalidRouteNameException;

@Service
public class FeedbackServiceImpl implements IFeedBackService{
	
	@Autowired
	FeedbackDao feedbackdao;
	@Autowired
	UserDao userdao;
	@Autowired
	BusOperatorDao busoperatordao;

	@Override
	public FeedBack addFeedback(FeedbackDto feedbackdto) {
		FeedBack feedback=new FeedBack();
		BusOperator busoperator=busoperatordao.findById(feedbackdto.getBusoperator()).get();
		User user=userdao.findById(feedbackdto.getUserId()).get();
		feedback.setBusoperator(busoperator);
		feedback.setUser(user);
		feedback.setComments(feedbackdto.getComments());
		feedback.setRatings(feedbackdto.getRatings());
		feedback.setRouteName(feedbackdto.getRouteName());
		feedback.setUsername(feedbackdto.getUsername());
		return feedbackdao.save(feedback);
	}

	@Override
	public List<FeedBack> viewAllFeedBacks(String routeName) {
		if(feedbackdao.existsByRouteName(routeName)) {
			return feedbackdao.findByRouteName(routeName);
		}
		else {
			throw new InvalidRouteNameException();
		}
	}

	@Override
	public List<FeedBack> viewAllFeedBacks(BusOperator busoperator) {
			return feedbackdao.findByBusOperator(busoperator);	
	}

}
