package com.genie.meerkat.mapper;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.genie.meerkat.vo.Schedule;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:/applicationContext.xml")
public class ScheduleMapperTest {
	
	private Logger LOG = LoggerFactory.getLogger(ScheduleMapperTest.class);

	@Autowired
	private ScheduleMapper mapper;
	
	private final static String USER_SEQ = "0";
	private final static Date DATE = new Date(2016-10-17);
	private final static String START_TIME = "16:00";
	private final static String END_TIME = "23:30";
	
	private Schedule successSchedule;
	
	@Test
	public void InsertAndSelectScheduleTest() {
		int count;
		successSchedule = new Schedule(USER_SEQ, DATE, START_TIME, END_TIME);
		
		if (mapper.selectScheduleList() != null) {
			count = mapper.selectScheduleList().size(); //그냥 getCount로 만들어..
		} else {
			count = 0;
		}
		
		mapper.insertSchedule(successSchedule);
		assertTrue(count < mapper.selectScheduleList().size());
		
		mapper.deleteSchedule(successSchedule);
		if (mapper.selectScheduleList() != null) {
			assertTrue(count == mapper.selectScheduleList().size());
		} else {
			assertTrue(count == 0);
		}
	}
}
