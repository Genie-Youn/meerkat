package com.genie.meerkat.batch;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.genie.meerkat.mapper.ScheduleMapper;
import com.genie.meerkat.view.ScheduleView;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gabia.api.*;

@Component
public class Scheduler {
	
	private static Logger LOG = LoggerFactory.getLogger(Scheduler.class);
	private static String API_KEY = "";
	private static String API_ID = "";
	@Autowired
	private ScheduleMapper mapper;
	
	
	public void sendNotify(List scheduleList){
		ApiClass api = new ApiClass(API_ID, API_KEY);
		Iterator<ScheduleView> it = scheduleList.iterator();
		while(it.hasNext()){
			ScheduleView scv = it.next();
			String arr[] = new String[7];
			arr[0] = "sms";	// SMS/LMS 발송 구분
			arr[1] = "1234";	// 결과 확인을 위한 KEY (MAX 40byte. 중복되지 않도록 생성하여 전달해 주시기 바랍니다. )
			arr[2] = "테스트";	// LMS 발송시 제목으로 사용 SMS 발송시는 수신자에게 내용이 보이지 않습니다.
			arr[3] = scv.getUserName()+"님은 \n\n출근시간:"+scv.getStartTime()+"\n퇴근시간:"+scv.getEndTime()+"\n\n즐거운 하루되세요\n투썸커피 영등포CGV";	// 본문 (90byte 제한 : SMS의 경우)
			arr[4] = scv.getPhoneNumber();		// 발신 번호
			arr[5] = "010-4411-7151";		// 수신 번호
			arr[6] = "0";		// 수신 번호
			String responseXml = api.send(arr);
			System.out.println("response xml : \n" + responseXml);
		}
	}
	
	@Scheduled(cron = "0 0 7 * * *")
	public void getTodayNotyList(){
		List scheduleList = new ArrayList<ScheduleView>();
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		scheduleList = mapper.selectScheduleListByDate(format.format(date));
		sendNotify(scheduleList);
	}

}
