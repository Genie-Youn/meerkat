package com.genie.meerkat.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.genie.meerkat.mapper.ScheduleMapper;
import com.genie.meerkat.vo.Schedule;
import com.genie.meerkat.vo.User;

@Service("ScheduleService")
public class ScheduleServiceImpl implements ScheduleService {

	private Logger LOG = LoggerFactory.getLogger(ScheduleServiceImpl.class);
	
	@Autowired
	private ScheduleMapper mapper;
	
	@Override
	public Boolean addSchedule(User user, Schedule schedule) {
		schedule.setSeqUser(user.getUserId());
		try {
			mapper.insertSchedule(schedule);
		} catch (DataAccessException e) {
			return false;
		}
		return true;
	}

}
