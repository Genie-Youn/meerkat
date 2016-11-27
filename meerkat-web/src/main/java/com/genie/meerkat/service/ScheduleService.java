package com.genie.meerkat.service;

import com.genie.meerkat.vo.Schedule;
import com.genie.meerkat.vo.User;

public interface ScheduleService {
	
	Boolean addSchedule(User user, Schedule schedule);
	
	

}
