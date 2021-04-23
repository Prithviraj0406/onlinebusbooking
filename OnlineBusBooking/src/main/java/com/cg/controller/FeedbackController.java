package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entities.FeedBack;
import com.cg.service.IFeedBackService;

@RestController
@RequestMapping(value="/feedback")
public class FeedbackController {
	@Autowired
	IFeedBackService feedbackservice;
	
	@PostMapping(value="/addfeedback")
	public ResponseEntity<String> addFeedback(@RequestBody FeedBack feedback){
		feedbackservice.addFeedback(feedback);
		return new ResponseEntity<>("Added feedback successfully",HttpStatus.OK);
		
	}
	
	

}
