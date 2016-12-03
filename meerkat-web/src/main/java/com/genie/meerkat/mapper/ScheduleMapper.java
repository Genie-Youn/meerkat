package com.genie.meerkat.mapper;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.genie.meerkat.view.ScheduleView;
import com.genie.meerkat.vo.Schedule;

@Repository("scheduleMapper")
public class ScheduleMapper extends AbstractMapper {

	public List<Schedule> selectScheduleList() {
		return (List<Schedule>)selectList("Schedule.selectAll");
	}

	public Object insertSchedule(Schedule schedule) {
		return insert("Schedule.insertSchedule", schedule);
	}

	public Object deleteSchedule(Schedule schedule) {
		return delete("Schedule.delete", schedule);
	}
	
	public List<ScheduleView> selectScheduleListByDate(String date) {
		HashMap map = new HashMap<String, String>();
		map.put("date", date);
		return selectList("Schedule.selectListByDate", map);
	}

}
