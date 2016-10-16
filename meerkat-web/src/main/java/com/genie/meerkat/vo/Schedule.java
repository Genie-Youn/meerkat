package com.genie.meerkat.vo;

import java.sql.Date;

public class Schedule {
	
	private String seqSchedule;
	private String seqUser;
	private Date date;
	private String startTime;
	private String endTime;
	
	public Schedule() {
		
	}
	
	public Schedule(String seqUser, Date date, String startTime, String endTime) {
		super();
		this.seqUser = seqUser;
		this.date = date;
		this.startTime = startTime;
		this.endTime = endTime;
	}

	public String getSeqSchedule() {
		return seqSchedule;
	}

	public void setSeqSchedule(String seqSchedule) {
		this.seqSchedule = seqSchedule;
	}

	public String getSeqUser() {
		return seqUser;
	}

	public void setSeqUser(String seqUser) {
		this.seqUser = seqUser;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "Schedule [seqSchedule=" + seqSchedule + ", seqUser=" + seqUser + ", date=" + date + ", startTime="
				+ startTime + ", endTime=" + endTime + "]";
	}
}
