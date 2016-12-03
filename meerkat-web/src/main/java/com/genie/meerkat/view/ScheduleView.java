package com.genie.meerkat.view;

public class ScheduleView {

	private String scheduleSeq;
	private String userId;
	private String date;
	private String startTime;
	private String endTime;
	private String userName;
	private String phoneNumber;
	
	public String getScheduleSeq() {
		return scheduleSeq;
	}
	public void setScheduleSeq(String scheduleSeq) {
		this.scheduleSeq = scheduleSeq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
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
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "ScheduleView [scheduleSeq=" + scheduleSeq + ", userId=" + userId + ", date=" + date + ", startTime="
				+ startTime + ", endTime=" + endTime + ", userName=" + userName + ", phoneNumber=" + phoneNumber + "]";
	}
}
