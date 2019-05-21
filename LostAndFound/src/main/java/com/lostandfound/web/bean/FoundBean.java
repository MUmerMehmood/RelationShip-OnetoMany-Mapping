package com.lostandfound.web.bean;

import java.sql.Blob;
import java.sql.Date;
import java.sql.Time;

public class FoundBean {
	private String whatFounded;
	private Date _date;
	private Time _time;
	private String foundLocation;
	private Blob image;
	private String founderEmail;
	
	public FoundBean() {
		super();
	}

	public FoundBean(String whatFounded, Date _date, Time _time, String foundLocation, Blob image,
			String founderEmail) {
		super();
		this.whatFounded = whatFounded;
		this._date = _date;
		this._time = _time;
		this.foundLocation = foundLocation;
		this.image = image;
		this.founderEmail = founderEmail;
	}

	public String getWhatFounded() {
		return whatFounded;
	}

	public void setWhatFounded(String whatFounded) {
		this.whatFounded = whatFounded;
	}

	public Date get_date() {
		return _date;
	}

	public void set_date(Date _date) {
		this._date = _date;
	}

	public Time get_time() {
		return _time;
	}

	public void set_time(Time _time) {
		this._time = _time;
	}

	public String getFoundLocation() {
		return foundLocation;
	}

	public void setFoundLocation(String foundLocation) {
		this.foundLocation = foundLocation;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public String getFounderEmail() {
		return founderEmail;
	}

	public void setFounderEmail(String founderEmail) {
		this.founderEmail = founderEmail;
	}
	
	

}
