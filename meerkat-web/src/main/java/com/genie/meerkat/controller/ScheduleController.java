package com.genie.meerkat.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.genie.meerkat.batch.Scheduler;
import com.genie.meerkat.service.ScheduleService;
import com.genie.meerkat.service.ScheduleServiceImpl;
import com.genie.meerkat.vo.Schedule;
import com.genie.meerkat.vo.User;

@Controller
@RequestMapping(value="/schedule")
public class ScheduleController {
	
	private Logger LOG = LoggerFactory.getLogger(ScheduleController.class);

	@Autowired
	ScheduleService service;
	
	@Autowired
	Scheduler scheduler;
	
	@RequestMapping(value="/{user_id}", method=RequestMethod.POST)
	@ResponseBody
	public String setSchedule(@PathVariable("user_id") String userId, @RequestBody Schedule schedule){
		User user = new User();
		user.setUserId(userId);
		try {
			service.addSchedule(user, schedule);
		} catch (DataAccessException e) {
			return "Fail";
		}
		return "OK";
	}
	
	@RequestMapping(value="/send", method=RequestMethod.GET)
	@ResponseBody
	public String sendSMS(){
		
		scheduler.getTodayNotyList();
		
		return "OK";
	}
	
}
