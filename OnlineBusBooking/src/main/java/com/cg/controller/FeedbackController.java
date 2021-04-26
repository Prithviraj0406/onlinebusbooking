package com.cg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dto.FeedbackDto;
import com.cg.entities.BusOperator;
import com.cg.entities.FeedBack;
import com.cg.exception.InvalidBusOperatorException;
import com.cg.exception.InvalidRouteNameException;
import com.cg.service.IFeedBackService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/************************************************************
 * 
 * @author Prithvi
 * Description: This class is used for feedback controller where we can add and view feedbacks;
 * Version: v1.0
 * Created date:20 April 2021
 *
 ************************************************************/
@Api("Feedback Controller")
@RestController
@RequestMapping(value="/feedback")
public class FeedbackController {
	
	@Autowired
	IFeedBackService feedbackservice;
	
	/**
	 * Method addFeedback
	 * Description : This method is used to add feedback
	 * @param feedback
	 * @return ResponseEntity<>
	 * @PostMapping 
	 * Created date:20 April 2021
	 */
	@ApiOperation(value="add feedback")
	@PostMapping(value="/addfeedback")
	public ResponseEntity<String> addFeedback(@Valid @RequestBody FeedbackDto feedback){
		feedbackservice.addFeedback(feedback);
		return new ResponseEntity<>("Added feedback successfully",HttpStatus.OK);
		
	}
	
	@ApiOperation(value="view all feedback by routename")
	@GetMapping(value="/viewallfeedbackbyroutename/{routeName}")
	public List<FeedBack> viewAllFeedBacks(@Valid @PathVariable String routeName){
		try {
			List<FeedBack> feedbackbyroutename = feedbackservice.viewAllFeedBacks(routeName);
			return feedbackbyroutename;
		}
		 catch (InvalidRouteNameException exception) {
				throw new InvalidRouteNameException("Route not found");
	}
	}
	
	@ApiOperation(value="view all feedback by busoperator")
	@GetMapping(value="/viewallfeedbackbybusoperator/{busoperator}")
	public List<FeedBack> viewAllFeedBacks(@Valid @PathVariable BusOperator busoperator){
		try {
			List<FeedBack> feedbackbybusoperator= feedbackservice.viewAllFeedBacks(busoperator);
			return feedbackbybusoperator;
		}
		 catch (InvalidRouteNameException exception) {
				throw new InvalidBusOperatorException("Bus Operator Not found");
				}
	}

}
